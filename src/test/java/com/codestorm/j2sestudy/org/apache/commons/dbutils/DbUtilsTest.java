package com.codestorm.j2sestudy.org.apache.commons.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

public class DbUtilsTest {

	public static class Clazz1 {
		private int field1;
		private String field2;

		public int getField1() {
			return field1;
		}

		public void setField1(int field1) {
			this.field1 = field1;
		}

		public String getField2() {
			return field2;
		}

		public void setField2(String field2) {
			this.field2 = field2;
		}

	}

	public static Connection getConnection() {
		/*
		 * Connection conn = null;
		 * 
		 * try { String url =
		 * "jdbc:mysql://127.0.0.1:3306/test?user=root&password=&characterEncoding=utf-8";
		 * 
		 * conn = DriverManager.getConnection(url); } catch (SQLException e) {
		 * e.printStackTrace(); } return conn;
		 */

		Connection conn = null;

		try {
			String url = "jdbc:mysql://127.0.0.1:3306/test?characterEncoding=utf-8";

			conn = DriverManager.getConnection(url, "root", "");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	@Test
	public void testQuery() {

		Connection conn = DbUtilsTest.getConnection();

		QueryRunner qr = new QueryRunner();

		try {
			List<Clazz1> list = qr.query(conn, "select field1,field2 from clazz1 where field1 in(?,?)",
					new BeanListHandler<Clazz1>(Clazz1.class), "13", 14);

			for (Clazz1 clazz1 : list) {
				System.out.println(clazz1.getField1() + " " + clazz1.getField2());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DbUtils.close(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Test
	public void testQueryByResultSetHandler() {

		Connection conn = DbUtilsTest.getConnection();

		QueryRunner qr = new QueryRunner();

		ResultSetHandler<List<Clazz1>> handler = new ResultSetHandler<List<Clazz1>>() {

			public List<Clazz1> handle(ResultSet rs) throws SQLException {

				List<Clazz1> results = new ArrayList<Clazz1>();

				if (!rs.next()) {
					return results;
				}

				do {
					Clazz1 clazz1 = new Clazz1();
					clazz1.setField1(rs.getInt(1));
					clazz1.setField2(rs.getString(2));

					results.add(clazz1);
				} while (rs.next());

				return results;
			}

		};

		try {
			/*
			 * List<Clazz1> list = qr.query(conn,
			 * "select field1,field2 from clazz1 where field1 in(?,?)", handler,
			 * "13", 14);
			 */

			List<Clazz1> list = qr.query(conn, "select field1,field2 from clazz1", handler);

			for (Clazz1 clazz1 : list) {
				System.out.println(clazz1.getField1() + " " + clazz1.getField2());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DbUtils.close(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Test
	public void testInsert() {

		Connection conn = getConnection();

		QueryRunner qr = new QueryRunner();
		try {
			qr.update(conn, "insert into clazz1 values(?,?)", 123, "32");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DbUtils.close(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Test
	public void testUpdate() {
		Connection conn = getConnection();

		QueryRunner qr = new QueryRunner();
		try {
			qr.update(conn, "update clazz1 set field1=? where field2=?", 432, "32");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				DbUtils.close(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}

package com.codestorm.j2sestudy.java.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Test;

public class JDBCTest {
	@Test
	public void test1() {
		Connection conn = null;
		PreparedStatement ps = null;
		// MySQL的JDBC URL编写方式：jdbc:mysql://主机名称：连接端口/数据库的名称?参数=值
		// 避免中文乱码要指定useUnicode和characterEncoding
		// 执行数据库操作之前要在数据库管理系统上创建一个数据库，名字自己定，
		// 下面语句之前就要先创建javademo数据库
		String url = "jdbc:mysql://localhost:3306/test?user=root&password=&useUnicode=true&characterEncoding=UTF8";

		try {
			// 之所以要使用下面这条语句，是因为要使用MySQL的驱动，所以我们要把它驱动起来，
			// 可以通过Class.forName把它加载进去，也可以通过初始化来驱动起来，下面三种形式都可以
			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("成功加载MySQL驱动程序");
			conn = DriverManager.getConnection(url);

			/*
			 * String sql = "insert into tab values(1)";
			 * conn.setAutoCommit(false); ps = conn.prepareStatement(sql); for
			 * (int i = 1; i < 65536; i++) { ps.addBatch(); // 1w条记录插入一次 if (i %
			 * 10000 == 0) { ps.executeBatch(); conn.commit(); } }
			 * ps.executeBatch(); conn.commit();
			 */

			String sql = "insert into tab values(1)";
			ps = conn.prepareStatement(sql);
			for (int i = 1; i < 65536; i++) {
				// 1w条记录插入一次
				ps.execute();
			}

		} catch (SQLException e) {
			System.out.println("MySQL操作错误");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}

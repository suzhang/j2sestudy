package com.codestorm.j2sestudy.refactor.chapter1;

public class Rental {
	private Movie movie;

	private int daysRented;

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public int getDaysRented() {
		return daysRented;
	}

	public void setDaysRented(int daysRented) {
		this.daysRented = daysRented;
	}

}

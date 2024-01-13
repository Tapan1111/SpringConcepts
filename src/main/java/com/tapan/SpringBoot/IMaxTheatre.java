package com.tapan.SpringBoot;

public class IMaxTheatre {

	// BahubaliMovie bahubaliMovie;
//	public IMaxTheatre(BahubaliMovie bahubaliMovie) {
//		this.bahubaliMovie = bahubaliMovie;
//	}
//	HarryPotter harryPotter;
//
//	public IMaxTheatre(HarryPotter harryPotter) {
//		super();
//		this.harryPotter = harryPotter;
//	}
	Movie movie;

	public IMaxTheatre(Movie movie) {
		super();
		this.movie = movie;
	}

	public void playMovie() {
		movie.DirectorName();
		movie.heroinName();
		movie.heroName();
		movie.movieName();
	}

}

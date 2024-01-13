package com.tapan.SpringBoot;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringBootApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LearnSpringBootApplication.class, args);

////		BahubaliMovie bahubalimovie = new BahubaliMovie();
//		HarryPotter harryPotter = new HarryPotter();
		HarryPotter movie = new HarryPotter();
		BahubaliMovie bMovie = new BahubaliMovie();
		Titanic tMovie = new Titanic();

		IMaxTheatre theatre = new IMaxTheatre(tMovie);
		theatre.playMovie();
	}

}

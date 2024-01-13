package com.tapan.SpringBoot;

public class HarryPotter implements Movie {

	@Override
	public void movieName() {
		System.out.println("HarryPotter and Haalf Blood Prince.");
	}

	@Override
	public void heroinName() {
		System.out.println("Emma Watson");
	}

	@Override
	public void DirectorName() {
		System.out.println("J.K Rowlling");
	}

	@Override
	public void heroName() {
		System.out.println("Danial Radcliff");
	}

}

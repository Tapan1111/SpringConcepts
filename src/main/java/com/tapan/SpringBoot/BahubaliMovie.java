package com.tapan.SpringBoot;

public class BahubaliMovie implements Movie {

	@Override
	public void movieName() {
		System.out.println("BahubaliBahubali...");
	}

	@Override
	public void heroName() {
		System.out.println("Prabhas");
	}

	@Override
	public void heroinName() {
		System.out.println("Tammanaa");
	}

	@Override
	public void DirectorName() {
		System.out.println("Rajamauli");
	}

}

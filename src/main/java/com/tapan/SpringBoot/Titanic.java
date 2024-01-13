package com.tapan.SpringBoot;

public class Titanic implements Movie {

	@Override
	public void movieName() {
		System.out.println("Titanic Bada Ship Jo Doob Gaya");
	}

	@Override
	public void heroinName() {
		System.out.println("Rose Beautiful");
	}

	@Override
	public void DirectorName() {
		System.out.println("Tapan Behera");
	}

	@Override
	public void heroName() {
		System.out.println("Leonardo DeCaprio");
	}

}

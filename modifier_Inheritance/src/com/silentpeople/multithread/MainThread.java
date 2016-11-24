package com.silentpeople.multithread;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avarta park = new Avarta("SSyang!!");
		Avarta choi = new Avarta("SSyang^2!!");

		park.start();
		choi.start();
	}
	
}

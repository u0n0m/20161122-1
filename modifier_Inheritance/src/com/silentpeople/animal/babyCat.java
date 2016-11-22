package com.silentpeople.animal;

public class babyCat extends cat{
	int babyAge = age1;
	
	public void babyCatAgePrint() {
		catAgePrint();
	}
	
	@Override
	public void catAgePrint() {
		// TODO Auto-generated method stub
		System.out.print(age1*12+"°³¿ù");
		//super.catAgePrint();
	}
	
	
	
}

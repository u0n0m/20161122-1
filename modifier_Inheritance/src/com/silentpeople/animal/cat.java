package com.silentpeople.animal;

public class cat {
	public int age1 = 1;
	protected int age2 = 2;
	int age3 = 3;
	private int age4 = 4;
	
	public void catAgePrint() {
		System.out.println(age1);
		System.out.println(age2);
		System.out.println(age3);
		System.out.println(age4);
	}
	protected void catAgePrint2() {
		System.out.println(age1);
		System.out.println(age2);
		System.out.println(age3);
		System.out.println(age4);
	}
	void catAgePrint3() {
		System.out.println(age1);
		System.out.println(age2);
		System.out.println(age3);
		System.out.println(age4);
	}
	private void catAgePrint4() {
		System.out.println(age1);
		System.out.println(age2);
		System.out.println(age3);
		System.out.println(age4);
	}
	
	public void test(){
		catAgePrint();
		catAgePrint2();
		catAgePrint3();
		catAgePrint4();
	}
	
}

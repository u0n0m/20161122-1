package com.silentpeople.animal;

public class animalHospital {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		cat cat1 = new cat();
		System.out.println(cat1.age1);
		System.out.println(cat1.age2);
		System.out.println(cat1.age3);
		//System.out.println(cat1.age4);
		
		cat cat2 = new cat();
		cat2.catAgePrint();
		cat2.catAgePrint2();
		cat2.catAgePrint3();
//		cat2.catAgePrint4();
		
		cat adult_cat1 = new cat();
		adult_cat1.catAgePrint();
		
		babyCat baby_cat1 = new babyCat();
		baby_cat1.catAgePrint();
		
		
		System.out.println("AAA"); //AAA<end>

	}
/*
	@Override
	public void println(String str1){
		String str1;
		this.str1 = str1+"<end>"; 
		super.println(this.str1);
	}*/
	
	
}

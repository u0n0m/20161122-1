package com.silentpeople.generic;


class Car<T> {
	private T description;
	public void carInfoPrint() {
		System.out.println(description);
		
	}
	public T getDescription() {
		return description;
	}
	public void setDescription(T description) {
		this.description = description;
	}
}


public class genericTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car<Integer> truck1 = new Car<Integer>();
		truck1.setDescription(100);
		truck1.carInfoPrint();
		
		Car<String> bungbung = new Car<String>();
		bungbung.setDescription("ºØºØ ÀÚµ¿Â÷");
		bungbung.carInfoPrint();
	}

}

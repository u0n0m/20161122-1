package com.silentpeople.overloading_Ex;

public class overloadTestChild extends overloadTest{

	public void overMethod() {
		System.out.println("overMethod_child");
	}
	
	public void overMethod(int num) {
		System.out.println("overMethod_child " + num);
	}
	
	public void overMethod(String name) {
		System.out.println("overMethod_child " + name);
	}
	
	public void overMethod(int num, String name) {
		System.out.println("overMethod_child " + num + " & " + name);
	}
	
	
}

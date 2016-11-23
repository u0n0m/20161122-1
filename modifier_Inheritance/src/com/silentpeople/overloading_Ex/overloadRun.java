package com.silentpeople.overloading_Ex;

public class overloadRun {
	public static void main(String[] args) {
		overloadTest over1 = new overloadTest();
		over1.overMethod();
		over1.overMethod(10);
		over1.overMethod("babo");
		over1.overMethod(20, "haha");
		
		overloadTestChild over2 = new overloadTestChild();
		over2.overMethod();
		over2.overMethod(10);
		over2.overMethod("babo");
		over2.overMethod(20, "haha");
		
		overloadTest over3 = new overloadTestChild();
		over3.overMethod();
		over3.overMethod(10);
		over3.overMethod("babo");
		over3.overMethod(20, "haha");
		
	}
}

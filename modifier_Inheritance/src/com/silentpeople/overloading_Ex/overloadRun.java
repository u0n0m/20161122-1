package com.silentpeople.overloading_Ex;

public class overloadRun {
	public static void main(String[] args) {
		overloadTest over1 = new overloadTest();
		over1.overMethod();
		over1.overMethod(10);
		over1.overMethod("babo");
		over1.overMethod(20, "haha");
	}
}

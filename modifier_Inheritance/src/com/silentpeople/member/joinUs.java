package com.silentpeople.member;

public abstract class joinUs {

	public abstract boolean checkId(String name) ;
	public abstract boolean checkAge(int age);

	public boolean checkEmail(String email){
		if(email.contains("@")) {
			return true;
		}
		else{
			return false;
		}
	}
}
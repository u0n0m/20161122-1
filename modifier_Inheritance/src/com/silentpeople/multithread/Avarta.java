package com.silentpeople.multithread;

public class Avarta extends Thread {
	String name;
	
	public Avarta(String name){
		System.out.println("Thread Created!!");
		this.name = name;
	}
	
	public void attack() {
		for(int count=0; count<10000; count++){
			System.out.println(getName()+": Attack"+count);	
		}		
	}
			  
}

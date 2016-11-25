package com.silentpeople.multithread;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avarta park = new Avarta("SSyang!!");
		//Avarta choi = new Avarta("youdie!!");
		rockScissorsPaper rsp = new rockScissorsPaper();
		
		park.start();
		try {
		    Thread.sleep(4000);
		} catch (InterruptedException e ) { 
			System.out.println("Sleep Error");
		}
		
		rsp.start();
		//choi.start();		
	}
	
}

package com.silentpeople.multithread;

public class rockScissorsPaper extends Thread{
	
	public void run() {
		for(int i=0;i<10000;i++){
			System.out.println("rock\n");
			System.out.println("Scissors\n");
			System.out.println("Paper\n");
			try {
			      Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	} 
	
}

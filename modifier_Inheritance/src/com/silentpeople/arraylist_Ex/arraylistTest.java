package com.silentpeople.arraylist_Ex;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylistTest {
	private static ArrayList<Integer> arrlist1;
	Integer [] array1 = {1,2,3,4,5};
	
	public void run1() {
		arrlist1 = new ArrayList<Integer>();
		arrlist1.add(1);
		arrlist1.add(2);
		arrlist1.add(3);
		arrlist1.add(4);
		arrlist1.add(5);
		System.out.println("ArrayList\n");
		for(int i=0;i<arrlist1.size();i++){
			System.out.println(arrlist1.get(i));
		}
		System.out.println(arrlist1.size());
		
		Iterator i_arrlist1 = (Iterator)arrlist1.iterator();
		while(i_arrlist1.hasNext()){
			System.out.println(i_arrlist1.next());
		}
		
		
/*		System.out.println("ArrayList\n");
		System.out.println(arrlist1.get(0));
		System.out.println(arrlist1.get(1));
		System.out.println(arrlist1.get(2));
		System.out.println(arrlist1.get(3));
		System.out.println(arrlist1.get(4));*/
		arrlist1.add(6);
		System.out.println("ArrayList\n");
		for(int i=0;i<arrlist1.size();i++){
			System.out.println(arrlist1.get(i));
		}
		System.out.println(arrlist1.size());
//		System.out.println(arrlist1.get(5));
		System.out.println("arraylist size: " + arrlist1.size());
		arrlist1.remove(3);
		System.out.println("ArrayList\n");
		for(int i=0;i<arrlist1.size();i++){
			System.out.println(arrlist1.get(i));
		}
		System.out.println(arrlist1.size());
		
/*		System.out.println("ArrayList\n");
		System.out.println(arrlist1.get(0));
		System.out.println(arrlist1.get(1));
		System.out.println(arrlist1.get(2));
		System.out.println(arrlist1.get(3));
		System.out.println(arrlist1.get(4));
		System.out.println(arrlist1.get(5));
		*/
		System.out.println("\nArray\n");
		System.out.println(arrlist1.get(0));
		System.out.println(arrlist1.get(1));
		System.out.println(arrlist1.get(2));
		System.out.println(arrlist1.get(3));
		System.out.println(arrlist1.get(4));
		//베열의 크기를 늘리거나 줄일 수 없다.
		
	}
	
	   
	
	
}

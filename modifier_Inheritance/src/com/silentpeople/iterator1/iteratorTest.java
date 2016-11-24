package com.silentpeople.iterator1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class iteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs1 = new HashSet<Integer>(); 
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		hs1.add(5);
		hs1.add(3);
		hs1.add(1);
		Iterator i_hs1 = (Iterator)hs1.iterator();
		while(i_hs1.hasNext()){
			System.out.println(i_hs1.next());
		}
		
		ArrayList<Integer> arrlist1;
		arrlist1 = new ArrayList<Integer>();
		arrlist1.add(1);
		arrlist1.add(2);
		arrlist1.add(3);
		arrlist1.add(4);
		arrlist1.add(5);
		Iterator i_al1 = (Iterator)arrlist1.iterator();
		while(i_al1.hasNext()){
			System.out.println(i_al1.next());
		}
		
		
/*		for(int i=0;i<arrlist1.size();i++){
			System.out.println(arrlist1.get(i));
		}*/
		
		
	}

}

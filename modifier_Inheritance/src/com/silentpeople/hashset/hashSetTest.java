package com.silentpeople.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetTest {

	public static void main(String [] args) {
		
		HashSet<Integer> hs1 = new HashSet<Integer>(); 
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		hs1.add(5);
		hs1.add(3);
		hs1.add(1);
		
/*		for(int i=0;i<hs1.size();i++) {
			System.out.println(hs1.toString());
		}*/
		
		Iterator i_hs1 = (Iterator)hs1.iterator();
		while(i_hs1.hasNext()){
			System.out.println(i_hs1.next());
		}
		
		
		
	}
}

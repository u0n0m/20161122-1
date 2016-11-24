package com.silentpeople.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> fruitPrice = new HashMap<String, Integer>();
		fruitPrice.put("apple", 1500);
		fruitPrice.put("banana", 900);
		fruitPrice.put("lemon", 2000);
		fruitPrice.put("orange", 1300);
		
		System.out.println(fruitPrice);
		
		System.out.println(fruitPrice.get("lemon"));
		
		Set entrySet = fruitPrice.entrySet();
		
		Iterator i_entry = entrySet.iterator();
		while(i_entry.hasNext()){
			System.out.println(i_entry.next());
		}
		
		Set keySet = fruitPrice.keySet();
		Iterator i_key = keySet.iterator();
		while(i_key.hasNext()){
			System.out.println(i_key.next());
		}
		
		
		
		
	}

}

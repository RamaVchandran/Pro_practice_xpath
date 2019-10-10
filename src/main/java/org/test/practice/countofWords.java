package org.test.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class countofWords {

	public static void main(String[] args) {
		String name = "Welcome";
		char[] c= name.toCharArray();
		Map<Character,Integer> emp = new LinkedHashMap<Character,Integer>();
			for (char d : c) {
				if(emp.containsKey(d)) {
					int count = emp.get(d);
					emp.put(d, count+1);
				}else {
					emp.put(d, 1);
				}
				
			}
			System.out.println(emp);
		}
	}



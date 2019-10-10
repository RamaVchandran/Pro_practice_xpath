package org.test.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCount {

	public static void main(String[] args) {
		String name = "Welcome to Java";
		String[] x= name.split(" ");
		Map<String,Integer> emp = new LinkedHashMap<String,Integer>();
		for (String c : x) {
			if(emp.containsKey(c)) {
				int count = emp.get(c);
				emp.put(c, count+1);
			}else {
				emp.put(c, 1);
			}
			
		}
System.out.println(emp);
	}



	}



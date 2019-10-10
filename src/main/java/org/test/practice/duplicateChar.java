package org.test.practice;

public class duplicateChar {
	public static void main(String[] args) {
		String name = "Welcommme"; String res= " ";
		for(int i=0; i<name.length();i++) {
			if(!res.contains(String.valueOf(name.charAt(i)))) {
				res = res + String.valueOf(name.charAt(i));
			}
		}
		System.out.println(res);
	}

}

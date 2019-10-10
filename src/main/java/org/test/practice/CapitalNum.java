package org.test.practice;

public class CapitalNum {

	public static void main(String[] args) {
		String name = "Welcome to java class";
		String res =" ";
		String[] x = name.split(" ");
		for (String v : x) {
			char ch = v.charAt(0);
			Character c = Character.toUpperCase(ch);
			String rem = v.substring(1);
			res = res+c+rem+" ";
		}
		System.out.println(res.trim());
	}

}

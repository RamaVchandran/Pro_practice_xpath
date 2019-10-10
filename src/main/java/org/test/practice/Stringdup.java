package org.test.practice;

public class Stringdup {

	public static void main(String[] args) {
		String name = "Welcome to java java sql plsql";
		String res = " ";
		String[] x =name.split(" ");
		for (String s : x) {
			if(!res.contains(s)) {
				res = res+ s+" ";
			}
		}
		System.out.println(res);
	}

}

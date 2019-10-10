package org.test.practice;

public class Reversestrings {

	public static void main(String[] args) {
		String name ="Welcome to java Class"; String res =" ";
		
		String[] x = name.split(" ");
		for(int i=x.length-1;i>=0;i--) {
			System.out.print(x[i]);
		}
		
	}

}

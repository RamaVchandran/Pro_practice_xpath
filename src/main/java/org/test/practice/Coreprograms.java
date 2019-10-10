package org.test.practice;

public class Coreprograms {
	
	public static void main(String[] args) {
		String name = "Welcome"; String res= " ";
		for(int i=name.length()-1;i>=0;i--) {
			   char c = name.charAt(i);
			   res = res+c;
		}
		
		System.out.println(res);
	}

}

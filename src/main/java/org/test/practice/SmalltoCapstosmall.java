package org.test.practice;

public class SmalltoCapstosmall {

	public static void main(String[] args) {
		String name ="WElComE";
		StringBuffer b =new StringBuffer(name);
		for(int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			if(Character.isUpperCase(ch)) {
				b.setCharAt(i, Character.toLowerCase(ch));
			
			}else {
				b.setCharAt(i, Character.toUpperCase(ch));
			}
		}
		System.out.println(b);
	}

}

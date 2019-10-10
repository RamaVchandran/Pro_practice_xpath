package org.test.practice;

public class PrintDigitalone {

	public static void main(String[] args) {
		String name = "Rama@12345"; String res =" ";
		for(int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			if(Character.isDigit(ch)) {
				System.out.print(ch);
			}else {
				if(Character.isAlphabetic(ch)) {
					System.out.println(ch);
				}
				
			}
			
		}

	}

}

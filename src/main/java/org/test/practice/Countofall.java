package org.test.practice;

public class Countofall {

	public static void main(String[] args) {
		String name ="Welcome to java Class @12345";
		int sCount=0;
		int CCount=0;
		int nCount=0;
		int spCount=0;
		for(int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			if(Character.isLowerCase(ch)) {
				sCount++;
			}else {
				if(Character.isUpperCase(ch)) {
					CCount++;
				}else {
					if(Character.isDigit(ch)) {
						nCount++;
					}else {
						spCount++;
					}
				}
			}
		}
		System.out.println(sCount);
		System.out.println(CCount);
		System.out.println(nCount);
		System.out.println(sCount);
	}

}

package org.test.practice;

public class Ascii {

	public static void main(String[] args) {
		String name ="Welcome to java Class @12345";
		int sCount=0;
		int CCount=0;
		int nCount=0;
		int spCount=0;
		for(int i=0;i<name.length();i++) {
		char ch = name.charAt(i);
		if(ch>= 65 && ch<=90) {
			sCount++;
		}else {
			if(ch>=97 && ch<=122) {
				CCount++;
			}else {
				if(ch>=48 && ch<=57) {
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
		System.out.println(spCount);

	}

}

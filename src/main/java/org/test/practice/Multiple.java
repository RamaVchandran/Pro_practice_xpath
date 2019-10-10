package org.test.practice;

public class Multiple implements FullAbstract,Intreface {

	public void test1() {
		System.out.println("its test1");
		
	}

	public void test2() {
		System.out.println("its test2");
		
	}

	public void test3() {
		System.out.println("its test3");
		
	}
	
	public static void main(String[] args) {
		Multiple m = new Multiple();
		m.test1();
		m.test2();
		m.test3();
	}

}

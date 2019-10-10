package org.test.practice;

public class executeinterface implements FullAbstract {

	public void test1() {
		System.out.println("full1");
		
	}

	public void test2() {
		System.out.println("Full2");
		
	}

	public void test3() {
		System.out.println("Full3");
		
	}
	
	public static void main(String[] args) {
		executeinterface e = new executeinterface();
		e.test1();
		e.test2();
		e.test3();
	}
	

}

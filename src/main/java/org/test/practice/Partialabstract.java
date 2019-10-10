package org.test.practice;

public class Partialabstract extends parAbs {

	@Override
	protected void test1() {
		System.out.println("test one");
		
	}

	@Override
	protected void test2() {
		System.out.println("test two");
		
	}
	
	public static void main(String[] args) {
		Partialabstract pa = new Partialabstract();
		pa.test1();
		pa.test2();
		pa.test3();
	}
	

}

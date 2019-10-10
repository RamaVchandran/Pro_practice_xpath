package org.test.practice;

public class Overide extends Poly {
	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("Rama");
	}
	@Override
	public void test2(int id) {
		// TODO Auto-generated method stub
		System.out.println("id is "+id);
	
	}
	
	public static void main(String[] args) {
		Overide O = new Overide();
		O.test1();
		O.test2(30);
	}

	}



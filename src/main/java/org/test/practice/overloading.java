package org.test.practice;

public class overloading {
	
	public void test1() {
		System.out.println("testone");

	}
	
	public void test1(int id) {
		System.out.println("5"+id);

	}
	
	public  void test1(int id,String name,long phone ) {
		System.out.println("id is"+id);
		System.out.println("name is"+name);
		System.out.println("phone is"+phone);

	}
	
	public void test1(String project,String manager) {		
		System.out.println("project is "+project);
		System.out.println("my manager is"+manager);
		

	}
	
	public static void main(String[] args) {
		
		overloading one = new overloading();
		one.test1();
		one.test1(20);
		one.test1("Dinsey", "Srini");
		one.test1(30, "rama",900320951);
		
	}
	

}

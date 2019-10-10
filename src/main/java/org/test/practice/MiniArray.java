package org.test.practice;

public class MiniArray {

	public static void main(String[] args) {
		int a[] = {100,10,20,30,20,0,7}; int temp =0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j] = temp;
				}
			}
			
		}
		System.out.println(a[2]);
for (int i : a) {
	System.out.println(i);
}
		
		
	}

}

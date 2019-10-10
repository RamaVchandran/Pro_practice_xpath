
package org.test.practice;

public class AddExtraVowels {
	
	public static void main(String[] args) {
		String name="Greens technology";
	String[] x = name.split(" ");
	String s1 = x[0];
	String s2 = x[1];
	String res = " ";
	    for(int i = 0; i <= s2 .length(); i++)
	    {
	    	res = res+s2.charAt(i);
	        char vowel = s2.charAt(i);
	        if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u')
	        {
	        	res = res+s2.charAt(i);
	        }
	        
	    }
	  System.out.println(res);
	}
}


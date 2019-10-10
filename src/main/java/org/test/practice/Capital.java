package org.test.practice;

public class Capital {

	public static void main(String[] args) {
		String name = "welcome to java"; String res=" ";
		String [] x = name.split(" ");
		for (String st : x) {
			Character ch = st.charAt(0);
			char first = Character.toUpperCase(ch);
			String rem = st.substring(1);
	res = res+first+rem+" ";
}
		System.out.println(res.trim());
	}

}

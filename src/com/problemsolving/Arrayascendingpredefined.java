package com.problemsolving;

import java.util.Arrays;

public class Arrayascendingpredefined {

	public static void main(String[] args) {
		//
		// int a[] = { 57, 87, 35, 79, 19, 35, 87, 234 };
		//
		// int l= a.length;
		// System.out.println(l);
		//
		// Arrays.sort(a);
		//
		//
		// for(int i = 0; i<a.length; i++){
		//
		// System.out.println(a[i]);
		//
		// }

		String s1 = "Mukesh";
		String s2 = "Ms Dhoni";
		
		String ss = s1.substring(1,5);
		
		System.out.println(ss);
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		

		s1 = s1 + s2;
		
		System.out.println(s1);
		
		//s1 = "MukeshMs Dhoni";
		
		s2 = s1.substring(0, s1.length()-s2.length());
		
		System.out.println(s2);
		
		s1 = s1.substring(s2.length());
		
		System.out.println(s1);
		//

	}

}

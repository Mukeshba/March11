package com.problemsolving;

public class printtables {

	public static void main(String[] args) {

		int count = 0;

		for (int i = 1; i <= 100 ; i++) {

			if (i % 2 != 0) {

				count++;

			}

		}
		
		System.out.println("Count of odd numbers presented from 0 to 101 is "+count);

		// for (int i = 0; i <=10; i++) {
		//
		//
		// System.out.println("5 * "+i+" = "+ 5*i);
		//
		// }
		//
	}

}

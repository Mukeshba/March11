package com.problemsolving;

public class productofint {

	public static void main(String[] args) {

		int input = 6789;

		int output = 1;

		int lastdigit = 0;

		int n = input;

		while (input > 0) {

			lastdigit = input % 10;

			output = output*lastdigit ;

			input = input / 10;

		}
		
		System.out.println(output);

	}

}

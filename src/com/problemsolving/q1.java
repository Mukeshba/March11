package com.problemsolving;

public class q1 {

	public static void main(String[] args) {

		int input = 56789;

		int temp;

		String output = "";
		
		
		
		
		while (input>0) {
			
			temp = input%10;
			
			output = output+""+temp;
			
			input = input/10;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		while (input > 0) {
//
//			temp = input % 10;
//
//			output = output * temp;
//
//			input = input / 10;
//
//		}
//		
		
		System.out.println(output);

	}

	// to find the sum of the given input

	// int input = 4578;
	//
	// int output = 0;
	//
	// int temp;
	//
	// while (input > 0) {
	//
	// temp = input % 10;
	//
	// output = output + temp;
	//
	// input = input / 10;
	//
	// }
	//
	// System.out.println(output);
	//
	// }

	// Sum of even numbers from 1 to 101

	// int output = 0;
	//
	//
	// for (int i = 1; i <= 101; i++) {
	//
	// if (i%2==0) {
	//
	// output = output+i;
	//
	// }
	//
	//
	//
	// }
	//
	//
	// System.out.println(output);
	// }

}

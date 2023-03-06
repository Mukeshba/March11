package com.problemsolving;

public class Upperlowerdigitcasecount {

	public static void main(String[] args) {

		String str = "Bmukesh412@gmail.com";

		String Up = "";
		String lw = "";
		String di = "";
		String sp = "";
		int Upc = 0;
		int lwc = 0;
		int dic = 0;
		int spc = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {

				Upc++;
				Up = Up + ch + " ";

			}

			else if (Character.isLowerCase(ch)) {

				lwc++;

				lw = lw + ch + " ";

			}

			else if (Character.isDigit(ch)) {

				dic++;
				di = di + ch + " ";

			}

			else {

				spc++;

				sp = sp + ch + " ";
			}

		}

		System.out.println("Count of lower case = " + lwc);

		System.out.println("Lower case char = " + lw);

		System.out.println("Count of Upper case = " + Upc);

		System.out.println("Upper case char = " + Up);

		System.out.println("Count of digits  = " + dic);

		System.out.println("Digits = " + di);

		System.out.println("Count of Sepcial ch  = " + spc);

		System.out.println("Special char = " + sp);

	}

}

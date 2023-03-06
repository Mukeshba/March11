package com.problemsolving;

public class Reverse {

	public static void main(String[] args) {

		String st = "MSDhoni is the greatest finisher of all time";

		String[] split = st.split(" ");

		System.out.println(split);

		String restore = "";

		for (String s : split) {

			String rev = "";

			for (int i = s.length() - 1; i >= 0; i--) {

				char c = s.charAt(i);

				rev = rev + c;

			}

			restore = restore + rev + " ";

		}

		System.out.println(restore.trim());

	}

}

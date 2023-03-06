package com.problemsolving;

import java.util.Scanner;

public class sample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	int	count = 0;
		int num = s.nextInt();
		
		for (int i = 1; i <= num; i++) {
			
			if (num%i==0) {
				
				count++;
				
			}
		}
			if (count==2) {
				
				System.out.println("It is  a prime number");
				
			} else {
				
				System.out.println("It is not prime number");

			}
			
		}
	}



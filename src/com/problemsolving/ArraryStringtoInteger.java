package com.problemsolving;

public class ArraryStringtoInteger {
	
	public static void main(String[] args) {
		
		String st[] = { "Mukesh", "Dhoni", "ViratKholi", "18", "7", "45" };
		
		for (String s : st) {
			
			try {
				int i = Integer.parseInt(s);
				
				System.out.println(i);
				
				
			}
			
			catch (Exception e) {
				// TODO: handle exception
			}
		
			
		}
		
	}



}

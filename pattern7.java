package com.Pattern;

import java.util.Scanner;

public class pattern7 {

	/*
	    1 1 1 1 1 
		2 2 2 2 2 
		1 1 1 1 1 
		2 2 2 2 2 
		1 1 1 1 1 
	 */



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		pattern(num);
	}


		public static void pattern(int num) 
		{
			for(int row =1; row<=num; row++) 
			{
				for(int col=1; col<=num;col++) 
				{
					if(col%2==1) {
						System.out.print("A ");
					}
					else {
						System.out.print("Z ");
					}
					
				
				}
				System.out.println();
			
			}
		}
		
	
}



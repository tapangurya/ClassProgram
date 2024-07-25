package com.Pattern;

			/*
				1   0 
				 0 1  
				 0 1  
				1   0 
			 */

import java.util.Scanner;

public class pattern16 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt(); 
		pattern(num);

	}

	public static void pattern(int num) 
	{
		
		for(int row=1;row<=num;row++)
		{ 
			
			for(int col=1; col<=num;col++)	
			{
				if((row+col==num+1) || (row==col)) 
				{
					if(col%2==1) {
					System.out.print("1 ");
					}
					else 
					{
						System.out.print( "0 ");
					}
				}
				else {
					System.out.print(" ");
				}
				
				
//				
				
			}
			
			
			System.out.println();
		}
		
	}

}

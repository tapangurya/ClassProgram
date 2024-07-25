package com.Pattern;

			/*
					1 3 4 1 
					3 2 2 6 
					4 3 3 7 
					4 6 7 4  
			 */

import java.util.Scanner;

public class pattern15 {

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
					System.out.print( row+" ");
					
				}
				
				else 
				{
					System.out.print( row+col+" ");
				}
//				
				
			}
			
			
			System.out.println();
		}
		
	}

}

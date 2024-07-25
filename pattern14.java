package com.Pattern;

			/*
					1 4 6 4 
					2 2 3 8 
					2 2 3 8 
					1 4 6 4  
			 */

import java.util.Scanner;

public class pattern14 {

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
					System.out.print( col+" ");
					
				}
				
				else 
				{
					System.out.print( col*2+" ");
				}
//				
				
			}
			
			
			System.out.println();
		}
		
	}

}

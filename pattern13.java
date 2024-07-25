package com.Pattern;

			/*
					A 4 6 D 
					2 B C 8 
					2 B C 8 
					A 4 6 D 
			 */

import java.util.Scanner;

public class pattern13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt(); 
		pattern(num);

	}

	public static void pattern(int num) 
	{
		
		for(int row=1;row<=num;row++)
		{ 
			char ch = 'A';
			for(int col=1; col<=num;col++)	
			{
				if((row+col==num+1) || (row==col)) 
				{
					System.out.print( ch+" ");
					
				}
				
				else 
				{
					System.out.print(row+col+" ");
				}
				
				ch++;
			}
			
			
			System.out.println();
		}
		
	}

}

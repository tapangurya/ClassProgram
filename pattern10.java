/*
				A B C D E 
				A B C D E 
				A B C D E 
				A B C D E 
				A B C D E 
 */

package com.Pattern;

import java.util.Scanner;

public class pattern10
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num= sc.nextInt();
		 patternS(num);
	}

	public static void patternS(int num) 
	{
		
		for(int row=1; row<=num; row++) 
		{
			char ch ='A';
			for(int col=1; col<=num; col++)
			{  
				System.out.print(ch+" ");
				ch++;
			}
			
			System.out.println();
		}
		
	}

}


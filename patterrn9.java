		/*	
				A A A A 
				B B B B 
				C C C C 
				D D D D 
		*/
package com.Pattern;

import java.util.Scanner;

public class patterrn9 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num= sc.nextInt();
		 patternS(num);
	}

	public static void patternS(int num) 
	{
		char ch =65;
		for(int row=1; row<=num; row++) 
		{
			
			for(int col=1; col<=num; col++)
			{  
				System.out.print(ch+" ");
				
			}
			ch++;
			System.out.println();
		}
		
	}

}

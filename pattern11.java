package com.Pattern;
/*
					A B C D 
					E F G H 
					I J K L 
					M N O P	
 */


import java.util.Scanner;

public class pattern11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt(); 
		pattern(num);

	}

	public static void pattern(int num) 
	{
		char ch ='A';
		for(int row=1;row<=num;row++)
		{
			
			for(int col=1; col<=num;col++)
			{
				
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		
	}

}

/*
				
				A       Z 
				 Z     A  
				  A   Z   
				   Z A    
				   Z A    
				  A   Z   
				 Z     A  
				A       Z 
 */
package com.Pattern;

import java.util.Scanner;

public class pattern8 {
	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			pattern(num);

		}

		public static void pattern(int num) {
			for(int row =1; row<=num; row++) {
				for(int col=1; col<=num;col++) {
					if( (row+col==num+1) || (row==col)) {
						if(col%2==1) {
							System.out.print("A ");
						}
						else {
							System.out.print("Z ");
						}
					}
					else {
						System.out.print(" ");
					}
					
				
			}
				System.out.println();
			
		}
	}

}


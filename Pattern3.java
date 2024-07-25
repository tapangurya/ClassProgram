/*
 * 				****
 * 				*	*
 * 				*	*
 * 				****
 */
package com.Pattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		pattern(num);

	}

	public static void pattern(int num) {
		for(int row =1; row<=num; row++) {
			for(int col=1; col<=num;col++) {
				if(row==1 || row==num || col==1 || col==num ) {
					System.out.print("*");
				}
				else  {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}

}

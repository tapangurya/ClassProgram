/*
 				 - - - -
 				 * * * *
 				 * * * *
 				 * * * *
 */
package com.Pattern;
import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		pattern2(num);
	}

	public static void pattern2(int num) {
		for(int row =1; row<=num;row++) {
			for(int col=1; col<=num; col++) {
				if(row<2) {
					System.out.print("- ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
	}

}

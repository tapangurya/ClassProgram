package com.Pattern;
/*
						 * * * *
						 * * * *
						 * * * *
						 * * * *
*/
import java.util.Scanner;

public class fourByfourStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		pattern(number);

	}
	public static void pattern(int number) {
		for(int row =1; row<=number; row++) {
			for(int col =1; col<=number; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}

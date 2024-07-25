
package com.Pattern;

import java.util.Scanner;

public class pattern5 {
	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			pattern(num);

		}

		public static void pattern(int num) {
			for(int row =1; row<=num; row++) {
				for(int col=1; col<=num;col++) {
					if(row==1 || row==num  || (row+col==num+1) || (row==col)) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					
				
			}
				System.out.println();
			
		}
	}

}

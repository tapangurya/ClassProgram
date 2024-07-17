package Program_Jspider;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		happy(number);

	}

	private static void happy(int number) {
		int sum=0;
		while(number!=0) {
			int rem= number%10;
			sum= sum+rem*rem;
			number/=10;
		}
		if(sum>=10) {
			happy(sum);
		}
		else if (sum==1) {
			System.out.println("Enter number is Happy number");
		}
		else {
			System.out.println("Enter number is Not a Happy number");
		}
	}

}

package Program_Jspider;

import java.util.Scanner;

public class Program1_Emirph {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(IsPrime(num)) {
			int rev = isRev(num);
			if(IsPrime(rev)) {
				System.out.println("Emirph number");
			}
		}

	}

	private static int isRev(int num) {
		int rev =0;
		while(num!=0) {
			int d =num%10;
			rev= rev*10+d;
			num/=10;
		}
		return rev;
	}

	private static boolean IsPrime(int num) {
		int count =2;
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				count++;
			}
		}
		return count==2;
	}

}

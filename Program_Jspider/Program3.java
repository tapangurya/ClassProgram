package Program_Jspider;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		checkNumber (number);
	}

	private static void checkNumber(int n) {
		int copyOfOriginalNumber=n;
		int sum =0, prod=1;
		while(n!=0) {
			int rem= n%10;
			sum=sum+rem;
			prod=prod*rem;
			n/=10;
		}
		System.out.println(prod);
		System.out.println(sum);
		if(sum==prod) {
			System.out.println("Product: "+prod + " Original: "+copyOfOriginalNumber+" " +"\nProduct is: "+prod*copyOfOriginalNumber);
			prod = prod*copyOfOriginalNumber;
			
		}
		Happy(prod);
		
		
	}
	public static void Happy(int n) {
		int sum =0;
		while(n!=0) {
			
			int rem=n%10;
			sum= sum+rem*rem;
			n/=10;
		}
		if(sum>=10) {
			Happy(sum);
		}
		else if (sum==1) {
			System.out.println("Happy number");
		}
		else {
			System.out.println("Not Happy number");
		}
		
	}
	
}

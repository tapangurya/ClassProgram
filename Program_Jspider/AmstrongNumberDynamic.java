package Program_Jspider;

import java.util.Scanner;

public class AmstrongNumberDynamic {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int number= sc.nextInt();
		Amstrong(number);
	}
	private static void Amstrong(int num) 
	{
		int sum=0;
		int copy=num;
		int length=Length(num);
		while(num!=0) 
		{
			int rem= num%10;
			int produ= product(rem,length);
			sum= sum+produ;
			num/=10;
		}
		
		if(sum==copy) 
		{
			System.out.println("Amstrong number");
		}
		else 
		{
			System.out.println("Not a Amstrong number");
		}
	}

	private static int Length(int num) 
	{
		int count =0;
		while(num!=0) 
		{
			count++;
			num/=10;
		}
		return count;
	}

	private static int product(int rem , int length) 
	{
		int prod=1;
		for(int i=1; i<=length; i++) 
		{
			prod=prod*rem;
		}
		return prod;
	}
}

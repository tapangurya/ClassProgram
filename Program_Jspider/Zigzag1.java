package Program_Jspider;

public class Zigzag1 {
public static int reverce(int number) {
	int rev=0;
	while(number!=0) {
		int rem= number%10;
		rev= rev*10+rem;
		number/=10;
	}
	return rev;
}
public static void main(String[] args) {
	int num1 =254;
	int num2=789;
	String ans="";
	int reverced= reverce(num1);
	while(reverced!=0) {
		int rem1= reverced%10;
		int rem2= num2%10;
		ans=ans+(rem1+""+rem2);
		reverced/=10;
		num2/=10;
	}
	int x=Integer.parseInt(ans);
	System.out.println(x+1);
	
}
}

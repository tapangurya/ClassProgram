package Program_Jspider;

public class Zigzag {

	public static void main(String[] args) {
		// take 2 number
		int num1=3415;
		int num2=1435;
		// rev first number
		int rev =reverse(num1);
		System.out.println(Zigzag(rev,num2)*2);
		int zig = Zigzag(rev, num2);

	}
	private static int Zigzag(int rev, int num2) {
		int zigzag=0;
		while(rev!=0) {
			int d= rev%10;
			
			zigzag = zigzag*10+d;
			int d1 =num2%10;
			zigzag = zigzag*10+d1;
//			System.out.print(d+""+d1);
			rev/=10;
			num2/=10;
		}
		return zigzag;
	}
	private static int reverse(int num) {
		int rev= 0;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		return rev;
	}

}

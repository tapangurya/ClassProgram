public class Xylom {
    
    public static void main(String[] args) {
        int n = 834212;
        //s1: fetch last digit
        int last_digit = n%10;
        n/=10;
        
        int reversed = reverse(n);
        int first= reversed%10;
        int first_last_sum=first+last_digit;
        int mid= reversed/10;
        int mid_sum=0;
        while (mid!=0) {
            int rem= mid%10;
            mid_sum=mid_sum+rem;
            mid/=10;
            
        }
        if(mid_sum==first_last_sum){
            System.out.println("xylom number");
        }
        else{
            System.out.println("not a xylom number");
        }
        // System.out.println(mid_sum);
        // System.out.println(first_last_sum);
    }
    public static int reverse(int n){
        int rev =0;
        while (n!=0) 
        {
            int rem= n%10;
            rev=rev*10+rem;
            n/=10;
            
        }
        return rev;
    }

}

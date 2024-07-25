import java.util.Scanner;

public class ageCalculator {
     public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your dob  year ");
        int year = sc.nextInt();
        int currentDate = sc.nextInt();
        if ((year%4==0 && year%100!=0)|| (year%400==0)) 
        {
            System.out.println("leap year");
            
        }
        else{
            System.out.println("not a leap year");
        }
        int age = currentDate-year;
        System.out.println("current age: "+age);
        if(age==0){
            System.out.println("Invalid");
        }
        else if(age>0 && age<=16){
            System.err.println("child");
        }
        else if (age>16) {
            System.out.println("Adult");
        }

    }
}

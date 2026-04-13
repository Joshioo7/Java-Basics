import java.util.Scanner;


public class atom{
    public static void main(String [] args){
        Scanner TJ = new Scanner(System.in);
        System.out.println("Please enter number");
        int n = TJ.nextInt();
        int original = n;
        int reverse = 0;
        int sum = 0;
        
        if(n<=0){
            System.out.println("Please enter positive number");
        }
        else {
            while(n>0){
                int digit = n%10;
                reverse = reverse*10 + digit;
                sum = sum + digit;
                n = n/10;
            }

            System.out.println("Reverse number is  " + reverse);
            System.out.println("Sum of digits is  " + sum);

            
        

        if(original==reverse){
            System.out.println("Palindrome true");
        }else {
                System.out.println("Palindrome false");
            }
        }

    }
}
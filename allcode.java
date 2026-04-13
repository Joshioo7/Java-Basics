//Code to print reverse number , count digits in the number , sum of digits..


import java.util.Scanner;

public class allcode{

public static void main(String [] args){
    
    Scanner TJ = new Scanner(System.in);

    System.out.println("Enter Number");
    int n = TJ.nextInt();

    int original=n;
    int reverse = 0;
    int sum = 0;
    int count = 0;

    if(n<0){
        System.out.println("Please enter positive number");
    }
 else if (n==0) {
    System.out.println("Number of digits is 1");
    
    
 }else {
    while (n>0) {
        int digit = n%10;
        reverse = reverse*10 + digit;
        sum = sum+digit;
        n=n/10;
        count++;
        
    }
    
    System.out.println("Reversed number is " + reverse);
    System.out.println("Sum of digits is " + sum);
    System.out.println("Count od digits is " + count);
  
    if(reverse == original){
    System.out.println("Palindrome true");
    } else {
        System.out.println("Palindrome false");
    }



 }
}

}
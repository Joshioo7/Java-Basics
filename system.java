import java.util.Scanner;

public class java{
    public static void main(String [] args){
        Scanner TJ = new Scanner(System.in);
        System.out.println("Enter the number sir");
        int n = TJ.nextInt();
        int sum = 0;
        int count = 0;
        int original = n;
        int temp = n;

        //counting the number of digits

        while(temp>0){
            temp = temp/10; // removes last digit
            count++;
        }

        while(n>0){
            int digit = n%10; // only last digit remains
            sum = sum + (int)Math.pow(digit, count);
            n = n/10;
        }

        if(sum==original){
            System.out.println("Armstrong true");
        } else {
            System.out.println("Armstrong false");
        }
}

}
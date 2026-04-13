import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {

        Scanner TJ = new Scanner(System.in);
        System.out.println("Enter number");

        int n = TJ.nextInt();
        int original = n;
        int count = 0;
        int sum = 0;

        int temp = n;

        while(temp > 0){
            temp = temp / 10;
            count++;
        }

        while(n > 0){
            int digit = n % 10;
            sum += (int)Math.pow(digit, count);
            n = n / 10;
        }

        if(sum == original){
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }

        TJ.close();
    }
}
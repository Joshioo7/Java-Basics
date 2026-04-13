import java.util.Scanner;

public class printingnumbers {
    public static void main(String[] args) {

        Scanner TJ = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = TJ.nextInt();

        int sum = 0;   // accumulator

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                sum = sum + i;
            }
        }

        System.out.println("Sum of even numbers is " + sum);
    }
}

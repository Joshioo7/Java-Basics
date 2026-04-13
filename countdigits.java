import java.util.Scanner;

public class countdigits {

    public static void main(String[] args) {

        Scanner TJ = new Scanner(System.in);
        System.out.println("Enter the number");

        int n = TJ.nextInt();
        int count = 0;
        

        if (n < 0) {
            System.out.println("Please enter positive number");
        } else {

            if(n==0){
                System.out.println("Number of digits is 1");
            } else {
            

            while (n > 0) {
               
                n = n / 10;
                count++;
            }

            System.out.println("Number of digits present in the number are " + count);
        }

        TJ.close();
    }
}
}
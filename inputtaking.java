import java.util.Scanner;

public class inputtaking{
    public static void main(String[] args){
      Scanner TJ = new Scanner(System.in);
      System.out.println("Enter first number : ");
      int a = TJ.nextInt();

      System.out.println("Enter second number : ");

      int b = TJ.nextInt();

      int sum = a+b;

      System.out.println("Sum of numbers is : " + sum);

    }
}
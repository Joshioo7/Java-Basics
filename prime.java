import java.util.Scanner;

public class prime{
    public static void main(String[] args){
        Scanner TJ = new Scanner(System.in);

        System.out.println("Enter number");
        int n = TJ.nextInt();
        boolean isPrime = true;

        if(n<=1){
            isPrime = false;

        } else {

            for(int i =2;i<n;i++){
                if(n%i==0){
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println("Prime number");
        } else {
                System.out.println("Not prime");
        }

        TJ.close();
    }

        }

        
        
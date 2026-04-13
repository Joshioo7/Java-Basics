
import java.util.Scanner;

public class primer{
    public static void main(String[] args){
        Scanner TJ = new Scanner(System.in);

        System.out.println("Enter number");

        int n = TJ.nextInt();
        boolean IsPrime = true;

        if(n<=1){
            System.out.println("Not Prime");
        }  else {
            for(int i=2;i<n;i++){
                if(n%i==0){
                    IsPrime = false;
                    break;
                }
            }

            if(IsPrime){
                System.out.println("Prime true");
            } else {
                System.out.println("Prime false");
            }
    }
}
}
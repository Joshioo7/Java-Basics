import java.util.Scanner;

public class factorial{
    public static void main(String [] args){
        Scanner TJ = new Scanner(System.in);

        System.out.println("Enter number");

        int n = TJ.nextInt();
        
        
        if(n < 0) {
    System.out.println("Enter positive number");
} else {

            int fact = 1;
        for(int i=1 ; i<=n ; i++){
            fact = fact*i;
        }

        System.out.println("Factorial value is  " + fact);
    
    }
}

}
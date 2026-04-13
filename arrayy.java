import java.util.Scanner;

public class arrayy {

    public static void main(String[] args) {
        Scanner TJ = new Scanner(System.in);
        int n = TJ.nextInt();

        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = TJ.nextInt();
            System.out.println(arr [i]);
        }

        
    }
}
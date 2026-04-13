import java.util.Scanner;

public class sumandreversearray{
    public static void main(String[] args){
        Scanner TJ = new Scanner(System.in);
        System.out.println("Enter the elements");

        int n = TJ.nextInt();
        int [] arr = new int[n];
        int start = 0;
        int end = n-1;
        

        //input
        for(int i = 0 ; i<n ; i++){
            arr[i] = TJ.nextInt();
        }

        // reverse logic

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        //ouput
       
         System.out.print("reverse elements are ");
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i]);
            
        }

        
    }
}
import java.util.Scanner;

public class UpgradedLinearSearch{
    public static void main(String[] args) {
        Scanner TJ = new Scanner(System.in);

        System.out.println("Enter total number of elements");
        int n = TJ.nextInt();
        int [] arr = new int[n];

        // to enter elements
        System.out.println("Enter elements");
        for(int i = 0; i<n ; i++){
            arr[i] = TJ.nextInt();
        }

        //to enter target to be searched
         int target = TJ.nextInt();
         int count = 0;

         // searching the target and printing if found
         for(int i = 0; i<n ; i++){
            if(arr[i]==target){
                System.out.println("Index of target element is " + i);
                count++;
            }
        }

            if(count>0){
                System.out.println("Total number of occurences are " + count);
            } else {
                System.out.println("Not found");
            }
         }
    }

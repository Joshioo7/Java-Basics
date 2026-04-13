import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args){
        Scanner TJ = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = TJ.nextInt();

        int[] arr = new int[n];
        int found = -1;

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = TJ.nextInt();
        }

        System.out.println("Enter number to search:");
        int target = TJ.nextInt();


        // search
        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                found = i;
                break;
            }
        }

        // output
        if(found != -1){
            System.out.println("Found at index: " + found);
        } else {
            System.out.println("Not found");
        }
    }
}
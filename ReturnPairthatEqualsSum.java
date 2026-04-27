// this code find pair whose sum is equalt to target then stores its value in a newly formed array and passes it in main as well
// we are using


import java.util.Scanner;
import java.util.Arrays; // This imports the Arrays class from Java’s utility package , utility class for array operations (sorting is one of them)

public class ReturnPairthatEqualsSum{
    public static int[] pair1(int arr[] , int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start<end){
            int sum = arr[start] + arr[end];
            if(sum==target){
            return new int[]{arr[start], arr[end]}; // created array of size 2 with values of start and end which we store 
            } else if (sum<target){
                start++;
            } else { 
                end--;
            }

        }
        return new int[]{-1 , -1};
    }

    public static void main(String[] args){
        Scanner TJ = new Scanner (System.in);
        System.out.println("Enter elements");
        int n = TJ.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter all elements");
        for(int i = 0; i<n ; i++){
            arr[i] = TJ.nextInt();
        }    
        
        // sorting array for two pointer logic
            Arrays.sort(arr);

            System.out.println("Enter target");
            int target = TJ.nextInt();

            int[] result = pair1(arr, target); // stores reference to the result array , stores reference of values coming from function , result is a reference pointer here , reference variable
            
            System.out.println(result);
            
            if(result[0] != -1){
                System.out.println("Pair is " + result[0] + " " + result[1]);

            }
            else {
                System.out.println("Pair not found");
            }

            
        }
    }
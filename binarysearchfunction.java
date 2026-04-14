import java.util.Scanner;

public class binarysearchfunction{
    public static int Bine(int arr[] , int target){
        
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            int mid = (start+end)/2;        
            if(arr[mid] == target){
                return mid;
            }
              else {
            if(arr[mid]<target){
                start = mid+1;
            } else {
                end = mid-1;
            }

        }
    }
        return -1;
    }

        public static void main(String[] args){
            Scanner TJ = new Scanner(System.in);
            System.out.println("Enter total number of elements");
            int n = TJ.nextInt();
            int [] arr = new int[n];

            // for array to form|
            System.out.println("Enter values to form array");
            for(int i = 0; i<n ; i++){
                arr[i] = TJ.nextInt();
            }

            // entering the target element which is to be found
            System.out.println("Enter element to be searched");
            int target = TJ.nextInt();
            int result = Bine(arr, target);
        

            if(result!=-1){
                System.out.println("Element found at index: " + result);
            } else {
                System.out.println("Not found");
            }

        }
    }
    
import java.util.Scanner;

public class firstoccurence {

    public static int Boyz(int arr[] , int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                ans = mid;
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
        }
        return ans;
    }

     public static void main(String[]  args){
        Scanner TJ = new Scanner(System.in);
        System.out.println("Enter total number of elements");
        int n = TJ.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements");
        for(int i=0; i<n ;i++){
            arr[i]=TJ.nextInt();
        }

        System.out.println("Enter target");
        int target = TJ.nextInt();
        int result = Boyz(arr , target);

        if(result!=-1){
            System.out.println("Element found first at " + result);
        } else { 
            System.out.println("Element not found");
        }
     }   
}
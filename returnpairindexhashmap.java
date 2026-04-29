import java.util.Scanner;
import java.util.HashMap;

public class returnpairindexhashmap {

    public static int[] pairHash(int arr[], int target){
        HashMap<Integer, Integer> map = new HashMap<>(); // we create a hashmap here , key--> array value , value-->index

        for(int i = 0; i < arr.length; i++){
            int complement = target - arr[i];

            // check first
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }

            // then store
            map.put(arr[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args){
        Scanner TJ = new Scanner(System.in);

        System.out.println("Enter number of elements");
        int n = TJ.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements");
        for(int i = 0; i < n; i++){
            arr[i] = TJ.nextInt();
        }

        System.out.println("Enter target");
        int target = TJ.nextInt();

        int result[] = pairHash(arr, target);

        if(result[0] != -1){
            System.out.println("Indices are " + result[0] + " " + result[1]);
        } else {
            System.out.println("Pair not found");
        }
    }
}
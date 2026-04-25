import java.util.Scanner;

public class TwoNumbersSumToTarget { 

    public static boolean Istargetsum(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int sum = arr[start] + arr[end];

            if (sum == target) {
                return true;
                //To increase sum → move start
                // To decrease sum → move end
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner TJ = new Scanner(System.in);

        System.out.println("Enter total elements");
        int n = TJ.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = TJ.nextInt();
        }

        System.out.println("Enter target");
        int target = TJ.nextInt();

        // ✅ Correct function call
        boolean result = Istargetsum(arr, target);

        // ✅ Correct variable used
        if (result) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

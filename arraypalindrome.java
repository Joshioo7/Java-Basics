import java.util.Scanner;

public class arraypalindrome {

    public static boolean isPalindrome(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false; // stop immediately
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner TJ = new Scanner(System.in);

        System.out.println("Enter total number of elements");
        int n = TJ.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = TJ.nextInt();
        }

        boolean result = isPalindrome(arr);

        if (result) {
            System.out.println("Array is palindrome");
        } else {
            System.out.println("Array is not palindrome");
        }
    }
}
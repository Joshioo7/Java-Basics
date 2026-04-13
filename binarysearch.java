public class binarysearch {

    public static int search(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            } 
            else if (arr[mid] < target) {
                start = mid + 1; // go right
            } 
            else {
                end = mid - 1; // go left
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        int result = search(arr, 40);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
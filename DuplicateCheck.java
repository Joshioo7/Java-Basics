import java.util.HashSet;

public class DuplicateCheck {

    public static boolean hasDuplicate(int[] arr) {

        HashSet<Integer> set = new HashSet<>(); //creates an empty memory box

        for(int num : arr) {     //“Take every element from arr one by one and store it in num , num is actual value from array
 
            // if already present
            if(set.contains(num)) {
                return true;
            }

            // otherwise add to set
            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1};

        System.out.println(hasDuplicate(arr));
    }
}
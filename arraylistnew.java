import java.util.ArrayList;

public class arraylistnew {
    public static void main(String[] args){
        ArrayList<Integer> TJ = new ArrayList<>();
        TJ.add(100);
        TJ.add(90);
        TJ.add(80);
        TJ.add(70);

        System.out.println(TJ);
        // This prints [100 , 90 , 80 , 70]

        // Now we will use get method to fetch element present at that specific index

        System.out.println(TJ.get(3));
        // This will print 70
        
        // Now we wil use remove method to remove value from a specific index

        System.out.println(TJ);
        TJ.remove(1);
        System.out.println(TJ);
    }
}
// 2 methods of declaring string

public class strings {
    public static void main(String[] args){

    String TJ = "Hi"; //first , also called string literal where when phrase matches , new object with same phrase cannot be created
    //System.out.println(TJ);

    String TJ1 = new String("Welcome"); // Second , new object can be created using new keyword/memory allocator
    //System.out.println(TJ1);

    // now we will split string and store it in a an array

    String S1 = new String("All is well");
    String[] Splitted = S1.split("All");
    System.out.println(Splitted[0]);

    String Str = new String("Mentalists is good");
    String[] arr = Str.split(" ");
    System.out.println(arr[1]);




}
}
public class methodsnew{
    public static void main(String[] args){
        methodsnew D = new methodsnew();
        D.getdata();
        String name = D.getdata(); //now here we are saving vale returned from getdata() in name variable which is storing string value
        System.out.println(name);
    }

    public String getdata(){
        System.out.println("Hello World");
        return ("Tejasva Joshi");

        // in this ocde , we made an object , then called the method using syntax object.method name

    }
}
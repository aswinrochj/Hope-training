public class Autoboxing {

    public static void main(String[] args) {c
        //int a = 10;
        //Integer obj = a;    //
        //System.out.println(obj);

        Integer a = 1000;
        Integer obj  = 1000;        //The object hold form -128 to 127 in reference
        System.out.println(a == obj);       //The output is false
        System.out.println(a.equals(obj));
    }
    
}

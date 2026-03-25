public class ConstructorOverloading {

    public static void main(String[] args)
    {
        crOverLoading cr = new crOverLoading(4);
        crOverLoading cr1 = new crOverLoading("Hope");
    }
    
}

class crOverLoading
{
    crOverLoading(){
        System.out.print("Default constructor");
    }

    crOverLoading(int i)
    {
        System.out.println("The value of i is " + i);
    }

    crOverLoading(String i)
    {
        System.out.print("The value of i is " + i);
    }
}

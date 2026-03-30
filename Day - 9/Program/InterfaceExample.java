public class InterfaceExample {

    public static void main(String[] args) {
        C c = new C();
        c.show();
        c.display();
        
    }
    
}

interface A 
{
    void show();
}

interface B
{
    void display();
}

class C implements A,B
{
    public void show()
    {
        System.out.println("Welcome to the show");
    }
    public void display()
    {
        System.out.println("Enjoy the display !");
    }
}


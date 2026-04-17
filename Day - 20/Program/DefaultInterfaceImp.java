
public class DefaultInterfaceImp {

    public static void main(String[] args) {

        method h = new hello();
        h.display();
        
    }
    
}

interface method
{
    default void display()
    {
        System.out.println("Welocome to the interface implementation");
    }
}
class hello implements method{

    public void display()
    {
        System.out.println("Overrided the original Interface Implementation");
    }

    
}
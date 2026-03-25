public class classObjects
{
    public static void main(String[] args)
    {
        System.out.println("I am inside the class objects");
        Apartments apartment = new Apartments();
        apartment.display();    
    }
}
class Apartments
{
    public void display()
    {
        System.out.print("I am inside the apartment");
    }
}
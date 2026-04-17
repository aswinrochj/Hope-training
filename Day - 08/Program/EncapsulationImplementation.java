class EncapsulationImplementation
{
    
    public static void main(String[] args)
    {
        Encapsulation e = new Encapsulation();
        e.display();
    }
}
class Encapsulation
{
    int a;

    public Encapsulation() {
        a = 10;

    }
    void display()
    {
        System.out.println("Implementation of Encapsulation is " + a);
    }
    
}
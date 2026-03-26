public class InheritanceDept {

    public static void main(String[] args)
    {
        Aiml obj = new Aiml();
        obj.display();
        obj.Cse1();
        obj.Aiml1();

    }
    
}
class Dept
{
    void display()
    {
        System.out.println("The list of the department");
    }
}
class Cse extends Dept
{
    void Cse1()         //If we give Aiml it give warning as constructor name and method name is same
    {
        System.out.println("CSE");
    }
}
class Aiml extends Cse
{
    void Aiml1()        //If we give Aiml it give warning as constructor name and method name is same
    {
        System.out.println("Aiml");
    }

}

public class  SimpleInheritance
{
    public static void main(String[] args)
    {
        System.out.println("I am inside main class");
        parent p = new parent();
        p.display();
        child c = new child();
        c.display1();
        c.display();                //With child object we can access the parent and child method but for parent object we can only access the parent method
        parent cp = new child();    //I have created the object for child but we load the parent so we can access only the loader using cp
        //child cp = new parent();  // using parent we can create object for child but not for parent, in above we can access the p.method but not here
        cp.display();               
    }
}

class parent
{
    void display()
    {
        System.out.println("I am inside the parent class but called by child class");
    }
}

class child extends parent
{
    void display1()
    {
        System.out.println("I am inside child class but called via parent");
    }
}
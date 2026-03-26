public class SuperKeyword {
    public static void main(String[] args) {
        {
            super2 se = new super2();
            se.reject();     
        }
    }
    
}
class super2 extends super1
{
    super2()
    {
        System.out.println("It is the super2 ");
    }
    void reject()
    {
        System.out.println("I havent call you y u came");
        super.hello();
    }
    
}

class super1
{
    super1()
    {
        System.out.println("It is the super1 ");
    }
    void hello()
    {
        System.out.println("hello iam coming inside");
    }
}

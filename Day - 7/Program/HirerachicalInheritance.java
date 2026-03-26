public class HirerachicalInheritance {

    public static void main(String[] args) 
    {
            Son son = new Son();
            son.display();          //both daugther and son can access the display 
            son.job();
            
            Daughter daughter = new Daughter(); 
            daughter.display();     //both daugther and son can access the display 
            daughter.buisness();

            //but son cannot access buisness, daughter cannot access job

    }
    
}

class Father
{
    void display()
    {
        System.out.println("I am father and i have 1 son and 1 daughter");
    }
}
class Son extends Father
{
    void job()
    {
        System.out.println("Since u are going to job i am going to hand over the buisness to your sister");
    }
}
class Daughter extends Father
{
    void buisness()
    {
        System.out.println("Since i have my own buisness i dont have time, give it to brother");
    }
}


public class Abstraction {

    public static void main(String[] args) {

        Animal a = new Dog();
        
        a.sound();
        
    }
    
}
abstract class Animal
{
    void eat()
    {
        System.out.println("Eating.....");
    }
    abstract void sound();
}
class Dog extends Animal
{
    void sound()
    {
        System.out.println("Bark.....");
    }

}

class Cat extends Animal{
    void sound()
    {
        System.out.println("Meow.....");
    }
}

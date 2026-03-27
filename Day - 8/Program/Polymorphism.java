public class Polymorphism {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.sound();                      //method 1
        Cat cat = new Cat();
        cat.sound();

        Animal animal = new Cat();             //we can merge Animal animal; animal = new Cat(); by this line
        //Animal animal;                       // Polymorphism 
        //animal = new Cat();                 //method 2   (Method overloading - compile time)
        animal.sound();

        Animal animal1 = new Dog();
        animal1.sound();
        
        
    }
    
}

class Animal
{
    void sound() 
    {
        System.out.println("Animals always have different sounds");
    }
}
class Dog extends Animal{
    //@Override                 //m1
    void sound()
    {
        System.out.println("Dog will bark");
    }
}
class Cat extends Animal{
    //@Override                 //m1
    void sound()
    {
        super.sound();             //To print the value of sound in the parent class
        System.out.println("Cat will meow");
    }
}

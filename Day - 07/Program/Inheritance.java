public class Inheritance {

    public static void main(String[] args) {
        {
            Dog sound = new Dog();
            System.out.println(sound.hashCode());
            sound.bark();
            sound.display();
            

        }
    }
    
}

class Animal
{
    void display()
    {
        System.out.println("There are multiple animals choose one and mention it's sound");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.print("Dog barks");
    }
}

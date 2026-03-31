// File: AccessModifierDemo.java

class BaseClass {
    
    public int publicVar = 10;        // accessible everywhere
    private int privateVar = 20;      // accessible only within this class
    protected int protectedVar = 30;  // accessible in same package + subclasses
    int defaultVar = 40;              // default (package-private)

    public void showValues() {
        System.out.println("Inside BaseClass:");
        System.out.println("Public: " + publicVar);
        System.out.println("Private: " + privateVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
    }

    // Getter for private variable
    public int getPrivateVar() {
        return privateVar;
    }
}

// Subclass to test protected access
class DerivedClass extends BaseClass {

    public void display() {
        System.out.println("\nInside DerivedClass:");

        // System.out.println(privateVar); ❌ Not accessible
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
    }
}

public class AccessModifierDemo {

    public static void main(String[] args) {

        BaseClass obj = new BaseClass();
        obj.showValues();

        System.out.println("\nAccessing from main:");

        System.out.println("Public: " + obj.publicVar);
        // System.out.println(obj.privateVar); ❌ Not accessible
        System.out.println("Private (via getter): " + obj.getPrivateVar());
        System.out.println("Protected: " + obj.protectedVar);
        System.out.println("Default: " + obj.defaultVar);

        DerivedClass d = new DerivedClass();
        d.display();
    }
}
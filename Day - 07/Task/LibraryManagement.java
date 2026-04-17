class LibraryManagement
{
    public static void main(String[] args)
    {
        SmartHome sm = new SmartHome();
        sm.display3();

        Conversion cv = new Conversion();
        cv.display2();

        Tags tg = new Tags();
        tg.display1();
    }
}

// Library
class Library
{
    Library()
    {
        System.out.println("Access from the menu of the Library");
    }
}

// Layer 2

class CSE extends Library
{
    CSE()
    {
        System.out.println("Access from the menu of CSE");
    }
}

class ECE extends Library
{
    ECE()
    {
        System.out.println("Access from the menu of ECE");
    }
}

class IT extends Library
{
    IT()
    {
        System.out.println("Access from the menu of IT");
    }
}

// Layer 3

class Fullstack extends CSE
{
    Fullstack()
    {
        System.out.println("Access from Fullstack");
    }
}

class Tags extends Fullstack
{
    void display1()
    {
        System.out.println("Tags");
    }
}

class DigitalElectronics extends ECE
{
    DigitalElectronics()
    {
        System.out.println("Access from the DigitalElectronics");
    }
}

class Conversion extends DigitalElectronics
{
    void display2()
    {
        System.out.println("Conversion");
    }
}

class IOT extends IT
{
    IOT()
    {
        System.out.println("Access from the IOT");
    }
}

class SmartHome extends IOT
{
    void display3()
    {
        System.out.println("SmartHome");
    }
}
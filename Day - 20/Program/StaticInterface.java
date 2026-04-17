public class StaticInterface {

    public static void main(String[] args) {
        
        String s = CarEngine.display();
        System.out.println(s);
    }  
}
interface CarEngine
{
    static String display()
    {
        return "Engine is designed with 3000rpm";
    }
}
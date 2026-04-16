import java.io.*;

class Student implements Serializable
{
    int id;
    String name;

    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}




public class Serialization {

    public static void main(String[] args) throws Exception{

        Student s1 = new Student(1009,"Prasanth kS");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("confidential.dat"));
        oos.writeObject(s1);
        oos.close();
        
        System.out.println("Object Serialized");
        
    }
    
}

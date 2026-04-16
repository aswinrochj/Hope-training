import java.io.*;
public class Deserialization {

    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("confidential.dat"));
        Student s = (Student) ois.readObject();
        ois.close();
        System.out.println("After Deserialization Data is :" );
        System.out.println(s.id + " " + s.name);
    }
    
}

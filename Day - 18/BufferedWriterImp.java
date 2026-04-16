import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterImp {

    public static void main(String[] args) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("hope_batch.txt",true));
            writer.write("Here , we have turn the File writer with true for append");
            writer.newLine();
            writer.write("I have closed tha appending and writing operation");
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}

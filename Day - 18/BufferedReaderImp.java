import java.io.BufferedReader;
import java.io.FileReader;
public class BufferedReaderImp {

    public static void main(String[] args)
    {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("hope_batch.txt"));
            while(reader.ready())
            {
                System.out.println(reader.readLine());
                
            }
            reader.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
        

    
    
}

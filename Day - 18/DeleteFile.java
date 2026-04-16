import java.io.*;
public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("hope_batch.txt");
        try{
            if(file.delete())
            {
                System.out.println("File deleted successfully");
            }
            else
            {

            }
        }
        catch(Exception e){
            System.out.println(e);
        }

        
    }
    
}

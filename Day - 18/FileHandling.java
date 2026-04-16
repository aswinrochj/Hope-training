import java.io.*;
public class FileHandling
{
    public static void main(String[] args) {
        try{
            File file = new File("hope_batch.txt");
            if(file.createNewFile())
            {
                System.out.println("File created :" + file.getName());
            }
            else{
                System.out.println("File already exiists.");
            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
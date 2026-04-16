import java.io.FileWriter;

public class FileWriterImplementation {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("hope_batch.txt");

            writer.write("Hello, this is my first file writing program!");
            writer.close();

            System.out.println("Successfully written to file.");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
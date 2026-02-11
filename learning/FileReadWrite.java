import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        String filename = "Document.txt";
        String text = "Hi world";

        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(text);
            System.out.println(text + " written successfully");
            System.out.println();
            writer.close();

        } catch (IOException e) {
            System.out.println("Error" + e);
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String read = reader.readLine();
            System.out.println(read + " is written in the file");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

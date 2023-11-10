import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Input{
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("garv.txt");
             FileWriter writer = new FileWriter("destination.txt")) {

            char[] buffer = new char[1024]; // Buffer to read characters efficiently
            int charData;

            while ((charData = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, charData);
            }

            System.out.println("File copy successful!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

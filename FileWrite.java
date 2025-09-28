import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
       
        String filename = "notes.txt";

       
        String notes = "This is the first note.\nThis is the second note.\nThird note goes here.";

        try (FileWriter writer = new FileWriter(filename)) {
           
            writer.write(notes);
            System.out.println("Notes have been written to the file.");
        } catch (IOException e) {
           
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}

package FillHandling;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudentFile {

    public static void main(String[] args) {

        try {

            // Open file
            FileReader fileReader = new FileReader("students.txt");

            // Read file using BufferedReader
            BufferedReader reader = new BufferedReader(fileReader);

            String line;

            System.out.println("Students Details:");

            // Read file line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close reader
            reader.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
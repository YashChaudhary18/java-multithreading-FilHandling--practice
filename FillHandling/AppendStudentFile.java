/* Append File
Add new data to existing file. */
package FillHandling;



import java.io.FileWriter;
import java.io.IOException;

public class AppendStudentFile {

    public static void main(String[] args) {

        try {

            // Open file in append mode
            FileWriter writer = new FileWriter("students.txt", true);

            writer.write("4 Neha 88\n");
            writer.write("5 Arjun 91\n");

            writer.close();

            System.out.println("New student data appended successfully.");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

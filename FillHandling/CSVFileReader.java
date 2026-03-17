/* CSV File Reader
Read data from:
students.csv
Print all records. */
package FillHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVFileReader {

    public static void main(String[] args) {

        String line;

        try {

            BufferedReader reader = new BufferedReader(new FileReader("students.csv"));

            System.out.println("Student Records:");

            // Read file line by line
            while ((line = reader.readLine()) != null) {

                // Split CSV values
                String[] data = line.split(",");

                for (String value : data) {
                    System.out.print(value + " ");
                }

                System.out.println();
            }

            reader.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

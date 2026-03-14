package Logging;



import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class LogSystem {

    // Method to write log
    public static void writeLog(String action) {

        try {

            FileWriter writer = new FileWriter("app.log", true);

            String log = LocalDateTime.now() + " - " + action + "\n";

            writer.write(log);

            writer.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        // Example actions
        writeLog("Employee added");
        writeLog("Employee deleted");

        System.out.println("Actions logged successfully.");
    }
}

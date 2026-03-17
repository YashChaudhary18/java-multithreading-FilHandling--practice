package Logging;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class LogSystem {

    private static final String FILE_NAME = "app.log";

    // Synchronized method to make logging thread-safe
    public static synchronized void writeLog(String level, String action) {

        // Try-with-resources ensures auto-close
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {

            String log = LocalDateTime.now() 
                    + " [" + level + "] "
                    + "[" + Thread.currentThread().getName() + "] "
                    + action + "\n";

            writer.write(log);

        } catch (IOException e) {
            System.out.println("Logging failed: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        // Example logs
        writeLog("INFO", "Employee added");
        writeLog("WARNING", "Employee deleted");
        writeLog("ERROR", "Database connection failed");

        System.out.println("Actions logged successfully.");
    }
}

/* Write File
Write student details into:
students.txt */
package FillHandling;


import java.io.FileWriter;
import java.io.IOException;

// Student class
class Student {

    int id;
    String name;
    int marks;

    // Constructor
    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Convert student object to string
    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class WriteStudentFile {

    public static void main(String[] args) {

        // Create student objects
        Student s1 = new Student(1, "Rahul", 85);
        Student s2 = new Student(2, "Aman", 90);
        Student s3 = new Student(3, "Priya", 78);

        try {

            FileWriter writer = new FileWriter("students.txt");

            writer.write(s1.toString() + "\n");
            writer.write(s2.toString() + "\n");
            writer.write(s3.toString() + "\n");

            writer.close();

            System.out.println("Student details written to file successfully.");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

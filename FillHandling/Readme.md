1. Java File Handling – Write File Example

Overview :

This program demonstrates how to write student details into a text file using Java File Handling.

Student objects are created and their details are written into students.txt using "FileWriter".



Steps :

1. Create a "Student" class with attributes:

   - id
   - name
   - marks

2. Create student objects.

3. Create a "FileWriter" object.

4. Write student details to "students.txt".

5. Close the file using "close()".



Output File :

students.txt

Example content:

1 Rahul 85
2 Aman 90
3 Priya 78



Concepts Used :

- Java File Handling
- FileWriter
- Exception Handling


---

2. Java File Handling – Read File Example

Overview :

This program demonstrates how to read data from a text file in Java.

The program reads the contents of students.txt and prints the data on the console.



Steps :

1. Create a "FileReader" object to open the file.
2. Wrap it using "BufferedReader".
3. Read the file line by line using "readLine()".
4. Print each line on the console.
5. Close the reader.



Output File :

students.txt

Example content:

1 Rahul 85
2 Aman 90
3 Priya 78



Concepts Used :

- Java File Handling
- FileReader
- BufferedReader
- Exception Handling

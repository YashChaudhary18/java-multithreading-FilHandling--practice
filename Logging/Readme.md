Java Mini Project – Simple Log System

Overview :

This mini project demonstrates a simple logging system in Java.

Every action performed in the program is recorded in a log file named app.log.

---

Features :

- Logs application actions
- Stores logs in a file
- Uses append mode to keep log history
- Adds timestamp for each action

---

Example Logs :

app.log

2026-03-14T18:45:32 - Employee added
2026-03-14T18:45:35 - Employee deleted

---

Steps :

1. Create a method "writeLog(String action)".
2. Use "FileWriter" in append mode.
3. Add current timestamp using "LocalDateTime".
4. Write action messages to app.log.
5. Close the file after writing.

---

Concepts Used :

- Java File Handling
- Logging System
- FileWriter
- Append Mode
- LocalDateTime

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author mohib
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class Record {
    // Name of the associated file
 private String filename;
 private static Record instance;

 private Record(String n) {
 filename = n;
 }
 
 public static Record getInstance() {
     if (instance == null) {
         instance = new Record("record.txt");
     }
     return instance;
 }

 // Effects: Reads and prints the contents of the associated
 // file to the standard output.
 public void read() {
 try {
 // Write the code here
 File file = new File(filename);
 Scanner Read = new Scanner(file);
      while (Read.hasNextLine()) {
        String data = Read.nextLine();
        System.out.println(data);
      }
 } catch (IOException e) {
 System.out.println("An error occurred.");
 e.printStackTrace();
 }
 }

 // Effects: Appends the specified message, msg, to the
 // associated file.
 public void write(String msg) {
 try {
 // Write the code here
 FileWriter Write = new FileWriter(filename,true);
      Write.write(msg);
      Write.close();
 } catch (IOException e) {
 System.out.println("An error occurred.");
 e.printStackTrace();
 }
 }

 public static void main(String[] args) {
 // Fill the blank below that obtains the sole instance
 // of the Record class.
 // (You should not invoke the Record constructor here.)
 
Record r = Record.getInstance();

 // Do not modify the code below
 r.write("Hello-1\n");
 r.write("Hello-2\n");

 System.out.println("Currently the file record.txt " +
 "contains the following lines:");
 r.read();
 }
}

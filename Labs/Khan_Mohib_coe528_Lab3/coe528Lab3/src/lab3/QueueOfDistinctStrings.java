/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author mohib
 */
import java.util.ArrayList;

public class QueueOfDistinctStrings {
 // Overview: QueueOfDistinctStrings are mutable, bounded
 // collection of distinct strings that operate in
 // FIFO (First-In-First-Out) order.
 //
 // The abstraction function is:
 // a) Write the abstraction function here
 // AF (c) = an abstract queue d  ( where c is a QueueOfDistinctStrings Java Object)
 //          where d.front = c.items.get(0)
 //          where d.end = c.items.get(c.items.size()-1)
 //          for all integers i, (0<= i <c.items.size()), d.add(c.items.get(i))
 //Implement Abstraction Function in function called toString()
 // The rep invariant is:
 // b) Write the rep invariant here
 // RI (c) = true if for all integers i, (0<= i <c.items.size()), c.items.get(i) != null &&
 //               if c.items.size() != 0 &&
 //               if for all integers i, j, (0<= i <c.items.size() && 0<= j <c.items.size() && i!=j), c.items.get(i) != c.items.get(j)
 //        = false otherwise
 // Implement Rep Invariant in function called repOK()
 //
 //the rep
 private ArrayList<String> items;
 // constructor
 public QueueOfDistinctStrings () {
 // EFFECTS: Creates a new QueueOfDistinctStrings object
 items = new ArrayList<String>();
 }
 // MODIFIES: this
 // EFFECTS: Appends the element at the end of the queue
 // if the element is not in the queue, otherwise
 // does nothing.
 public void enqueue(String element) throws Exception {
 if(element == null) throw new Exception();
 if(false == items.contains(element))
 items.add(element);
 }
 public String dequeue() throws Exception {
 // MODIFIES: this
 // EFFECTS: Removes an element from the front of the queue
 if (items.size() == 0) throw new Exception();
 return items.remove(0);
 }

 public boolean repOK() {
 // EFFECTS: Returns true if the rep invariant holds for this
 // object; otherwise returns false
 // c) Write the code for the repOK() here
 if (items.size()==0) {
     return false;
 }
 int i;
 int j;
 for (i=0;i<items.size();i++) {
     if (items.get(i) == null) {
         return false;
     }
 }
 for (i=0;i<items.size();i++) {
     for (j=0;j<items.size();j++){
         if (i!=j && items.get(i) == items.get(j)) {
             return false;
         }
     }
 }
 return true;
 }
 
 public String toString() {
 // EFFECTS: Returns a string that contains the strings in the
 // queue, the front element and the end element.
 // Implements the abstraction function.
 // d) Write the code for the toString() here
 String front = items.get(0);
 String end = items.get(items.size()-1);
 return "Front: " + front + "\nEnd: " + end + "\nQueue of Distinct Strings: " + items;
 }
 
 public static void main(String [] args) throws Exception {
     QueueOfDistinctStrings f = new QueueOfDistinctStrings();
     f.enqueue("ab");
     f.enqueue("db");
     f.enqueue("bc");
     f.enqueue("cd");
     f.dequeue();
     boolean x = f.repOK();
     System.out.println("repOK ouput: " + x);
     String g = f.toString();
     System.out.println(g);
 }
}

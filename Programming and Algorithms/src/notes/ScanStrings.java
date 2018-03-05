package notes;

/**
* Scan into array! (assuming file of
* words in order seperated by newlines)
* 1. Count number of lines in file
* 2. Make the array
* 3. Actually put the stuff in the array
* @author Kramer
*/

import java.io.*;
import java.util.Scanner;

public class ScanStrings
{
   public static void main(String [] args) {
       try {
           Scanner scan = new Scanner(new BufferedReader(new FileReader("words.txt")));
           int size = 0;
           while(scan.hasNext()) {
               size++;
               scan.next();
           }
           String[] words = new String [size];
           scan.close();
           scan = new Scanner(new BufferedReader(new FileReader("words.txt")));
           int count = 0;
           while(scan.hasNext()) {
               words[count] = scan.next();
               count++;
           }
        
           
           
           String myWord = "Phil";
           
           if (myWord.compareToIgnoreCase(words[10]) < 0) {
               /**
                * This means myWord is less than words[10]
                */
           }
           
           
           
           
       } catch (Exception e) {
           System.out.println("WAT: " + e.getMessage());
       }

   }
}
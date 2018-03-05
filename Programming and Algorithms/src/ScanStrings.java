/**
 * Allows a user to check if/what position a word is in a file
 * @author Chris Kontomaris
 * @version 11/19/17
 */

import java.io.*;
import java.util.Scanner;

public class ScanStrings
{
    /**
     * Imports newline separated file of words into array
     * Asks user for a word
     * Checks if word is in array with binary search
     * @param imports command line arguments
     * @return prints the position of the word
     */

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

            Scanner input= new Scanner(System.in);
            System.out.println("Type in a word to check in the list!");
            String userWord= input.nextLine();

            //variables needed
            int high = (words.length);
            int low= 0;
            int mid;

            //check mid point
            int counter=0;
            while (true){
                //check midpoint
                mid= (high+low)/2;

                if (userWord.compareToIgnoreCase(words[mid])<0){
                    high=mid;

                }
                else if(userWord.compareToIgnoreCase(words[mid])>0){
                    low=mid;    
                }
                else if (userWord.compareToIgnoreCase(words[mid])==0){
                    System.out.println("hooray! "+ userWord+ " is at the " + (mid+1)+ " position in the list!");
                    System.out.println("that means that it is in the " + mid+" index because some guy thought we should count from zero");
                    break;
                } 
                //had to separate this from the else if chain because other wise it keeps checking the first if forever without realizing its at the end
                //also, the second condition allows it to check if it is stuck at the end
                //at the lower end of the alphabet, it gets stuck bc mid never reaches high, so if it has looped a few times at the end points
                //it means that it can assume it is not in the list
                if (high==low||((counter>words.length)&& high-low==1)){
                    System.out.println("its not in here laddie");
                    break;
                }
                counter++;
            }
        } catch (Exception e) {
            System.out.println("WAT: " + e.getMessage());
        }
    }
}

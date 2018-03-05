package notes;

/**
 * Description goes here
 * @author Mr Kramer
 */

import java.io.*;
import java.util.Scanner;

public class ScanStuff
{
    /**
     * Description
     * 
     * @param args Command Line Arguments
     */
    public static void main(String [] args) {
        try {
            Scanner scan = new Scanner(new BufferedReader(new FileReader("nums.txt")));

            scan.useDelimiter(",");

            while(scan.hasNext()) {
                /**
                 * Other methods:
                 * next() - gets strings
                 * nextDouble()
                 */
                System.out.println(scan.nextInt());
            }
        } catch (Exception e) {
            System.out.println("WAT: " + e.getMessage());
        }

    }
}
package notes;

import java.util.Scanner;
import java.io.*;
public class FileScan
{
    /**
     * Scanning from files is a bit trickier.
     * You need to import java.io.*
     * Also, you need to wrap all your code in a 
     * try/catch block. This is because of the possibility
     * of exceptions (like if a file doesn't exist).
     * Exceptions are more of an AP topic, so for now,
     * if you need to read from a file, put your whole
     * program in the try section.
     */
    public static void main(String [] args) {
        try {
            // This line of code opens the file.
            // THE FILE MUST BE IN THE SAME FOLDER AS YOUR PROJECT
            // (At school, make sure to save your project in your U:\ student
            // folder - click on Computer, you should see your name there)
            Scanner scan = new Scanner(new BufferedReader(new FileReader("nums.txt")));
            
            // Once the file is open, it basically just works as if the contents
            // of the file were typed into the keyboard, except every time there
            // is a space, the Enter key is pressed (same with a new line)
            // When using files scan.nextInt()/nextDouble()/next() doesn't
            // wait for anything, it just grabs the next thing in the file.
            int x = scan.nextInt();
            
            System.out.println(x);
            
            // One difference is that files have an ending that you might want
            // to check for. You can use scan.hasNext(), which will return
            // true if there is more stuff, and false if the file is done.
            // It's usually used in a loop condition
            while (scan.hasNext()) {
                System.out.println(scan.nextInt());
            }
            
            // If you want to reset the file (start from the beginning again)
            // just repeat the following line
            // (except you don't need the first Scanner)
            scan = new Scanner(new BufferedReader(new FileReader("nums.txt")));
            
            int sum = 0;
            while (scan.hasNext()) {
                sum = sum + scan.nextInt();
            }
            
            System.out.println(sum);
            
            
            
        } catch (Exception ohNoes) {
            System.out.println("An Exception Ocurred: " + ohNoes.getMessage());
            ohNoes.printStackTrace();
        }
    }
}
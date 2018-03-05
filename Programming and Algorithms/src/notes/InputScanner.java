package notes;

/**
 * For this class, use Java's Scanner for input.
 * It's nice because you can use it to read the
 * keyboard and ALSO files.
 * To use it, you need to import java.util.Scanner
 */
import java.util.Scanner;

public class InputScanner
{
    public static void main(String [] args) {
        /**
         * Keyboard Scanner example
         * You can think of Scanner like a variable type
         * (like String or int), so a variable is created
         * (actually an Object but you don't need to know
         * what that is yet)
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Type an integer! ");
        int x = scan.nextInt();
        System.out.println("You typed: " + x);
        /**
         * When Java hits scan.nextInt(), it waits for
         * keyboard input and returns whatever is typed as
         * an integer
         * One issue: if you type a space and more stuff, it
         * will "count" towards the next scan. You can prevent
         * this by redoing scan = new Scanner(System.in);
         */
        scan = new Scanner(System.in);
        System.out.println("Type another integer!");
        int y = scan.nextInt();
        System.out.println("Your second number: " + y);
        /**
         * You can scan doubles with
         * scan.nextDouble();
         * You can scan Strings with
         * scan.next();
         */
        
        System.out.println("Type a double!");
        double z = scan.nextDouble();
        System.out.println("Type a String!");
        String a = scan.next();
    }
}
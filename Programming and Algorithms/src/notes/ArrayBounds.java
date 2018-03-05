package notes;

public class ArrayBounds
{
    public static void main(String [] args) {
        int [] x = {5,12,3,7,22};
        
        /**
         * Array Out of Bounds example. This compiles, but when you
         * run... it crashes the program.
         */
        x[7] = 3;
        
        /**
         * This is usually only a mistake made in loops, when
         * you don't "stop" the loop in time.
         */
        for (int i = 0; i <= x.length; i++) {
            System.out.println(x[i]);
        }
    }
}
package notes;

public class Array2D
{
    public static void main(String [] args) {
        /**
         * This is a two-dimensional array. You could think of it like
         * a matrix (from math) with rows and columns, but 
         * whether the first number is rows or columns is up to you
         * and your program.
         */
        int [][] x = new int [3][5];
        /**
         * Explicit Definition
         */
        int [][] y = {{1,2,3,4},
                      {10,20,30,40},
                      {8,9,10,11}};
                      
        System.out.println(y[1][2]); // 30
        
        /**
         * 2D Lengths
         */
        System.out.println(x.length); // 3
        System.out.println(x[0].length); // 5
        
        /**
         * Class Exercise:
         * Write a program that initializes a 
         * 2 dimensional array (500 x 600)
         * and uses nested loops to fill it
         * with 5s
         */
        int [][] blah = new int [500][600];
        
        for(int l = 0; l < blah.length; l++) {
            for(int m = 0; m < blah[0].length; m++) {
                blah[l][m] = 5;
            }
        }
    }
}

package notes;

public class ArrayMethodFun
{
    public static void main(String [] args) {
        /**
         * Explicit Array declaration
         * This makes an array with 5 elements: 1,2,3,4,5
         * ONLY works when declaring.
         */
        int [] x = {1,2,3,4,5};
        
        int y = 3;
        normalMethod(y);
        System.out.println(y); // 3
        blahMethod(x);
        System.out.println(x[4]); // 10
    }
    
    /**
     * When normal variables are passed into methods,
     * they can't be changed in main (or wherever they're called
     * from) we say normal variables are "pass-by-value"
     */
    public static void normalMethod(int asdf) {
        asdf = 10;
    }
    
    /**
     * BUT ARRAYS ARE WACKY - changing an element of an array in
     * a method will change it "for reals"
     * Because arrays are Objects, they are "pass-by-reference"
     */
    public static void blahMethod(int [] arr) {
        arr[4] = 10;
    }
}
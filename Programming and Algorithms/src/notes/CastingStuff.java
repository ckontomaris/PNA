package notes;


//casting is basically forcing one Java type to become another
//it truncates

public class CastingStuff {
    public static void main(String [] args) {
        double a = 2.7;
        double c = 1.3;
        
        
        int b = (int) (a + c);
        System.out.println(b); //This one prints 4
          //because you add before casting
        
        b = (int) a + (int) c;
        System.out.println(b); //This prints 3
          //because you cast and truncate before adding
        
        /**
         * The "classic" use of casting is with Math.random()
         * This example does a dice roll (random number from
         * 1 - 6)
         */
        int dice = (int) (Math.random() * 6 + 1);
    }
}
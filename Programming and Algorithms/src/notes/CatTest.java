package notes;

class Cat
{
    /**
     * The variables in a class (which is like
     * a blueprint for an object - we aren't
     * defining a specific cat, just the traits
     * of all possible cats)
     * are called member variables or instance
     * variables
     * We can give variables default values.
     */
    double weight = 1.0;
    String breed = "Maine Coon";
    String name = "Commander Fluffkins";
    String color = "Black";
    int numlegs = 4;
    int age = 2;
    double meowfreq = 9001.3;  //meows per second
    boolean alive = true;
    
    /**
     * Methods can have specific purposes like
     * those below. They might have behaviors
     * that are complicated.
     */
    public String meow() { 
        if (alive) return "meeeeeeewwww";
        else return "rip";
    }
    public void accident() {
        if (numlegs == 0) alive = false;
        else numlegs --;
    }
    /**
     * Some Methods are called "getters" and
     * "setters" these methods are usually just
     * simple ways to access the member variables.
     * THESE METHODS ARE NOT STATIC
     */
    public String getName() { return name; }
    public void setName(String n) { name = n; }
}


/**
 * This program depends on the Cat class
 * in order to work.
 */
public class CatTest
{
    public static void main(String [] args) {
        /**
         * the new keyword creates a new
         * object, which we call an instance
         * Notice we can use the class name
         * as if it were a variable type.
         */
        Cat a = new Cat();
        
        a.setName("Poop Face");
        System.out.println(a.getName());
        
        System.out.println("Accident 1");
        a.accident();
        System.out.println(a.meow());
        System.out.println("Accident 2");
        a.accident();
        System.out.println(a.meow());
        System.out.println("More Accidents");
        a.accident();
        a.accident();
        a.accident();
        System.out.println(a.meow());
        
        /**
         * An issue with objects, is that
         * when you set them equal to each other
         * they are then referring to the same
         * instance.
         */
        Cat b = new Cat();
        Cat c = b; //c and b are the same cat now
        
        b.setName("Donkey Teeth");
        System.out.println(c.getName());
    }
}
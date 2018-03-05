package notes;

public class RecursionPrintingOrder {

}


//prints 10 9 8 
class RecursionStuffC {
    public static void main(String [] args) {
        thing(10);
    }
    public static void thing(int x) {
        System.out.println(x);
        if (x > 0) thing(x-1);
    }
}

//prints 0 1 2 
class RecursionStuffD {
    public static void main(String [] args) {
        thing(10);
    }
    public static void thing(int x) {
        if (x > 0) thing(x-1);
        System.out.println(x);
    }
}
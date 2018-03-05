//Write a program that uses circleArea and calculates the area of two 18-inch (diameter!) pizzas vs. the area of one 26-inch pizza. 
//Have the program print out which is better depending on the result (More pizza area)
import java.util.Scanner;
public class pizza_check{
    public static void main(String [] args){
        System.out.println("Which pizza's area is bigger? Two 18-inch (diameter!) pizzas or the one 26-inch pizza?");
        if ((2*circleArea((18/2)))>circleArea((26/2))){
            System.out.println("The two 18 inch pizzas are bigger!");
        } else if ((2*circleArea(18))<circleArea(26)){
            System.out.println("The 26 inch diameter pizza is bigger!");
        } else {
            System.out.println("They're both the same?");
        }
        int round =1;
        while (true){
            System.out.println("Now for a bonus game!!!! Type in any two pizza's radii and see which one has the greatest area! or type any negative number to end my secret game!");
            Scanner input = new Scanner(System.in);
            System.out.println("Type the radius of pizza 1");
            int pizza1= input.nextInt();
            if (pizza1<0){
            break;
            }
            System.out.println("Now for pizza 2");
            int pizza2= input.nextInt();
            if ((circleArea(pizza1))>circleArea(pizza2)){
                System.out.println("The pizza with " + pizza1+ " radius is bigger!");
            } else if ((circleArea(pizza1))<circleArea(pizza2)){
             System.out.println("The pizza with " + pizza2+ " radius is bigger!");
            } else {
             System.out.println("They're both the same?");
            }
                    round++;
                    System.out.println("Time for round " + round);
        }
        System.out.println("Thanks for playing");
    }
    public static double circleArea(double r) {
        return Math.PI * r * r;
    } 
}


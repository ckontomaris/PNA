//write a program that repeats until you enter a password
import java.util.Scanner;
public class repeat_until_password
{
    public static void main(String [] args){
        System.out.println("Put in your password please! If at first you don't succeed, try try again");
        String password= "hello";
        Scanner input= new Scanner(System.in);
        String typed= "";
        while (!(typed.equals(password))) {
            System.out.println("Try again. Hint: It's a greeting");
            typed = input.next();
        }
        System.out.println("You got it, you now have access to nothing.");
    }
}

package notes;

import java.util.Scanner;

public class ScanKeyboard
{
    public static void main(String [] args) {
        // System.in == the keyboard
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Type something");
        // this works but freezes because the keyboard always
        // has a "next" you can keep typing stuff and it will
        // repeat it
        while (scan.hasNext()) {
            System.out.println(scan.next());
        }
    }
}
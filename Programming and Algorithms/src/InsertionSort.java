import java.util.Scanner;
import java.io.*;
public class InsertionSort{
    public static void main(String [] args){
        try{
            Scanner scan = new Scanner(new BufferedReader(new FileReader("words.txt")));
            int x;
            for(x=0; scan.hasNext(); x++){
                scan.next();
            }

            String [] words= new String [x];
            scan = new Scanner(new BufferedReader(new FileReader("words.txt")));
            for (x=0; scan.hasNext(); x++) {
                words[x]= scan.nextLine();
            }

            //now we have an array of the words
            //starts at one bc at zero this is nothing to compare
           
            for(x=1; x<words.length; x++){
                for(int y=x; y>0; y--){
                    if(words[y].compareToIgnoreCase(words[y-1])<0){
                        String swap= words[y];
                        words[y]=words[y-1];
                        words[y-1]=swap;
                    }
                }
            }
            
            
            for(x=0; x<words.length; x++){
                System.out.println(words[x]);
            }
        } catch (Exception ohNoes) {
                System.out.println("An Exception Ocurred: " + ohNoes.getMessage());
                ohNoes.printStackTrace();
            }
    }
}


/**
 * Sorts seperate lists of numbers and words
 * Uses insertion sort for word and selection sort for number list
 * Prints sorted lists
 *
 * @author Chris Kontomaris
 * @version 12/1/17
 */
import java.util.Scanner;
import java.io.*;

public class Sorts{
    /**
     * Imports file of numbers to sort
     * Uses Insertion sort and prints results
     * Repeats above with a file of words and Selection sort
     * @param passes command line arguments 
     * @return prints sorted arrays
     */
    public static void main(String [] args){
        try {
            Scanner scan = new Scanner(new BufferedReader(new FileReader("nums.txt")));
            int x;
            for(x=0; scan.hasNext(); x++){
                scan.next();
            }

            int [] nums= new int [x];
            scan = new Scanner(new BufferedReader(new FileReader("nums.txt")));
            for (x=0; scan.hasNext(); x++) {
                nums[x]= scan.nextInt();
            }

            //now we have an array of the words
            //go through the whole array and record the lowest value found, swap it with the first
            int low;
            //go throug each index
            //

            int y;
            for(x=0; x<nums.length; x++){
                //find lowest value past x
                //make low the index, not the value so that the swap is easier
                low= x;
                for(y=x; y<nums.length;y++){
                    //find min
                    if (nums[y]<nums[low]){
                        //record value
                        low =y;
                    }
                }
                int swap= nums[low];
                nums[low]=nums[x];
                nums[x]=swap;
            }
            //needs temporary swap variable
            System.out.println("OK, here's your sorted list of numbers, courtesy of selection sort!");
            for(int z=0; z<nums.length;z++){
                System.out.println(nums[z]);
            }

            scan = new Scanner(new BufferedReader(new FileReader("words.txt")));

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
                for(y=x; y>0; y--){
                    if(words[y].compareToIgnoreCase(words[y-1])<0){
                        String swap= words[y];
                        words[y]=words[y-1];
                        words[y-1]=swap;
                    }
                }
            }

            System.out.println("OK, here's your sorted list of words, courtesy of insertion sort!");
            for(x=0; x<words.length; x++){
                System.out.println(words[x]);
            }
        }catch (Exception ohNoes) {
            System.out.println("An Exception Ocurred: " + ohNoes.getMessage());
            ohNoes.printStackTrace();
        }    
    }
}
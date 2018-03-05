//selection sort integers
import java.util.Scanner;
import java.io.*;
public class SelectionSort{
    public static void main(String [] args){
        //takes the next index and keeps pushing it down until its sorted
        //nested fors
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
            for(int z=0; z<nums.length;z++){
                System.out.println(nums[z]);
            }
        
        }catch (Exception ohNoes) {
                System.out.println("An Exception Ocurred: " + ohNoes.getMessage());
                ohNoes.printStackTrace();
            }
    }
}

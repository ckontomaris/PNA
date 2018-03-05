/* Write a program that loops from 0 to 100 and prints the multiples of 3 and the multiples of 4.
 * if a number is a multiple of BOTH 3 and 4 it should only appear once. 
 * One loop only!
 */

public class loop_with_multiples{
    public static void main(String [] args){
        //started loop at 1, otherwise, 0% any number=0, so it triggers an incorrect message
        for(int num=1; num<=100;num++){
            if ((num%3==0)&&(num%4==0)){
                System.out.println(num+ " is a multiple of 3 AND 4!!!");
            } else if (num%3==0) {    
                System.out.println(num+ " is a multiple of 3!");
            } else if (num%4==0){
                System.out.println(num+ " is a multiple of 4!");
            } else{
            
            }
        }
        //use an if else chain so that the program can check if it is a multiple of either, but also will only print it once
        //the if else chain breaks after the first condition is met    
    }
}

import java.util.Scanner;
public class BinaryPrint{
  public static void main(String [] args){
    Scanner input= new Scanner(System.in);  
    System.out.println("Put in a number to see in binary");
    int x= input.nextInt();
    BinaryPrint(x);
  }
  
  public static void BinaryPrint (int x){
      //if our number has been divided by 2 and equals 0, we know we are done
      if (x==0){
      return;
    }
    //the remainder of diviing by two is what we print for the 1 or 0
    int y = x%2;
   //now we actally remove that power of 2 from the number
   x=x/2; 
    
    //call the method BEFORE
   //so that we print from the last number upwards to the first
    BinaryPrint(x);
    
    System.out.print(y);
    
  }
}


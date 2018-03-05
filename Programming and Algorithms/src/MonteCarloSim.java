import java.util.Random; 

public class MonteCarloSim{
    public static void main(String [] args){
        int a;
        int b;
        int sum;
        //made 12 so that the index number (0-12) can correspond to the summed value
        //if it has only 12 indices (0-11) than I will have to change how I read the array values
        int [] store= new int[13];
        Random rand= new Random();
        for(int x=0; x<=10000; x++){
            a= rand.nextInt(6)+1;
            b= rand.nextInt(6)+1;
            sum=a+b;
            //we have to subtract one because 
            store[sum]++;
        }

        //printing the results
        for(int x=2; x<=12; x++){
            System.out.println("There were "+store[x]+ " spins with a value of "+ x);    
        }

    }
}
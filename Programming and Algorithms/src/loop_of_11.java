public class loop_of_11{
    public static void main (String [] args){
        int number=0;
        for(number=0; number<200; number++){
            if (number%11==0){
                System.out.println(number + " is a multiple of 11, and between 0 and 200!!");
            }
        }
    }
}
//you could also just increment by 11 until 200

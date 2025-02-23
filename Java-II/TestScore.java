import java.util.*;
public class TestScore{
    public static void main(String args[]) throws Exception{

        final int MAX=100;
        final int MIN=0;

        Scanner input = new Scanner(System.in);
        int userinput, output =0;

        int[] studentnum = {1234, 2345, 3456, 4567, 5678};
        int[] studentscores = {0, 0, 0, 0, 0};

        try{
            for(int x=0; x <studentnum.length; ++x){
            System.out.println("Enter score for student id number: "+ studentnum[x] + " >>");
            userinput = input.nextInt();
            studentscores[x] = (userinput);
        }
    
        if(userinput<MIN){
            throw new ScoreException("Score must be greater than or equal to 0 - score is 0");
        }
        else if(userinput>MAX){
            throw new ScoreException("Score must be less than or equal to 100 - score is 0");
        }
        else{
                ;}}

        catch(NumberFormatException exception){
            throw new ScoreException("Score must be an integer input - score is 0");

        }
    }
}
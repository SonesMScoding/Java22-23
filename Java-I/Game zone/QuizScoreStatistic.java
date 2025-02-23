import java.util.Scanner;

public class QuizScoreStatistic{
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        System.out.print("Enter a score>>");
        int firstScore = input.nextInt();

        int score;
        int[] Scores = {};

      do{
          System.out.print("Enter another score or 99 to quit >>");
            score = input.nextInt();
      }while (score != 99);     
       
    }
}

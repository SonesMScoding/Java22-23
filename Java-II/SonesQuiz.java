import java.util.*;

//quiz elements
public class SonesQuiz {

    
    public static void main(String[] args){

    String One = "3 x 10 =\n" + "A. 33\nB. 11\nC. 30\n";    //C.
    String Two = "1 x 7 =\n" +"A. 13\nB. 7\nC. 8\n";        //B.
    String Three = "5 x 10 =\n" +"A. 50\nB. 25\nC. 10\n";   //A.
    String Four = "8 x 1 =\n" +"A. 8\nB. 9\nC. 10\n";       //A.
    String Five = "6 x 4 =\n" +"A. 16\nB. 10\nC. 24\n";     //C.
    String Six = "3 x 6 =\n" +"A. 8\nB. 10\nC. 18\n";       //C.
    String Seven = "2 x 9 =\n" +"A. 6\nB. 18\nC. 20\n";     //B.
    String Eight = "7 x 12 =\n" +"A. 84\nB. 80\nC. 72\n";   //A.
    String Nine = "6 x 1 =\n" +"A. 3\nB. 12\nC. 6\n";       //C.
    String Ten = "6 x 11 =\n" +"A. 60\nB. 66\nC. 30\n";     //B.
    
    Q[] questions={
        new Q(One, "C"),
        new Q(Two, "B"),
        new Q(Three, "A"),
        new Q(Four, "A"),
        new Q(Five, "C"),
        new Q(Six, "C"),
        new Q(Seven, "B"),
        new Q(Eight, "A"),
        new Q(Nine, "C"),
        new Q(Ten, "B")};

        quizSim(questions);
    }
       

//question class in seperate file cause I want to make objects

//take the quiz
public static void quizSim(Q [] questions){

    int score=0;
    String answer;
    Scanner input = new Scanner(System.in);

    try{
    for(int i=0; i<questions.length; i++){
        System.out.println(questions[i].question);
        answer = input.nextLine();
                if(answer != "A" || answer != "B" || answer != "C")
                    throw new Exception();

        if(answer.equals(questions[i].answer)){
            score++;
        }
    }
    }
    catch(Exception e){
        System.out.println("You must enter 'A', 'B', or 'C' to carry on...");
    }
    finally{

    }
    
    System.out.println("Out of 10 questions:");
    System.out.println(score + " were right.");
    System.out.println((10-score) + " were wrong.");


}}

//quiz methods

//exceptions
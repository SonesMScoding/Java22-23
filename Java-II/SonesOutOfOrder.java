/*In the children’s game Out of Order, the user is presented with a series of values—for example, 
A, B, C, E, D, F—and is asked to identify the first item in the list that is out of order. 

(You may use an ArrayList or a LinkedList)

lists of letters, numbers, and words with one element in each list out of order. 

In turn, pass each list to a generic method named display() 
that displays the list and the instructions for the game. Accept the user’s answer, and then pass the user’s answer 

and the correct answer to a generic method named checkAnswer() that displays both parameters.

Add comments to your program above every line of code explaining what each line does. (10 points)

Save the program as LastNameOutOfOrder.java. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SonesOutOfOrder {
    public static void main(String[] args) {
        //making array lists and populating 
        ArrayList<String> words = new ArrayList<String>(Arrays.asList("Apple","Coconut", "Banana"));

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,3,2));

        ArrayList<Character> characters = new ArrayList<Character>(Arrays.asList('A','C','B'));
        

        // call display that calls checkAnswer
        display(words);
        display(numbers);
        display(characters);
    }

    public static <T> void display(ArrayList<T> lyst){                               //variable to hold user input   
        Scanner in =  new Scanner(System.in);                                       // scanner
        
        System.out.println("Hey kiddo! Which is the FIRST out of order value??"); //prompt
        System.out.println(lyst);                                                     //print lyst
        String answer=  in.next();                                                   // assign answer to input
        checkAnswer(answer);                                                        // call checkAnswer

    }

    public static <T> void checkAnswer(T answers){

        String result = ("You got this answer correct!! The out of order item was " + answers + "\n"); // correct answer response

            if(answers.equals("Coconut")){
                System.out.println(result);
            }
            else if (answers.equals("3")){
                System.out.println(result);
            }
            else if (answers.equals("C")){
                System.out.println(result);
            }
            else{
                System.out.println("Womp Womp... Keep going!!\n"); // answer was wrong
            }

    }
}

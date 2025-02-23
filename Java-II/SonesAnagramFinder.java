import java.util.Scanner;

public class SonesAnagramFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userInput;

        System.out.print("Enter a word >> ");
        userInput = in.nextLine();

        anagramIt("",userInput);
        System.out.println();
        in.close();
    }

    public static void anagramIt(String first,String userInput){
        if(userInput.length() <= 1) {
            System.out.println(first + userInput);
        } 
        else {
            for(int i = 0; i < userInput.length(); i++) {

                String now = userInput.substring(i, i + 1);
                String before = userInput.substring(0, i);
                String after = userInput.substring(i + 1); 
                anagramIt(first + now, before + after);
            }
        }
        
    }
}

   /*you can write a program that displays every combination of the given letters 
    so a player can read them and notice possible plays. Such a program lends 
    itself to recursion because you can create every combination of letters by 
    taking one letter at a time (using the substring() method), using it as the 
    first letter in a new combination, and then recombining all the letters that 
    precede it and all the letters that follow it to form new words. */
    
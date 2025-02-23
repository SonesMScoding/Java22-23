import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SonesSecretPhrase2 {
    
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        
            String userletter = "Enter one letter>> ";
            String incorrect = "Incorrect! That letter is not in the phrase. ";
            String correct = "This is a correct letter! ";

            String userResponse;
            char ch;                    //letter in the phrase
            char guess;                 //letter guess
            String displayPhrase = "" ;
            int random;
            String selectedP;
            

        Path file = 
            Paths.get("C:\\Users\\heyoi\\OneDrive - prcc.edu\\Desktop\\JavaII\\newPhrases.txt");
        String str;

        List<String> listOfPhrases
            = new ArrayList<String>();

        InputStream input = 
            new BufferedInputStream(Files.newInputStream(file));

            BufferedReader reader = 
            new BufferedReader(new InputStreamReader(input));

            str = reader.readLine();
            int listcount = 0;
            
            while(str != null){
                    listOfPhrases.add(str);
                    String phraseArray [] = listOfPhrases.toArray(new String[listcount]);
                    str = reader.readLine();
                    listcount++;

            }
            //randomly select an item from array
        random = (int) (Math.random() * 100) % phraseArray.length;
        selectedP = phraseArray[random];
            reader.close();


        int len = selectedP.length();
        int i = 0;
                                        //convert  nspc to *
                                        //Convert each space to a space 
            while(i < len)
            {
                if(selectedP.charAt(i) == ' ')
                {
                    displayPhrase += ' ';
                }
                else
                {
                    displayPhrase += '*';
                }
                i++;
            }
                                        //display "jan van eyck" -> "*** *** ****"
                                        //ask user to guess the phrase



        System.out.println("What is the phrase? \n");

        System.out.println("\t" + displayPhrase + "\n");

        boolean found = false;

        while(displayPhrase.indexOf('*') != -1)
        {
            System.out.print(userletter);
            userResponse = in.nextLine().toLowerCase();
            guess = userResponse.charAt(0);
            found = false;

            for (int j = 0; j < len; j++)
            {
                ch = selectedP.toLowerCase().charAt(j);

                if(ch == Character.toLowerCase(guess))
                {
                    displayPhrase = displayPhrase.substring(0, j) + guess + 
                                    displayPhrase.substring(j+1, len);

                    found = true;
                }
            }

             if(!found)
                {
                    System.out.println(incorrect + guess);
                }
                else
                {
                System.out.println(correct);
                }

            System.out.println("\t"+ displayPhrase.toUpperCase() + "\n");
        }

        System.out.println("Well done! The phrase was: " + phraseArray[random]);
        input.close();
    }

}
/* Create a game that randomly selects a phrase from the Phrases.txt file 
and allows a user to guess the phrase letter by letter.  */
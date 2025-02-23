import java.util.Scanner;
import java.nio.file.*;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import static java.nio.file.StandardOpenOption.*;

public class SonesPhrase {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Path file = 
            Paths.get("C:\\Users\\heyoi\\OneDrive - prcc.edu\\Desktop\\JavaII\\newPhrases.txt");
        String phrase;

        String str;
        final String QUIT = "999";

        try
        {
            OutputStream output = 
                new BufferedOutputStream(Files.newOutputStream(file, CREATE, APPEND));
            BufferedWriter writer = 
                new BufferedWriter(new OutputStreamWriter(output));

                System.out.print("Welcome to game creation. Remember, when making phrases for the game avoid any symbols or unnecessary whitespaces.\n");

            System.out.print("Enter a sentence phrase for the game(999 to quit)>> ");
            phrase = input.nextLine();
            //input.nextLine();
            while(!(phrase.equals(QUIT)))
            {

                str = phrase;
                writer.write(str, 0, str.length());
                writer.newLine();

                System.out.print("Enter a sentence phrase for the game(999 to quit)>> ");
                phrase = input.nextLine();

            }
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println("Error message: " + e);
        }

        input.close();
    }

}

/*In several Game Zone assignments earlier in this course, you created games similar to Hangman 
in which the user guesses a secret phrase by selecting a series of letters. 
These versions had limited appeal because each contained only a few possible phrases 
to guess; after playing the games a few times, the user would have memorized all the phrases.

Now create a version in which any number of secret phrases can be saved to a file before the game is played.
 Use a text editor such as Notepad to type any number of phrases into a file, one per line. 
Save the file as Phrases.txt.*/
import java.util.Scanner;

public class SonesSecretPhrase
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String[] secretP = {"Lorenzo Ghiberti", "Donatello", "Jan van Eyck", "Giovanni Bellini",
         "Andrea Mantegna", "Sandro Botticelli", "Leonardo da Vinci", "Albrecht Durer", "Michelangelo","Raphael"};

            String userletter = "Enter one letter>> ";
            String incorrect = "Incorrect! That letter is not in the name. ";
            String correct = "This is a correct letter! ";
            String userResponse;
            char ch;                    //letter in the name
            char guess;                 //letter guess
            String displayArtist = "" ;
            int random;
            String selectedP;

                                        //randomly select an item from array
        random = (int) (Math.random() * 100) % secretP.length;
        selectedP = secretP[random];
        int len = selectedP.length();
        int i = 0;
                                        //convert  nspc to *
                                        //Convert each space to a space 
            while(i < len)
            {
                if(selectedP.charAt(i) == ' ')
                {
                    displayArtist += ' ';
                }
                else
                {
                    displayArtist += '*';
                }
                i++;
            }
                                        //display "jan van eyck" -> "*** *** ****"
                                        //ask user to guess the phrase

        System.out.println("What is the name of the artist? \n");

        System.out.println("\t" + displayArtist + "\n");

        boolean found = false;

        while(displayArtist.indexOf('*') != -1)
        {
            System.out.print(userletter);
            userResponse = scan.nextLine().toLowerCase();
            guess = userResponse.charAt(0);
            found = false;

            for (int j = 0; j < len; j++)
            {
                ch = selectedP.toLowerCase().charAt(j);

                if(ch == Character.toLowerCase(guess))
                {
                    displayArtist = displayArtist.substring(0, j) + guess + 
                                    displayArtist.substring(j+1, len);

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

            System.out.println("\t"+ displayArtist.toUpperCase() + "\n");
        }

        System.out.println("Well done! The artist was: " + secretP[random]);
        scan.close();
    }

}
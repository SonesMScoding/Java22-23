import java.util.Scanner; 
public class SonesRandomGuess
{

        public static void main(String[] args)
        {

                final int MIN = 0;
                final int MAX = 100;

                int guess,random;

                random  = MIN + (int)(Math.random() * MAX);
                guess = getGuess(MIN, MAX);

                boolean rightG = random == guess;

                guessNum(random, guess, rightG);
           
        }       //end main
    
        
        public static int getGuess(int MIN, int MAX)
         { 
            Scanner input = new Scanner(System.in);

            System.out.println("Guess a whole number between " + MIN + "-" + MAX + " >>");
            int guess = input.nextInt();
            return guess;
         }


        public static void guessNum(int random, int guess, boolean rightG)
        {
            if (rightG)
            {
                System.out.println("You guessed correctly! Your guess was " + guess + " and the number was " + random);
                System.out.println("The difference is zero.");
            }

               else
               {
                 // display values and find the different
                    int diff = Math.abs(random - guess);

                        System.out.println("You guessed..." + guess + " ,but unfortunately the number was: " + random);
                        System.out.println("Shoot, your guess was off by this much >> " + diff + ".\nThat is the difference between your guess and the number.");
                    
                }
            
            }

        }   


//Write a program that declares final values for MIN (0) and MAX(100) within its main() method 
//and passes the values to a method that displays a message asking the user to guess a value 
//between MIN and MAX.

//Accept the user's guess and return it to the main() method.
        
//Set a boolean variable to true if the user guessed the value and false if the user did not guess the value. 

//Call a method that accepts the random value, the user's guess value, 
//and the boolean value and then displays all the values as well as 
//how far away the user's guess was from the random number. 

//Save the file as YourLastNameRandomGuess.java.

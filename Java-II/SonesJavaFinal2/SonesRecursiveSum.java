/*
  Write program that accepts an integer input and
   displays the sum of the numbers between the input value and the inputvalue plus five.


Write a recursive function to accomplish this. The function will return the sum of the numbers.
When running the program, the output should look like the following:

Enter a number >>> 5
The sum of the numbers between 5 and 10 is 45

Save the program as LastNameRecursiveSum.java


The program compiles and run without errors [X]
The program accepts an integer from the user [X]
A recursive function is present; it calculates and return the sum of the numbers between the
input value and the input value plus five.[]
The program displays the correct output; the output of the program is 
similar to the example provided[X]
Exception and error handling code is present to make sure the integer value is entered. [X]
The program includes comments that shows understanding of the code []


 */
import java.util.Scanner;
public class SonesRecursiveSum{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      int x, y, answer;
      final int GAP = 5;

      System.out.print("Enter a number >>");
      x = input.nextInt();      // will not accept anything but an int

      y = x + GAP;              // making the end point
      answer = sum(x, y);       // calling the function

      System.out.println("The sum of all the numbers between ");
      System. out.println("     " + x + " and " + y + " is " + answer);
   }
   public static int sum(int x, int y)
   {if (y == x) return y;
    int first = Math.min(x, y);
    return first + sum(first + 1, Math.max(x, y));    //adding the range ontop of a variable

   }
}



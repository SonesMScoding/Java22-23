
import java.util.Scanner;

public class Numbersdemo
{
    

    public static void main(String args[])
    {
    Scanner input = new Scanner(System.in) ;

     int num1, num2;
    
        System.out.println("Enter an integer >> ");
            num1 = input.nextInt();

        System.out.println("Enter another integer >> ");
            num2 = input.nextInt();
        
    displayTwiceTheNumber(num1, num2);
    displayNumberPlusFive(num1, num2);
    displayNumberSquared(num1, num2);


    }


    public static void displayTwiceTheNumber(int num1, int num2)
    {

        System.out.println(num1 + " times 2 is " + (num1 * 2));

    }


     public static void displayNumberPlusFive(int num1, int num2)
    {

        System.out.println(num1 + " plus 5 is " + (num1 + 5));

    }


     public static void displayNumberSquared(int num1, int num2)
    {

        System.out.println(num1 + " squared is " + (num1*num1));

    }


 
    
}

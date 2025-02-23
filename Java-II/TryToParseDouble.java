import java.util.*;

public class TryToParseDouble
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        double inputDouble = 0.0;

           try 
           {
            System.out.println("Please enter a floating point number >>");
            inputDouble = input.nextDouble();
           }
           catch(NumberFormatException exception)
           {
                inputDouble = 0.0;
                System.out.println("Value entered cannot be converted to a floating-point number");
           }

           System.out.println("Number is " + inputDouble);
        } 
    }
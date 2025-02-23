import java.util.Scanner;
public class debugging2
{
   public static void main(String[] args)
   {
      int oneInt;
      double oneDouble;
      String oneString;

      try (Scanner input = new Scanner(System.in)) {
        System.out.print("Enter an integer >> ");
          oneInt = input.nextInt();

          System.out.print("Enter a double >> ");
          oneDouble = input.nextDouble();

        
          System.out.print("Enter a string >> ");
          oneString = input.nextLine();
    }

      System.out.print("The int is " + oneInt);

      System.out.print("The double is" + oneDouble);

      System.out.print("The String is " + oneString);
      }}
    

// This application displays some math facts
import java.util.Scanner;
public class debug3
{
   public static void main(String args[])
   {
     
      Scanner input = new Scanner(System.in);

     int a, b, c;

      System.out.print("Enter an integer >> ");
      a = input.nextInt();

      System.out.print("Enter a second integer >> ");
      b = input.nextInt();

      System.out.print("Enter a third integer >> ");
      c = input.nextInt();

      add(a, b);
      add(b, c);
      add(a, c);
      subtract(a, b);
      subtract(b, c);
      subtract(a, c);  
   }

   
   public static void add(int a, int  b)
   {
      System.out.println("The sum of " + a +
         " and " + b + " is " + (a + b));
   }
   public static void subtract(int a, int b)
   {
      System.out.println("The difference between " + a + " and "+ b + " is " +  (a - b));
   }
}

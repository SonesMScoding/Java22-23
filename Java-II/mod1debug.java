// Application lists valid shipping codes
// A, C, T, or H
// then prompts user for a code
// Application accepts a shipping code
// and determines if it is valid
import java.util.*;
public class mod1debug
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in); 
      char userCode;
      String entry;
      boolean found = true;
      char[] okayCodes = {'A','C','T','H'};
      System.out.println("Enter shipping code for this delivery.");
      System.out.print("Valid codes are: ");
      for(int x = 0; x < 4; x++)
      {
          System.out.print(okayCodes[x]);
             System.out.print(", ");     
      }
      System.out.print(" >> ");
      userCode = input.next(); 
      for(int i = 0; i < okayCodes.length; ++i)
      {
         if(userCode == okayCodes[i])
         {
            found = true;
         }
      }
      if(found = true)
         System.out.println("Good code");
      else
         System.out.println("Sorry code not found");
   }
}

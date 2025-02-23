/* 
Java program containing an array of 15 String values. 
Accept any number of Strings up to 15 from a user. 
Display the contents of the array.

Send the array to a method to sort and display the array in ascending order.
Write another method to search for a specific value in the array.

In the main method, ask the user to enter a String value to search.
 After asking the user for a value, 
call the search method and returns true if the value was found, false otherwise.

Display the proper message.
Test this program with a string that exists in the array and a string that does not exist in the array.  

NECESSARY:
The program compiles and run without errors [X]

The program contains an array of 15 String values entered by the user; the contents of the
array are displayed [X]

The program contains a method to sort and display the array in ascending order [X]

A method to search for a specific value in the array is present [X]

The main method asks user for a String value to be searched in the array [X]

The program displays the proper message if the String exist in the array or not. [X]

*/

import java.util.*;

public class SonesStringSort{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int MAX = 15;
        int count = 0;
        ArrayList<String> names = new ArrayList<String>();
 
        System.out.println("Enter the names of your characters (1-15)! ZZZ to submit>>>> ");

        while (in.hasNextLine()) {
            String input = in.nextLine();
            if(input.equals("ZZZ") || count == MAX){
                break;
            }
            else{
            names.add(input);
            count++;
            }
        }
       

        System.out.println(names);
        System.out.println("I have taken the time to organize your characters!!>>>");
        AscendList(names);

        System.out.println("Double check and make sure your character name is in the list! >>>> ");
        String searchIn = in.nextLine();
        SearchList(names, searchIn);

    }

    public static void AscendList(ArrayList<String> lyst){
        Collections.sort(lyst);
        System.out.print(lyst);
} 

public static void SearchList(ArrayList<String> lyst, String userinput){
    System.out.println("Is "+ userinput +" in the list? ");
    if(lyst.contains(userinput) == false){
        System.out.println("Oof this character is NOT in the list!");
    }
    else{
        System.out.println("Woop Woop! " +userinput+ " is in the list!!");
    }


}
}


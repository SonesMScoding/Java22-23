/* 
 Debug the code and correct any errors=.. syntax and logic errors.

Once the program is running correctly and displaying the author and his/her book, 
write a method to display the contents of the 2D array.
 Display the contents of the array before asking for user input.

Convert to a method (the section of the code that loops through the array searching for the author)
The method returns true or false. 

If true, display the name of the book and the author. 
If false, display the current message that the book does not exist.

Add code to allow the user to enter lowercase letters and still find the correct author in the array. 
(Currently the program is case sensitive. You want to make sure it is not case sensitive.)

NECESSARY:
The program compiles and run without errors after all errors have been corrected [X]

A method to display the contents of the 2D array [X]

A method to loop through the array searching for the author is present and returns true or
false; if true, the name of the book and the author is displayed, otherwise a message is
displayed stating the book does not exist  [X]

The program is case insensitive. The user can enter upper-case or lower-case letters [X]

*/

import java.util.*;
/*
 * This program contains a 2D array showing the name of a book and the
 * author of the book. This program allows the user to enter the
 * first 3 letters of the author's name and then display the book written
 * by that author. If the author does not exist, the program asks the user
 * to enter the first three letters of another author. The loop stops when
the
 * author is found and the book by that author is displayed.
 */
public class SonesBookAuthor {
 public static void main(String[] args)
 {

 String[][] books = new String[6][2];
 books[0][0] = "Ulysses";
 books[0][1] = "James Joyce"; 

 books[1][0] = "Lolita";
 books[1][1] = "Vladimir Nabokov";

 books[2][0] = "Huckleberry Finn";
 books[2][1] = "Mark Twain";

 books[3][0] = "Great Gatsby";
 books[3][1] = "F. Scott Fitzgerald";

 books[4][0] = "1984";
 books[4][1] = "George Orwell";

 books[5][0] = "Sound and the Fury";
 books[5][1] = "William Faulkner";

 Display(books);
 SearchAuthors(books);
}

 public static void SearchAuthors(String[][] lyst){
    Scanner input = new Scanner(System.in);
String entry;
String shortEntry;
int x;
boolean isFound = false;
 
    while(!isFound){ 
 
        System.out.println("Enter the first 3 letters of the authors first name >> ");
        entry = input.nextLine();

 shortEntry = entry.substring(0,3);

 for(x = 0; x < 6; x++){

 if(lyst[x][1].substring(0, 3).equalsIgnoreCase(shortEntry)){
 isFound = true;
 break;

}
}

 if(isFound == true){
    System.out.println(lyst[x][0] +
    " was written by " + lyst[x][1]);
 }
 else{
 System.out.println("Sorry - no such book in our database");}
}

}


public static void Display(String [][] lyst){
    System.out.println(Arrays.deepToString(lyst));
}
 }



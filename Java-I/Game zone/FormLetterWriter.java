import java.util.Scanner;

// Write your code here
public class FormLetterWriter
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        String fName, lName;

        System.out.println("Enter first name >> ");
            fName = input.nextLine();

        System.out.println("Enter last name >> ");
            lName = input.nextLine();

        displaySalutation(fName);
        displaySalutation(fName, lName);

}

public static void displaySalutation(String fName) 
{
    System.out.println("Dear " + fName +  ", ");
    System.out.println("Thank you for your recent order.");   
}

public static void displaySalutation(String fName, String lName)
{
    System.out.println("Dear " + fName + " " + lName +", ");
    System.out.println("Thank you for your recent order.");   
}
}
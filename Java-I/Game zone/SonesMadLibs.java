
//Dr. Preston,
//My program is simple but contains a lot of strings for the madlib method. 
//there are 12 and I am not certain how to format them to look pretty.

//my apologies,
//
//Lillian S. 







import java.util.Scanner;
public class SonesMadLibs 
{
        public static void main(String args[])
    {Scanner input = new Scanner(System.in);
        //It was a {adj}, {month}, day
        //I woke up to the smell of, {food}
        //cooking in the kitchen.
        // I {verb past tense} into the kitchen 
        //to see if i could {verb} the dinner.
        //My {a member of your family} asked 
        //"Would {family member name} like a glass of {liquid}?"
        //So i carried a tray of {the liquid} into the living room
        //When I got there I couldnt believe my {body part}!
        //There was {pluralnoun}, {verb ending in ing} on the {noun}!

    String adj, month, food, PastTense, verb, familymember, familymemberName, liquid, bodyPart, PluralNoun, Verbing, noun;

        System.out.println("Enter an adjective>> ");
           adj = input.nextLine();

           System.out.println("Enter a month of the year>> ");
          month = input.nextLine();

        System.out.println("Enter a food>> ");
           food = input.nextLine();

        System.out.println("Enter a past tense verb>> ");
           PastTense = input.nextLine();

        System.out.println("Enter a verb>> ");
            verb = input.nextLine();

        System.out.println("Enter a type of family member>> ");
           familymember = input.nextLine();

        System.out.println("Enter a family member's name>> ");
           familymemberName = input.nextLine();

        System.out.println("Enter a liquid>> ");
           liquid = input.nextLine();

        System.out.println("Enter a body part>> ");
            bodyPart= input.nextLine();

        System.out.println("Enter a plural noun>> ");
            PluralNoun = input.nextLine();

        System.out.println("Enter a verb ending with '-ing'>> ");
            Verbing = input.nextLine();

        System.out.println("Enter a noun>> ");
           noun = input.nextLine();

           ItWasaDay(adj, month, food, PastTense, verb, familymember, familymemberName, liquid, bodyPart, PluralNoun, Verbing, noun);
    }


        public static void ItWasaDay(String adj, String month, String food, String PastTense, String verb, String familymember, String familymemberName, String liquid, String bodyPart, String PluralNoun, String Verbing, String noun)
        {

           System.out.println("It was a " + adj + ", " + month + " day...");

           System.out.println("I woke up to the smell of "+food);

           System.out.println("cooking in the kitchen.");

           System.out.println("I "+ PastTense +" into the kitchen");

           System.out.println("to see if I could "+verb+" the dinner.");

           System.out.println("My "+familymember+" asked");

           System.out.println("'Would "+ familymemberName +" like a glass of "+liquid+"?'");

           System.out.println("So I carried a tray of "+ liquid +" into the living room");

           System.out.println("When I got there I couldnt believe my "+ bodyPart +"!");

           System.out.println("There was "+PluralNoun+", "+Verbing+" on the "+noun+"!");       
    }

}

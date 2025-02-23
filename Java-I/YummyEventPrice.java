import java.util.Scanner;
public class YummyEventPrice {
  
    public static void main(String[] args){
        
        try (Scanner input = new Scanner(System.in)) {


//declare
            final int price, total; 


//motto
System.out.println("****************************************************");
System.out.println("*                                                  *");
System.out.println("*   Yummy makes the food that makes it a party.    *");
System.out.println("*                                                  *");
System.out.println("****************************************************");


//prompt
            System.out.print("How many guests were at the party? : ");
            int guests = input.nextInt();


//define
price = 35; 
total = guests * price; 


//output
            System.out.println(guests + "guests at $" + price + "per person, the total is $" + total );
            input.close();


//boolean             
       
        boolean a1 = true;
        boolean b1 = false;
 
         
        if (guests >= 50) {
            System.out.println("Classified: Large Event? " + a1);
        }
         
       
         
        else {  
            System.out.println("Classified: Large Event? " + b1);
        }


}
    	
        
//Yummy Catering provides meals for parties and special events. 

//Write a program that prompts the user for the number of guests
// attending an event and then computes the total price, which is $35 per person.

//Display the company motto with the border that you created in the YummyMotto2 class in Chapter 1, 
//and then display the number of guests, price per guest, and total price.

// Also display a message that indicates true or false depending on 
//whether the job is classified as a large event—an event with 50 or more guests.



 

    
}
}
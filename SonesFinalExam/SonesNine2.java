/* YourLastNameNine2.java program do the following:
1. Create an ArrayList object to store 3 CustomerMakingPurchase objects. In a loop, ask the user to enter these 3
customers.
2. Write a method to display the contents of the ArrayList. Call the method from the main method and display the
contents of the ArrayList after step 1.
3. Add exception and error handling code to make sure the customer ID is an integer, and the credit limit and
purchase amount are double values.


NECESSARY:
An ArrayList is present and contains 3 CustomerMakingPurchase objects. 
In a loop, the user enters these customers. []

A method is present and display the contents of the ArrayList []

Exception and error handling code is present to make sure integer and double values are
entered. []

*/

import java.util.*;
public class SonesNine2
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      int id;
      String name;
      double purchase;
      double credit;
      System.out.print("Enter customer ID >> ");
      id = input.nextInt();
      input.nextLine();
      System.out.print("Enter customer last name >> ");
      name = input.nextLine();
      System.out.print("Enter customer's credit limit >> ");
      credit = input.nextDouble();
      System.out.print("Enter customer's purchase amount >> ");
      purchase = input.nextDouble();
      SonesCustomerMakingPurchase cust = new SonesCustomerMakingPurchase(id, name, credit, credit);
      cust.display();

}}

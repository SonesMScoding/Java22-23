/* PART 1
 Debug the code and correct any errors you might find. There are syntaxand logic errors.

Once the program is running correctly, rename the file to include your last name in the name of the file.

This program will read data from a file containing customer IDs and corresponding discounts. 

The program uses a try/catch block to handle any file input/output errors. 

You will need to add code to display the correct percentage for each customer.

Customer ID AB1001 gets 0% discount
Customer ID HT1031 gets 10% discount
Customer ID ZB1476 gets 5% discount
Customer ID AZ1202 gets 0% discount
Customer ID CD1456 gets 3% discount
Customer ID EF3245 gets 0% discount
Customer ID VX4890 gets 4% discount
There are 7 records in this file

The program compiles and run without errors; all syntax and logical errors were corrected [X]
The program reads the input file and correctly displays the contents of the file as shown in the sample output [X]
Additional code is present to display the correct percentage values [X]
The program includes comments that shows understanding of the code [X] */

/* PART 2 
write a Java Swing application showing an input box, a button, and a label. 
 
Display these components using JFrame. The GUI Swing application will allow the user to type the 
customer ID in the input box. After pressing the submit button, the program will search the contents 
of the file for the existing ID. 

If found, the discount for the customer will be
displayed in a label, for example “Customer HT1031 discount is 10%’. 

If customer is not found, display a message in the
label that reads “Customer not found.”


The program compiles and run without errors []
The Swing application contains an input box, a button and a label []
The program reads the text file containing customer IDs and their discounts []
The program displays the correct message after the Submit button is pressed []
The program includes comments that shows understanding of the code  []
*/


import java.nio.file.*;
import java.io.*;

public class SonesReadFile{
 public static void main(String[] args)
 {
 Path file =
 Paths.get("CustFile.txt");     //Path to the data file – CusDiscountFile.txt

 String[] cusDisRec = new String[2]; //cusDisRec will store the data values

 String cusDis = "";
 String delimiter = ",";            //delimite
 String cusId;
double discount;

 int count = 0;

 try{
 InputStream input = new
 BufferedInputStream(Files.newInputStream(file));

 BufferedReader reader = new
 BufferedReader(new InputStreamReader(input));

 System.out.println();
 cusDis = reader.readLine();

 while(cusDis != null)
 {
 cusDisRec = cusDis.split(delimiter);   //splits data values
 cusId = cusDisRec[0];                  //stores value of CusId
 discount = Double.parseDouble(cusDisRec[1])*100;               //stores value of discount percentage

 System.out.println("Customer ID "+cusId+" gets "+discount+"% discount");
 cusDis = reader.readLine(); //read each line
 count = count+1;           //iterates
 }
 reader.close();

 System.out.println("There are "+ count + " records in this file.");
 }
 catch(Exception e)
 {
 System.out.println("Message: " + e);
 }
 }
}
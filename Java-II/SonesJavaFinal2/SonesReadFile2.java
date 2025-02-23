/* PART 2 
write a Java Swing application showing an input box, a button, and a label. 
 
Display these components using JFrame. The GUI Swing application will allow the user to type the 
customer ID in the input box. After pressing the submit button, the program will search the contents 
of the file for the existing ID. 

If found, the discount for the customer will be
displayed in a label, for example “Customer HT1031 discount is 10%’. 

If customer is not found, display a message in the
label that reads “Customer not found.”


The program compiles and run without errors [X]
The Swing application contains an input box, a button and a label [X]
The program reads the text file containing customer IDs and their discounts [X] // it would work but I cant write the result to the jframe
The program displays the correct message after the Submit button is pressed []
The program includes comments that shows understanding of the code  [X]
*/


import java.nio.file.*;
import java.util.Scanner;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import java.io.*;

public class SonesReadFile2{
 public static void main(String[] args)
 {

    JFrame frame = new JFrame("Customer ID DB");
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Search the Customer ID");
    JTextField text = new JTextField ("Enter Here....");
   JButton button = new JButton();
    button.setText("Submit");
   JTextArea displayresult = new JTextArea(null, null, 0, 0);

    panel.add(label);
    panel.add(text);
    panel.add(button);
    frame.add(panel);

    String entry = text.getText();
    button.addActionListener(e -> ButtonPressed(entry));
    

    frame.setSize(200, 300);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
 }



public static void ButtonPressed(String userinput){
 Path file =
 Paths.get("CustFile.txt");     //Path to the data file – CusDiscountFile.txt

 String[] cusDisRec = new String[2]; //cusDisRec will store the data values

String cusDis = "";
String delimiter = ",";            //delimiter
String cusId;
double discount;
int count = 0;
Scanner in = new Scanner(System.in);
boolean isFound = false;
String display;

 try{
 InputStream input = new
 BufferedInputStream(Files.newInputStream(file));

 BufferedReader reader = new
 BufferedReader(new InputStreamReader(input));

 while(!isFound){

cusDis = reader.readLine();
 cusDisRec = cusDis.split(delimiter);   //splits data values
 cusId = cusDisRec[0];                  //stores value of Id
 discount = Double.parseDouble(cusDisRec[1])*100;               //stores value of discount percentage

 for( int x = 0; x < 7; x++){
 if( cusId.equalsIgnoreCase(userinput) ){
    isFound = true;
    break;  
 }
}
 }
if(isFound == true){
display = ("Customer ID "+cusDisRec[0]+" gets "+Double.parseDouble(cusDisRec[1])*100+"% discount"); 
}
else{
display =("Customer not found."); 
}
JOptionPane.showInputDialog(display, null);

}
catch(Exception e){
 System.out.println("Message: " + e);
}

 }



}



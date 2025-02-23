import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class SonesBookDemo 
{
    public static void main(String[] args) {
        Path file = 
            Paths.get("C:\\Users\\heyoi\\OneDrive - prcc.edu\\Desktop\\JavaII\\JavaII Midterm\\books.txt");
            //correct path
        String str;
        String delimeter =",";
        String title;
        String strPrice;
        double price;
        String category;
        int len;
        int y = 0;
        int z = 0;
        
        String [] sonesBooksNF = new String[10];
        //sonesBooksNF[9] = "bleh";// dummy data
        String [] sonesBooksF = new String[10];

        
    
        try{
            InputStream input = 
            new BufferedInputStream(Files.newInputStream(file));

            BufferedReader reader = 
            new BufferedReader(new InputStreamReader(input));

            //str = reader.readLine();

                str = reader.readLine();

            while(str != null){//goes all the way to the last line of book.txt. I tried to do a for loop around it and in it but get null array strings
                title = str.substring(0, str.indexOf(delimeter,0));
                len = title.length();
                strPrice= str.substring(len+1, str.indexOf(delimeter, len+1));
                price = Double.parseDouble(strPrice);
                len = len + strPrice.length() +2;
                category = str.substring(len);


                //sonesBooksF[7] = title+delimeter+price+delimeter+category;//dummy code to test data 
            
                
                if(category.equals("Fiction")){      //if statement works
                    SonesBook sf = new SonesFiction(title, price);

                    sonesBooksF[y] =  sf.toString();
                    y++;
                }
                
        
                

                if(category.equals("Non-Fiction")){
                    SonesNonFiction snf = new SonesNonFiction(title, price);

                        sonesBooksNF[z] =  snf.toString();
                        z++;
                }

                
                str = reader.readLine();

            }
            
                reader.close();

            }


            catch(Exception e)
            {
                System.out.println("Error: " + e);
            }

            displayBook(sonesBooksNF, sonesBooksF);
    }


        




public static void displayBook(String [] sonesBooks, String [] sonesBooks2){/*, you cant put abstract object type arrays here */

    System.out.println("\nNonFiction Books\n===========================================");
    for( int i = 0; i < sonesBooks.length; i++){
    System.out.print(sonesBooks[i]);
    }
    
    
    System.out.println("\nFiction Book\n===========================================");

    for( int i = 0; i< sonesBooks2.length ; i++){
        System.out.print(sonesBooks2[i]);
    }
}  

}

//this would be right, but the contents have to be not null obv. 
//they have to be the nonfiction or fiction array that displays toString(); otherwise why have toString();
/*NonFiction Books
===========================================
null
null
null
null
null
null
null
null
null
null

Fiction Book
===========================================
null
null
null
null
null
null
null
null
null
null*/



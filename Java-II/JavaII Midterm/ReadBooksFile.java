import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadBooksFile 
{
    public static void main(String[] args) {
        Path file = 
            Paths.get("C:\\Users\\heyoi\\OneDrive - prcc.edu\\Desktop\\JavaII\\JavaII Midterm\\books.txt");
        String str;
        String delimeter =",";
        String bookName;
        String price;
        String category;
        int len;
    
        try{
            InputStream input = 
            new BufferedInputStream(Files.newInputStream(file));

            BufferedReader reader = 
            new BufferedReader(new InputStreamReader(input));

            str = reader.readLine();

            while(str != null)
            {
                bookName = str.substring(0, str.indexOf(delimeter,0));
                len = bookName.length();
                price= str.substring(len+1, str.indexOf(delimeter, len+1));
                len = len + price.length() +2;
                category = str.substring(len);
                System.out.println("Book name: " + bookName
                                    +"\nPrice: $" + price
                                    +"\nCategory: " + category + "\n");
                str = reader.readLine();
            }
                reader.close();
            }
        catch(Exception e)
            {
              System.out.println("Error message:" + e);      
            }
    }
}
 
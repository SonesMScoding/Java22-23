import java.util.Scanner;
import java.nio.file.*;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import static java.nio.file.StandardOpenOption.*;

public class WriteBooksFile {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Path file = 
            Paths.get("C:\\Users\\heyoi\\OneDrive - prcc.edu\\Desktop\\JavaII\\JavaII Midterm\\newBooks.txt");
        String delimeter =",";
        String bookName;
        Double price;
        String category;
        String str;
        final String QUIT = "999";

        try
        {
            OutputStream output = 
                new BufferedOutputStream(Files.newOutputStream(file, CREATE, APPEND));
            BufferedWriter writer = 
                new BufferedWriter(new OutputStreamWriter(output));

            System.out.print("Enter the book name (999 to quit)>> ");
            bookName = input.nextLine();
            //input.nextLine();
            while(!(bookName.equals(QUIT)))
            {
                System.out.print("Enter the price for this book >> $");
                price = input.nextDouble();
                input.nextLine();

                System.out.print("Enter the category for this book (Non-fiction or Fiction) >>");
                category = input.nextLine();

                str = bookName + delimeter + price + delimeter + category;
                writer.write(str, 0, str.length());
                writer.newLine();

                System.out.print("Enter the book name (999 to quit)>> ");
                bookName = input.nextLine();

            }
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println("Error message: " + e);
        }

        input.close();
    }

}

import java.util.Scanner;

public class SonesUseBook{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String title;
        String price;
        String category = "";
        //SonesNonFiction snf = null;
        String[] SonesFiction= new String[9];
        String [] SonesNonFiction = new String[9];

        try
        {
            for(int i =0; i < SonesNonFiction.length; i++){

            System.out.print("Enter the name of a Non-Fiction book >>");
            title = input.nextLine();
            input.nextLine();

            System.out.print("Enter the price of this book >> ");
            price = input.nextLine();
            input.nextLine();

            category = "Non-Fiction";
            
            SonesNonFiction[i] = title + price + category;

        
        }

        for(int i =0; i < SonesFiction.length; i++){

            System.out.print("Enter the name of a Fiction book >>");
            title = input.nextLine();
            input.nextLine();

            System.out.print("Enter the price of this book >> ");
            price = input.nextLine();
            input.nextLine();

            category = "Fiction";
            
            SonesFiction[i] = title + price + category;

        
        }

        }

        catch(Exception e)
        {
            System.out.println("Error: " +e);
        }

        displayBook(SonesNonFiction);
        displayBook(SonesFiction);

    }

    public static void displayBook(String[]SonesBook){
        
        if(SonesBook[])
            System.out.println("\nNonFiction Book\n======================");
            for(int i=0; SonesBook[0] != "Fiction"; i++ ){
        }       
    }
}


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PurchasesArrayListWithTotals
{
    public static void main(String[] args)
    {
        Scanner in =  new Scanner(System.in);
        ArrayList<Purchase> purchase = new ArrayList<Purchase>();

        String category;
        double price;
        final String QUIT = "ZZZ";

 System.out.print("Enter category for purchase or "+QUIT+" to stop >>>");
category = in.nextLine();

    while(!category.equalsIgnoreCase(QUIT))
    {
        System.out.print("Enter amount spent >> $");
        price = in.nextDouble();
        in.nextLine();

        purchase.add(new Purchase(category, price));

        System.out.print("Enter category for purchase or " + QUIT +" to stop >>");
        category = in.nextLine();
    }

    System.out.println();
    Collections.sort(purchase);
    display(purchase);

    in.close();
    }

    public static void display(ArrayList<Purchase> p)
    {
     double total = 0.0;
     String cat = p.get(0).getCategory();

     for(int i = 0; i < p.size(); i++){ 
         if (!p.get(i).getCategory().equals(cat))
         {
             System.out.println(" >>> Total for " + cat + ": $" +  total);
             System.out.println();
             total=0;
             cat = p.get(i).getCategory();
         }
         total += p.get(i).getPrice();
         System.out.println(""+p.get(i).getCategory() + " $"+ p.get(i).getPrice());

     } 
    System.out.println(" >>> Total for " + cat + ": $"+ total);
    System.out.println();

    }
}

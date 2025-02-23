import java.util.*;
public class SonesCreatePurchase {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) 
    {
        //Declare a Purchase object
        SonesPurchase sp1 = new SonesPurchase();
        //Declare all necessary variables

        //Prompts the user to enter the purchase details:
        //Invoice number and amount of sale
        System.out.print("Enter invoice number between (1,000 and 8,000)>> \n");
        sp1.setInvoiceNum(in.nextInt());
        while (sp1.getInvoiceNum()< 1000) {
            System.out.print("The invoice number is wrong \n Please re-enter >> \n");
            sp1.setInvoiceNum(in.nextInt());}
        while (sp1.getInvoiceNum()> 8000) {
            System.out.print("The invoice number is wrong \n Please re-enter >> \n");
            sp1.setInvoiceNum(in.nextInt());}

        System.out.print("Enter positive sale amount >> \n");
        sp1.setSaleTotal(in.nextDouble());

        while (sp1.getSaleTotal() < 0){
            System.out.print("The sale total is wrong \n Please re-enter >> \n");
            sp1.setSaleTotal(in.nextInt());}
        //When prompting for an invoice number,
        //do not let the user proceed until a number 
        //between 1,000 and 8,000 inclusive has been entered
        
        //When prompting for the sale amount, do not proceed
        //until the user has entered a nonnegative value

        //after a valid Purchase has been created, display the
        //object's invoice number, sale amount, and sales tax
        //use the object's display method
            sp1.display();
        //methods are not necessary in this class
    }
    
}

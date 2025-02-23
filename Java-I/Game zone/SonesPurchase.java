
public class SonesPurchase
{
    //Do not read any user input in this class!
    //Each purchase contains:
    //invoice number
    //amount of sale
    //amount of sale tax
    private int invoice;
    private double total; 
    private double saleTax;
    //Create a constructor for this class
    //Create the set methods for the class attributes

    public void setInvoiceNum(int num)
    {
        invoice = num;
    }

    public void setSaleTotal(double sale)
    {
        total = sale;
    }

    public void setSaleTaxes(double saletax)
    {
        saletax = getSaleTotal() * .05;
    }
    //Within the set method for the sale amount, 
    //calculate the sales tax as 5% of the sale amount
    
    public int getInvoiceNum(){
        return invoice;
    }

    public double getSaleTotal(){
        return total;
    }

    public double getSaleTaxes(){
        return saleTax;
    }
    //Create the get methods for the class attributes
    //Create a method to display the purchase's details:
    public void display() 
    {
        System.out.print("======================== \n");
        System.out.print("Invoice #" + getInvoiceNum() + "\n");
        System.out.print("======================== \n");
        System.out.print("Sales Amount:  $" + getSaleTotal()  + "\n");
        System.out.print("Taxes 5.0% : " + (getSaleTotal() * .05)  + "\n");
        System.out.print("Total Amount : $" + ((getSaleTotal() * .05) + getSaleTotal()) + "\n");
        System.out.print("======================== \n");
    }

    //invoice number, amount of sale, amount of sale tax,
    //and the total amount to be paid (amount of sale + amount of sale tax)
}


public class SonesCustomerMakingPurchase extends SonesCustomer
{
    private double amountOfPurchase;
    private boolean overLimit;
    public SonesCustomerMakingPurchase(int id,
       String name, double credit, double purchAmount)
    {
       super(id, name, credit);
       amountOfPurchase = purchAmount;
       if(amountOfPurchase > creditLimit)
          overLimit = true;
       else
          overLimit = false;
    }
    @Override
    public void display()
    {
       super.display();
       System.out.println("Purchase amount $" + amountOfPurchase);
       if(overLimit)
          System.out.println("**Credit denied - customer over limit");
       else
          System.out.println("Purchase Okay");
    }
}
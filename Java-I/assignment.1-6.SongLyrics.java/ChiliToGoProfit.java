import java.util.Scanner;

    public class ChiliToGoProfit{
    public static void main(String[] args){
Scanner scanner = new Scanner (System.in);
int ChildChili;
int AdultChili;
System.out.println("How many kids meals do y'all need?");
ChildChili = scanner.nextInt();
System.out.println("Awesome, and how many adult meals?");
AdultChili = scanner.nextInt();
int Childtotal = ChildChili*4;
int AdultTotal = AdultChili*7;
int TotalB4Tax = Childtotal + AdultTotal;
double CompleteTotal = TotalB4Tax*0.07 + TotalB4Tax;
System.out.println("Alright, your total is $" + CompleteTotal + ". Thank you, have a good day!");
//profit area
System.out.println(ChildChili + " kids meal(s) were ordered at $4 each.");
System.out.println("Total is $" + Childtotal);
System.out.println(AdultChili + " adult meal(s) were ordered at $7 each.");
System.out.println("Total is $" + AdultTotal);
double ChildCost = 3.10*ChildChili;
double AdultCost = 4.35*AdultChili;
double AllDayCosts = AdultCost + ChildCost;
double GrandTotal = TotalB4Tax - AllDayCosts;
 System.out.println("Profits:");
 double AdultProfits = AdultTotal - AdultCost;
 double ChildProfits = Childtotal - ChildCost;
 System.out.println("Adult Profits: $" + AdultProfits);
 System.out.println("Child Profits: $" + ChildProfits);
System.out.println("Hello master,today you have made $" + GrandTotal);
    }
}

import java.util.Scanner;

    public class ChiliToGo{
    public static void main(String[] args){
Scanner scanner = new Scanner (System.in);
int ChildChili;
int AdultChili;
System.out.println("How many kids meals do y'all need?");
ChildChili = scanner.nextInt();
System.out.println("Awesome, and how many adult meals?");
AdultChili = scanner.nextInt();
double Total = ChildChili*4 + AdultChili*7 * 0.07;
System.out.println("Alright, your total is $" + Total + ". Thank you, have a good day!");
    scanner.close();
    }
}

// Write your code here
import java.util.Scanner;
public class ChiliToGoProfit{

    /**
     * @param args
     */
    public static void main(String[] args) {

final double ADULT_MEAL = 7.00;
final double CHILD_MEAL = 4.00;

int numAdultMeals;
int numChildMeals;
double totalAdult;
double totalChild;
double grandTotal;

try (Scanner scan = new Scanner(System.in)) {
    System.out.println("Enter number of adult meals ordered: ");
    numAdultMeals = scan.nextInt();
    
    System.out.println("Enter number of child meals ordered ");
    numChildMeals = scan.nextInt();
}

totalAdult = numAdultMeals * ADULT_MEAL;

 totalChild = numChildMeals * CHILD_MEAL;

 grandTotal = totalAdult + totalChild;

System.out.println(numAdultMeals + " adult meals were ordered at $7.0 each.");

System.out.println("Total is $" + totalAdult);

System.out.println(numChildMeals + " child meals were ordered at $4.0 each.");

System.out.println("Total is $" + totalChild);

System.out.println("Grand total for all meals is $" + grandTotal);
  //  Profits:

        //      Adult profit is $15.900000000000002

        //      Child profit is $22.5

        //      Total profit is $38.400000000000006

 
    }
    
}

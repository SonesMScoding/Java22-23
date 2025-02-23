// Write your code here
import java.time.*;
import java.util.Scanner; 

public class TestMonthHandling
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int m, d ,y, m2, d2, y2;

        System.out.print("Enter month >> ");
        m = scan.nextInt();
        System.out.print("Enter day >> ");
        d = scan.nextInt();
        System.out.print("Enter year >> ");
        y = scan.nextInt();

        LocalDate dte1 = LocalDate.of(y, m, d);

        System.out.print("Enter month >> ");
        m2 = scan.nextInt();
        System.out.print("Enter day >> ");
        d2 = scan.nextInt();
        System.out.print("Enter year >> ");
        y2 = scan.nextInt();

        LocalDate dte2 = LocalDate.of(y2, m2, d2);

        System.out.print("First date " + dte1);
        System.out.print("Second date " + dte1.plusMonths(1));
        System.out.print("Third date " + dte1.plusMonths(2));
        System.out.print("Fourth date " + dte1.plusMonths(3));

        System.out.print("First date " + dte2);
        System.out.print("Second date " + dte2.plusMonths(1));
        System.out.print("Third date " + dte2.plusMonths(2));
        System.out.print("Fourth date " + dte2.plusMonths(3));
    }


}

import java.util.Scanner;

public class AcmePay 
{
    public static void main (String arg[])
    {
    Scanner ss = new Scanner(System.in);

int shift, hrsWorked , rplan; 
rplan = 0;

double hourlyPay = 0, regularPay, overtimePay = 0, totalPay = 0, retirement = 0, netPay = 0;

System.out.println("Enter shift (1,2,3): ");
shift = ss.nextInt();

System.out.println("Enter hour worked: ");
hrsWorked = ss.nextInt();

if (shift==1)
{
    hourlyPay = 17;
}

else if(shift == 2)
{
hourlyPay = 18.5;
System.out.println("Do you want retirement plan(1 for yes, 2 for no)?");
rplan = ss.nextInt();
}

else if (shift == 3)
{
hourlyPay = 18.5;
System.out.println("Do you want retirement plan(1 for yes, 2 for no)?");
rplan = ss.nextInt();
}

regularPay = hrsWorked*hourlyPay;

if (hrsWorked>40)
{ 
overtimePay = (hrsWorked -40)*0.5*hourlyPay;
totalPay = regularPay + overtimePay;
}

if (rplan == 1)
{
retirement = totalPay*0.03;
netPay = totalPay - retirement;
}

System.out.print("Shift = " + shift);
System.out.print("Hours Worked = " + hrsWorked);
System.out.print("Hourly Pay = "+ hourlyPay);
System.out.print("Regular Pay = "+regularPay);
System.out.print("Overtime Pay = " + overtimePay);
System.out.print("Total of regular and overtime = "+ totalPay);

if(retirement != 0)
{
    System.out.print("Retirement deduction = " + retirement);
}

System.out.print("Net Pay = " + netPay);

ss.close();

}
}


import java.util.Scanner;

public class Insurance
{


    public static void main(String args[])
    {

    Scanner input = new Scanner(System.in);


        int present, birth;

        System.out.println("Enter the current year >> ");
            present = input.nextInt();

        System.out.println("Enter the birth year >> ");
            birth = input.nextInt();


     calculatePremium(present, birth);

    }


    public static void calculatePremium(int present, int birth)
    {

        int decade;
        double premium;

        (present-birth) / 10 = decade;
        (decade + 15)20 = premium;

        System.out.println("The premium is $" + premium);

    }

    
}

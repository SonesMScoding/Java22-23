import java.util.Scanner;
public class SonesConversion

{
    public static void main (String[] args)
    {
    
        double inches, cent; 
        cent = 2.54;
    
         Scanner input = new Scanner(System.in);

    System.out.println("Enter the number of inches: ");
        inches = input.nextDouble();

        ConvertToCentimeters( inches, cent );

    }

    public static double ConvertToCentimeters(double inches, double cent)
    {
        cent = inches * cent;
        System.out.println(inches + " inches is equivilant to " + cent + " centimeters.");
        return cent;
    }
}

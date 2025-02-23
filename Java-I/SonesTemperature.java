import java.util.Scanner;
public class SonesTemperature 

{
    public static void main (String[] args)
    {
    
        double fahr, cels;
        cels = 0;
    
         Scanner input = new Scanner(System.in);

    System.out.println("Enter the temperature in fahrenheit : ");
        fahr = input.nextDouble();

        ConvertToCelsius( fahr, cels );

    }

    public static double ConvertToCelsius(double fahr, double cels)
    {
        cels = ((fahr - 32) * 5)/9;
        System.out.println(fahr + " degrees fahrenheit is equivilant to " + cels + " degrees celsius");
        return cels;
    }
}



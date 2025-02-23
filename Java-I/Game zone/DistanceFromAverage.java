import java.util.Scanner;

public class DistanceFromAverage{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[15];
        double total = 0;
        double average = 0;
        double entry;
        int x = 0;

        System.out.println("Enter a numeric value or 9999 to quit >>");
        entry = input.nextDouble();

        while(entry != 9999 && x < numbers.length){
            numbers[x] = entry;
            total+= numbers[x];
            x++;
            if(x < numbers.length){
                System.out.println("Enter a numeric value or 9999 to quit >>");
            }
            input.close();
        }
    if(x == 0){
        System.out.println("ERROR -  You did not enter any numbers." + "Calculations cannot be performed");
    }
    else {
        average = total / x;
        System.out.println("You entered " + x + " numbers and their average is " + average);
        for(int i = 0; i < x; i++){
            System.out.println(numbers[i] + " is " + (numbers[i]-average) + " away from the average.");
        }
    }
    }
    
}

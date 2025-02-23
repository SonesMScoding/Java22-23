

import java.util.Scanner;
    
public class InchesToFeetInteractive{     
    public static void main(String[] args){
        int inches;
        try (Scanner scanner = new Scanner (System.in)) {
            System.out.println("Please enter your inches.");
            inches = scanner.nextInt();
        }
        int feet = inches/12;
        int leftover = inches % 12; 
        System.out.println("After pondering, your inches convert to " + feet + "feet and" + leftover + "inches. ");
    }
}
// Write your code here

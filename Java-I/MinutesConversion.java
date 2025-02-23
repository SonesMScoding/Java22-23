// Write your code here
import java.util.Scanner; 
public class MinutesConversion{

public static void main(String[] args){

int minutes, hours, days; 
try (Scanner input = new Scanner(System.in)) {

System.out.println("Enter minutes >> ");
minutes = input.nextInt();

hours = minutes / 60; 
days = hours / 24;

System.out.println(minutes + " minutes is " + hours + " hours or " + days + " days");
}



}
}


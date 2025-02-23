import java.util.Scanner;
public class SunshineRentalPrice{
public static void main (String[] args){
     try (Scanner input = new Scanner(System.in)){
//Sunshine Seashore Supplies rents beach equipment such as kayaks, canoes, beach chairs, and umbrellas to tourists. 

//******** instructions ********
//Write a program that prompts the user for the number of minutes the user rented a piece of sports equipment. 
//Compute the rental cost as $40 per hour plus $1 per additional minute. 

//(You might have surmised already that this rate has a logical flaw, but for now, calculate rates as described here.


//***** program goals*********
// Display Sunshine's motto with the border that you created in the SunshineMotto2 class in Chapter 1.
// Then display the hours, minutes, and total price. Save the file as SunshineRentalPrice.java.


double minkayaks, mincanoes, minchairs, minumbrellas, totalhoursprice, totalmin, addmins ;


int totalhours; //declare

//logo
System.out.println("****************************************************");
System.out.println("*                                                  *");
System.out.println("* BEST SPORTS RENTALS! SUNSHINE SEASHORE SUPPLIES  *");
System.out.println("*                                                  *");
System.out.println("****************************************************");
// we didnt make this ones banner so this is mine i made for it :))

//prompts
System.out.println("");
minkayaks = input.nextInt();

System.out.println("");
mincanoes = input.nextInt();

System.out.println("");
minchairs = input.nextInt();

System.out.println("");
minumbrellas = input.nextInt();


//define
totalmin = minkayaks + mincanoes + minchairs + minumbrellas; //how many minutes total

totalhours = (int) (totalmin / 60); //how many hours
addmins = totalmin % 60;  //remainder of minutes

totalhoursprice = totalhours * 40; // $40 per hour

//output
System.out.println("You used " + totalhours + " hours at $40, and " + addmins + "minutes charged additionally at $1 a minute.");

System.out.println("Your total is $" + (totalhoursprice + addmins));

}
}
}
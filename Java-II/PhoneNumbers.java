import java.util.Scanner;

public class PhoneNumbers {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    String [] names = new String[30];
    names[0] = "Eve";
    names[1] = "Mike";
    names[2] = "Silvia";
    names[3] = "Joe";
    names[4] = "Colby";
    names[5] = "Mathis";
    names[6] = "April";
    names[7] = "Andrew";
    names[8] = "Ben";
    names[9] = "Lee";
      
    String [] numbers = new String [30];
    numbers[0] = "(555) 111-2222";
    numbers[1] = "(555) 222-3333";
    numbers[2] = "(555) 333-4444";
    numbers[3] = "(555) 444-5555";
    numbers[4] = "(555) 555-6666";
    numbers[5] = "(555) 666-7777";
    numbers[6] = "(555) 777-8888";
    numbers[7] = "(555) 888-9999";
    numbers[8] = "(555) 999-0000";
    numbers[9] = "(555) 000-1111";

    String name;
    boolean isFound = false;
    int max = 10;

    System.out.print("Enter the name of the person to look up (type quit to end) >> ");
    name = sc.nextLine();

    while(names.length > max && !name.equalsIgnoreCase("quit")){
        for(int i = 0; i<max; i++){
            if(name.equalsIgnoreCase(names[i])){
                isFound = true;
                System.out.print(name +"'s phone number is " + numbers[i]);
                i = max;
            }
        }

        if(!isFound){
            System.out.println(name + " was not found. ");
            System.out.print("Enter the phone number for " + name +" >>");
            names[max] = name;
            numbers[max] = sc.nextLine();
            max++;
        }

    System.out.print("Enter the name of the person to look up (type quit to end >> ");
    name = sc.nextLine();

    if(max==names.length){
        System.out.println("You reached the maximum number of people.");

    }
    isFound = false;

    }

sc.close();

    }
}

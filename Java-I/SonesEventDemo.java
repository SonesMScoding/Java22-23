import java.util.Scanner;

public class SonesEventDemo {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // !!!Capital letters for final (constant) variables !!!!

        // creating objects (se is a SonesEvent object that rep an object)
        SonesEvent se1 = new SonesEvent();
        userInput(se1);

        SonesEvent se2 = new SonesEvent();
        userInput(se2);

        SonesEvent se3 = new SonesEvent();
        userInput(se3);

        // display event details
        eventInfo(se1);
        eventInfo(se2);
        eventInfo(se3);
        //"please come to my event "
        leastGuests(se1, se2, se3);

        // compare objects; testing for > guests
        // moreGuests(se1, se2);
        // moreGuests(se1, se3);
        // moreGuests(se2, se3);


        //close scanner object
        in.close();
    } // end main

    // takes user input to plug into SonesEvent.java
    public static void userInput(SonesEvent se) {
        String eventNum;
        int guestNum;

        System.out.print("++++++++++++++++++++++++++++++++++++++ \n");
        System.out.print("Enter event number >> \n");
        eventNum = in.nextLine();
        se.setEventNumber(eventNum);

        System.out.print("Enter number of guests >> \n");
        guestNum = in.nextInt();

        while (guestNum < 5 || guestNum > 100) {
            System.out.print("The number of guests must be between 5 and 100 \n Please re-enter >> \n");
            guestNum = in.nextInt();
        }
        se.setGuests(guestNum);
        
        in.nextLine();

        se.LargeEvent();
        se.setPrice();
    }

    // which event has more guests
    public static void moreGuests(SonesEvent se1, SonesEvent se2) {
        if (se1.getGuests() == se2.getGuests())
            System.out.println("Both events " + se1.getEventNumber() + " and " + se2.getEventNumber()
                    + " have the same amount of guests." + "\n");
        else if (se1.getGuests() > se2.getGuests())
            System.out.println("Event " + se1.getEventNumber() + " is the larger event with more guests." + "\n");
        else if (se1.getGuests() < se2.getGuests())
            System.out.println("Event " + se2.getEventNumber() + " is the larger event with more guests." + "\n");
    }

    // which one has the least guests
    public static void leastGuests(SonesEvent se1, SonesEvent se2, SonesEvent se3) {
        // variables for the objects to make comparision easier
        int g1 = se1.getGuests();
        int g2 = se2.getGuests();
        int g3 = se3.getGuests();

        //==> use <= for simplicity, we want to deal with only one of them if we have 
        //events with the same number of guests

        if (g1 <= g2 && g1 <= g3) // is object 1 the smallest?
        {
            System.out.println("Event 1 is accepting more guests...");
            for (int i = 1; i < 1 + g1; i++)
                System.out.println(i + ".  Please come to my event!");
        }
        else if (g2 <= g1 && g2 <= g3) // object 2?
        {
            System.out.println("Event 2 is accepting more guests...");            
            for (int i = 1; i < 1 + g2; i++)
                System.out.println(i + ".  Please come to my event!");
        }
        else // if (g3 <= g1 && g3 <= g2) // it is object 3 atp, so we do not need the if
        {
            System.out.println("Event 3 is accepting more guests...");            
            for (int i = 1; i < 1 + g3; i++)
                System.out.println(i + ".  Please come to my event!");
        }
    
    }

    public static void eventInfo(SonesEvent se) {
        System.out.print("++++++++++++++++++++++++++++++++++++++ \n");
        System.out.print("Event #" + se.getEventNumber() + "\n");
        System.out.print("The price for an event with  " + se.getGuests() + " at " + se.getPrice() + " per guest is "
                + (se.getPrice() * se.getGuests()) + "\n");
        System.out.print("Whether this is a large event is " + se.isLargeEvent() + "\n");
    }

}

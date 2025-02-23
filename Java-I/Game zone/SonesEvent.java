public class SonesEvent {
    // no need for the scanner here
    // Scanner IN = new Scanner(System.in);

    public final static double HIGH_PRICE = 35.00;
    public final static double LOW_PRICE = 32.00;

    private boolean largeEvent;
    private String eventNumber;
    private int guests;
    private double price;

    public void setEventNumber(String event) {
        eventNumber = event;
    }

    public void setGuests(int gsts) // sets price depending on t/f value of the boolean largeEvent
    {
        guests = gsts;
    }

    public void LargeEvent() {
        if (guests < 50)
            largeEvent = false;
        else
            largeEvent = true;
    }

    public void setPrice() {
        if (guests < 50)
            largeEvent = false;
        else
            largeEvent = true;

        if (largeEvent = true)
            price = LOW_PRICE;
        else
            price = HIGH_PRICE;
    }

    // returning values
    public boolean isLargeEvent() {
        return largeEvent;
    }

    public String getEventNumber() {
        return eventNumber;
    }

    public int getGuests() {
        return guests;
    }

    public double getPrice() {
        return price;
    }

}

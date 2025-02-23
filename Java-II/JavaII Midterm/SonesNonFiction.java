public class SonesNonFiction extends SonesBook {
    //subclass

    public SonesNonFiction(String title, double price){
        super(title);
        setPrice(price);
    }

     public void setPrice(double price) {
        super.price = price;
    }

}

    

//demo object
// SonesNonfiction snf = new SonesNonfiction("", 1209, "");
//snf.displayBook(); <- how to use the display method
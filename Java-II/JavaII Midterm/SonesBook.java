abstract class SonesBook{


        //parent class. this predominantly works and so do the child classes
    protected String title;
    protected Double price;

    public String toString(){
        return "\nBook Title: " + title + "\nPrice:$ " + price + "\n";
    }


    public SonesBook(String bookTitle){
        title = bookTitle;
    }
 
    public Double getPrice(){
        return price;
    }

    public String getTitle(){
        return title;
    }

    public abstract void setPrice(double price);



public static void main(String[] args) {

}

}
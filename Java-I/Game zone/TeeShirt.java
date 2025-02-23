import java.util.Scanner;

public class TeeShirt{

    Scanner sc = new Scanner(System.in);

    final double REGSHIRT = 19.99;
    final double BIGSHIRT = 22.99;

    int OrderNumber;
    String size;
    String color;
    double price;

    public void setorderNumber(int order)
    {
            OrderNumber = order;
    } 

    public void setSize(String sizeofshirt)
    {
            size = sizeofshirt;
    }

    public void setColor(String colorofshirt)
    {
            color = colorofshirt;
    }

    public void setPrice()
    {
        if (size != "XXL" && size != "XXXL")
            price = REGSHIRT;
            
        else
            price = BIGSHIRT;


    }



    public int getOrderNumber() {
        return OrderNumber;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    }
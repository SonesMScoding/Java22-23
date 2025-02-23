public class Salesperson {
    private int id;
    private double sales;

    Salesperson(int idNum, double amt){
        id = idNum;
        sales = amt;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getSales(){
        return sales;
    }

    public void setSales(double sales){
        this.sales = sales;
    }
}

package Models;

public class Trika {
    private int ID;
    private String size;
    private int quantity;
    private double price;
    public Trika(int ID, int quantity,double price ) {
        this.ID=ID;
        this.quantity=quantity;
        this.price= price;

    }
    public String getSize() {
        return size;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPrice() {
        return price;
    }
}

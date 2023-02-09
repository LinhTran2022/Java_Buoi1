package vehiclemanager;

public class Vehicle {
    protected String id = new String();
    protected String brand = new String();
    protected String color = new String();
    protected int p_year; 
    protected int price;
    
    public Vehicle(){}
    
    public Vehicle(String id, String brand, int p_year, int price, String color){
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.p_year = p_year;
        this.price = price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setP_year(int p_year) {
        this.p_year = p_year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getP_year() {
        return p_year;
    }

    public int getPrice() {
        return price;
    }
    
    
}

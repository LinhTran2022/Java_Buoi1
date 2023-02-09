package vehiclemanager;

public class Lorry extends Vehicle{
    private double load;
    
    public Lorry(){}

    public Lorry(String id, String brand, int p_year, int price, String color, double load) {
        super(id, brand, p_year, price, color);
        this.load = load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    public double getLoad() {
        return load;
    }
    
    
}

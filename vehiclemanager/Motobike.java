package vehiclemanager;

public class Motobike extends Vehicle{
    private int wattage; // cong suat
    
    public Motobike(){}

    public Motobike(String id, String brand, int p_year, int price, String color, int wattage) {
        super(id, brand, p_year, price, color);
        this.wattage = wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }
    
}

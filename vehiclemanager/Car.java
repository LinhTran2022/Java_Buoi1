
package vehiclemanager;

public class Car extends Vehicle{
    private String typeOfEngine = new String();
    private int numOfSeat;
    
    public Car(){}

    public Car(String id, String brand, int p_year, int price, String color, String typeOfEngine, int numOfSeat) {
        super(id, brand, p_year, price, color);
        this.numOfSeat = numOfSeat;
        this.typeOfEngine = typeOfEngine;
    }
    
    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public void setNumOfSeat(int numOfSeat) {
        this.numOfSeat = numOfSeat;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public int getNumOfSeat() {
        return numOfSeat;
    }
    
    
}

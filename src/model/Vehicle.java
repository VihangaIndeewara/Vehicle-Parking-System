package model;

public class Vehicle {
     private String number;
     private String type;
     private int weight;
     private int passengers;

    public Vehicle() {
    }

    public Vehicle(String number, String type, int weight, int passengers) {
        this.number = number;
        this.type = type;
        this.weight = weight;
        this.passengers = passengers;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "number='" + number + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                ", passengers=" + passengers +
                '}';
    }
}

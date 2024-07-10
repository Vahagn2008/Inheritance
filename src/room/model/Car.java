package room.model;

public abstract class Car {

    private int wheelNumber;

    private Boolean hull;

    private int weight;

    public Car(int wheelNumber, Boolean hull, int weight) {
        this.wheelNumber = wheelNumber;
        this.hull = hull;
        this.weight = weight;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public Boolean getHull() {
        return hull;
    }

    public void setHull(Boolean hull) {
        this.hull = hull;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void print() {
        System.out.println("Wheel number: " + wheelNumber);
        System.out.println("Hull: " + hull);
        System.out.println("Weight: " + weight);
    }

}

package room.model;

public class Kia extends Car{

    private int year;


    public Kia(int wheelNumber, boolean hull, int weight, int year) {
        super(wheelNumber, hull, weight);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Year: " + year);
    }
}

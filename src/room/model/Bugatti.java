package room.model;

public class Bugatti extends Car{

    private int lenght2;

    private int horsePower;

    public Bugatti(int wheelNumber, boolean hull, int weight, int lenght2, int horsePower) {
        super(wheelNumber, hull, weight);
        this.lenght2 = lenght2;
        this.horsePower = horsePower;
    }

    public int getLenght2() {
        return lenght2;
    }

    public void setLenght2(int lenght2) {
        this.lenght2 = lenght2;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Lenght2: " + lenght2);
        System.out.println("HorsePower: " + horsePower);
    }
}

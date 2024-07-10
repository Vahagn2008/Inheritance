package room.model;

public class BMW extends Car{

    private String model;

    private int lenght1;

    public BMW(int wheelNumber, boolean hull, int weight, String model) {
        super(wheelNumber, hull, weight);
        this.model = model;
        this.lenght1 = lenght1;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Model: " + model);
        System.out.println("Lenght 1: " + lenght1);
    }


}

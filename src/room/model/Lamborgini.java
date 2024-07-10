package room.model;

public class Lamborgini extends Car{

    private int price;

    private String kind;

    public Lamborgini(int wheelNumber, boolean hull, int weight, int price, String kind) {
        super(wheelNumber, hull, weight);
        this.price = price;
        this.kind = kind;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSedan() {
        return kind;
    }

    public void setSedan(String sedan) {
        this.kind = sedan;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Price: " + price);
        System.out.println("kind: " + kind);
    }
}

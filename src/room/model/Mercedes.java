package room.model;

public class Mercedes extends Car{

    private int companyPrice;

    public Mercedes(int wheelNumber, boolean hull, int weight, int companyPrice) {
        super(wheelNumber, hull, weight);
        this.companyPrice = companyPrice;
    }

    public int getCompanyPrice() {
        return companyPrice;
    }

    public void setCompanyPrice(int companyPrice) {
        this.companyPrice = companyPrice;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Company Price: " + companyPrice);
    }
}

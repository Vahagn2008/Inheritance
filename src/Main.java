import room.model.*;

public class Main {

    public static void main(String[] args) {


        System.out.println("BMW");
        BMW bmw = new BMW(4, true, 2300, "BWM");
        bmw.print();

        System.out.println("-------------------");

        System.out.println("Bugatti");
        Bugatti bugatti = new Bugatti(4, true, 1500, 4, 2000);
        bugatti.print();

        System.out.println("-------------------");

        System.out.println("Kia");
        Kia kia = new Kia(4, true, 2100, 2024);
        kia.print();

        System.out.println("-------------------");

        System.out.println("Lamborgini");
        Lamborgini lamborgini = new Lamborgini(4, true, 1900, 100000, "sedan");
        lamborgini.print();

        System.out.println("-------------------");

        System.out.println("Mercedes");
        Mercedes mercedes = new Mercedes(4, true, 2200, 990000000);
        mercedes.print();
    }
}
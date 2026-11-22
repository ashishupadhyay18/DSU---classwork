public class Car {

    String name;
    String model;
    String type;

    // Constructor
    Car(String name, String model, String type) {
        this.name = name;
        this.model = model;
        this.type = type;
    }

    // Display method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {

        Car c1 = new Car("BMW", "730d", "Sedan");
        c1.display();

        Car c2 = new Car("Benz", "G63", "SUV");
        c2.display();

        Car c3 = new Car("Audi", "R8", "Sports");
        c3.display();
    }
}
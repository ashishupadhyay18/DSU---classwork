abstract class Shape {

    abstract double calculateArea();

    void display() {
        System.out.println("Area: " + calculateArea());
    }
}

class Circle extends Shape {

    double r = 7;

    @Override
    double calculateArea() {
        return 3.14 * r * r;
    }
}

class Rectangle extends Shape {

    double l = 10, b = 5;

    @Override
    double calculateArea() {
        return l * b;
    }
}

public class ShapeDemo {

    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        System.out.println("Circle:");
        c.display();

        System.out.println("Rectangle:");
        r.display();
    }
}
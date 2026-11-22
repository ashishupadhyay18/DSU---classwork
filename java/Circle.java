public class Circle {

    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Display radius
    void display() {
        System.out.println("Radius: " + radius);
    }

    // Calculate area
    void area() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    // Calculate circumference
    void circumference() {
        double circumference = 2 * 3.14 * radius;
        System.out.println("Circumference of Circle: " + circumference);
    }

    public static void main(String[] args) {

        Circle c1 = new Circle(8.90);

        c1.display();
        c1.area();
        c1.circumference();
    }
}
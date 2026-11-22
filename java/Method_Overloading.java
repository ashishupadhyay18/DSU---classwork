public class Method_Overloading {

    // Add two integers
    public void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    // Add three integers
    public void add(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }

    // Add two double values
    public void add(double a, double b) {
        System.out.println("Sum of two decimal numbers: " + (a + b));
    }

    public static void main(String[] args) {

        Method_Overloading a = new Method_Overloading();

        a.add(6, 5);
        a.add(5, 6, 7);
        a.add(0.1, 0.2);
    }
}
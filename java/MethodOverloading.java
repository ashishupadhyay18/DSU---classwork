class MethodOverloading {

    // Method with two integer parameters
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    // Method with three integer parameters
    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    // Method with two double parameters
    public void add(double a, double b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();

        obj.add(6, 5);
        obj.add(5, 6, 7);
        obj.add(0.1, 0.2);
    }
}
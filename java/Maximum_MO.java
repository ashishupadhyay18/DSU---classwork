public class Maximum_MO {

    // Find maximum between two numbers
    public void max(int a, int b) {

        if (a > b)
            System.out.println("Maximum: " + a);
        else
            System.out.println("Maximum: " + b);
    }

    // Find maximum among three numbers
    public void max(int a, int b, int c) {

        if (a >= b && a >= c)
            System.out.println("Maximum: " + a);

        else if (b >= a && b >= c)
            System.out.println("Maximum: " + b);

        else
            System.out.println("Maximum: " + c);
    }

    public static void main(String[] args) {

        Maximum_MO obj = new Maximum_MO();

        obj.max(6, 2);
        obj.max(5, 6, 8);
    }
}
public class Largest_Members {

    static void largest(int a, int b, int c) {

        if (a >= b && a >= c) {
            System.out.println(a + " is largest");
        } 
        else if (b >= a && b >= c) {
            System.out.println(b + " is largest");
        } 
        else {
            System.out.println(c + " is largest");
        }
    }

    public static void main(String[] args) {

        Largest_Members.largest(10, 20, 15);
        Largest_Members.largest(30, 25, 40);
    }
}
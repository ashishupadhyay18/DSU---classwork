public class EvenOdd_Members {

    static void evenOdd(int n) {

        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }

    public static void main(String[] args) {

        EvenOdd_Members.evenOdd(5);
        EvenOdd_Members.evenOdd(6);
    }
}
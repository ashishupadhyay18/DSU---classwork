public class Factorial {

    // Recursive method to calculate factorial
    public int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Factorial f = new Factorial();

        System.out.println("Factorial of 5: " + f.factorial(5));
    }
}

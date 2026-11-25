public class Recursion {

    public void printNumbers(int n) {

        if (n == 0) {
            return;
        }

        System.out.println(n);

        // Recursive call
        printNumbers(n - 1);
    }

    public static void main(String[] args) {

        Recursion obj = new Recursion();

        obj.printNumbers(5);
    }
}
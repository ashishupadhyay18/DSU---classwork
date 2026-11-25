import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = sc.nextInt();

        System.out.println("Enter b:");
        int b = sc.nextInt();

        System.out.println("Addition = " + (a + b));

        System.out.println("Subtraction = " + (a - b));

        System.out.println("Multiplication = " + (a * b));

        if (b != 0) {
            System.out.println("Division = " + ((double) a / b));
        } else {
            System.out.println("Division = Cannot divide by zero");
        }

        sc.close();
    }
}
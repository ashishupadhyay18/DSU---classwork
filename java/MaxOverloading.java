import java.util.Scanner;

class Maximum {

    // Method to find maximum of two numbers
    void max(int a, int b) {
        if (a > b) {
            System.out.println("Maximum of two numbers: " + a);
        } else {
            System.out.println("Maximum of two numbers: " + b);
        }
    }

    // Overloaded method to find maximum of three numbers
    void max(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println("Maximum of three numbers: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Maximum of three numbers: " + b);
        } else {
            System.out.println("Maximum of three numbers: " + c);
        }
    }
}

public class MaxOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Maximum m = new Maximum();

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        m.max(a, b);

        System.out.print("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        m.max(x, y, z);

        sc.close();
    }
}

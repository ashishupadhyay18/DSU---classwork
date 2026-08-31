
import java.util.*;

class ThreeIP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("The greatest value is " + a);
        } 
        else if (b >= a && b >= c) {
            System.out.println("The greatest value is " + b);
        } 
        else {
            System.out.println("The greatest value is " + c);
        }

        sc.close();
    }
}
import java.util.*;

class Matrix3x3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[][] = new int[3][3];

        System.out.println("Enter the elements of the 3x3 matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
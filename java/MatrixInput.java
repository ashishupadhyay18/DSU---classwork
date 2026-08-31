import java.util.*;

class MatrixInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns:");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[][] = new int[n][m];

        System.out.println("Enter the elements in the array:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements of array are:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
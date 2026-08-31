import java.util.*;

class ArrayD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the elements in array:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int high = a[0];
        int low = a[0];

        for (int i = 0; i < n; i++) {

            if (a[i] > high) {
                high = a[i];
            }

            if (a[i] < low) {
                low = a[i];
            }
        }

        System.out.printf("Largest is %d%n", high);
        System.out.printf("Smallest is %d%n", low);

        sc.close();
    }
}
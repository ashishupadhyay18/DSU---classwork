import java.util.*;

class CountArray {
    public static void main(String[] args) {

        int evenCount = 0;
        int oddCount = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the elements in the array:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even count is " + evenCount);
        System.out.println("Odd count is " + oddCount);

        sc.close();
    }
}

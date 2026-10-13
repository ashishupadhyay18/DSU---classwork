import java.util.Scanner;

class Bill {
    // Method for integer price
    void generateBill(int quantity, int price) {
        int total = quantity * price;
        System.out.println("Total Bill: Rs. " + total);
    }

    // Overloaded method for decimal price
    void generateBill(int quantity, double price) {
        double total = quantity * price;
        System.out.println("Total Bill: Rs. " + total);
    }
}

public class BillGeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bill b = new Bill();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter integer price: ");
        int price1 = sc.nextInt();
        b.generateBill(quantity, price1);

        System.out.print("Enter decimal price: ");
        double price2 = sc.nextDouble();
        b.generateBill(quantity, price2);

        sc.close();
    }
}

public class Bill_MO {

    public void Mul(int a, double b) {
        System.out.println("Total Bill Price: ");
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        Bill_MO a = new Bill_MO();
        a.Mul(6, 5.0);
    }
}
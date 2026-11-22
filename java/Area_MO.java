public class Area_MO {

    public void Mul(int a) {
        System.out.println(a * a);
    }

    public void Mul(int l, int b) {
        System.out.println(l * b);
    }

    public void Multi(int r) {
        System.out.println(3.14 * r);
    }

    public static void main(String[] args) {

        Area_MO a = new Area_MO();

        a.Mul(6);
        a.Mul(5, 6);
        a.Multi(5);
    }
}
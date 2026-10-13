import java.util.Scanner;

class Student {
    // Method to calculate average of two subjects
    void average(double m1, double m2) {
        double avg = (m1 + m2) / 2;
        System.out.println("Average of two subjects: " + avg);
    }

    // Overloaded method to calculate average of three subjects
    void average(double m1, double m2, double m3) {
        double avg = (m1 + m2 + m3) / 3;
        System.out.println("Average of three subjects: " + avg);
    }
}

public class StudentAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter marks of two subjects: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        s.average(a, b);

        System.out.print("Enter marks of three subjects: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        s.average(x, y, z);

        sc.close();
    }
}
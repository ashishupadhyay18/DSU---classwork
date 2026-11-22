abstract class Employ {

    abstract double calculateSalary();

    void companyName() {
        System.out.println("ABC Technologies");
    }
}

class FullTimeEmploy extends Employ {

    double calculateSalary() {
        return 40000;
    }
}

class PartTimeEmploy extends Employ {

    double calculateSalary() {
        return 15000;
    }
}

public class EmployDemo {

    public static void main(String[] args) {

        FullTimeEmploy f = new FullTimeEmploy();
        PartTimeEmploy p = new PartTimeEmploy();

        System.out.println("Full Time Employee:");
        f.companyName();
        System.out.println("Salary: " + f.calculateSalary());

        System.out.println();

        System.out.println("Part Time Employee:");
        p.companyName();
        System.out.println("Salary: " + p.calculateSalary());
    }
}
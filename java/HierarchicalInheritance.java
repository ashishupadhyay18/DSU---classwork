class Employee {

    void displayCompany() {
        System.out.println("Employee works in a company");
    }
}

class Teacher extends Employee {

    void teach() {
        System.out.println("Teacher is teaching");
    }
}

class Developer extends Employee {

    void writeCode() {
        System.out.println("Developer is writing code");
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {

        Teacher t = new Teacher();
        t.displayCompany();
        t.teach();

        Developer d = new Developer();
        d.displayCompany();
        d.writeCode();
    }
}

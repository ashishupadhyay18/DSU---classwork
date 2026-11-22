public class Employee {

    String name;
    String salary;
    String type;

    // Constructor
    Employee(String name, String salary, String type) {
        this.name = name;
        this.salary = salary;
        this.type = type;
    }

    // Display employee details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Type: " + type);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Arun", "1,00,000", "Junior Analyst");
        e1.display();

        Employee e2 = new Employee("Argith", "2,25,000", "Senior Team Manager");
        e2.display();

        Employee e3 = new Employee("Shramik", "3,50,000", "HR");
        e3.display();
    }
}
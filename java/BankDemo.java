abstract class Bank {
    abstract double getInterestRate();

    void display() {
        System.out.println("Welcome to the Bank");
    }
}

class SBI extends Bank {
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    double getInterestRate() {
        return 7.0;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        SBI s = new SBI();
        HDFC h = new HDFC();

        System.out.println("SBI:");
        s.display();
        System.out.println("Interest Rate: " +
                           s.getInterestRate() + "%");

        System.out.println("HDFC:");
        h.display();
        System.out.println("Interest Rate: " +
                           h.getInterestRate() + "%");
    }
}
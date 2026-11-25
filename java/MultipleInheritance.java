interface Father {
    void work();
}

interface Mother {
    void cook();
}

class Child implements Father, Mother {

    @Override
    public void work() {
        System.out.println("Father is working");
    }

    @Override
    public void cook() {
        System.out.println("Mother is cooking");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {

        Child c = new Child();

        c.work();
        c.cook();
    }
}
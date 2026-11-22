interface Animal {
    void eat();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {

    public void eat() {
        System.out.println("Dog is eating");
    }

    public void play() {
        System.out.println("Dog is playing");
    }
}

class Cat implements Animal {

    public void eat() {
        System.out.println("Cat is eating");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();
        d.play();

        System.out.println();

        Cat c = new Cat();
        c.eat();
    }
}
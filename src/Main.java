import clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat("Cat1");
        Animal animal2 = new Cat("Cat2");
        Animal animal3 = new Dog("Dog1");
        Animal animal4 = new Dog("Dog2");
        Animal animal5 = new Duck("Duck1");
        Animal animal6 = new Duck("Duck2");
        Animal animal7 = new Parrot("Parrot1");
        Animal animal8 = new Parrot("Parrot2");

        animal1.swim();
        animal2.swim();
        animal3.swim();
        animal4.swim();
        animal5.swim();
        animal6.swim();
        animal7.swim();
        animal8.swim();
        System.out.println();
        animal1.fly();
        animal2.fly();
        animal3.fly();
        animal4.fly();
        animal5.fly();
        animal6.fly();
        animal7.fly();
        animal8.fly();
        System.out.println();
        animal1.toGo();
        animal2.toGo();
        animal3.toGo();
        animal4.toGo();
        animal5.toGo();
        animal6.toGo();
        animal7.toGo();
        animal8.toGo();
    }
}
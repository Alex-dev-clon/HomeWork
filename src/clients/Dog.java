package clients;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Dog(){
        super();
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("������ �� ������!");
    }
}
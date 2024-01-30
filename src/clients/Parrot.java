package clients;

import java.time.LocalDate;

public class Parrot extends Animal{
    public Parrot(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Попугай не плавает!");
    }
}

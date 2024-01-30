package clients;

import java.time.LocalDate;

public class Cat extends Animal {

    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness);
        this.discount = discount;
    }

    public Cat() {
        super();
        this.discount = 10D;
    }

    public Cat(String name) {
        super(name);
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public static void meow(){
        System.out.println("ћ€€€у!");
    }

    @Override
    public void fly() {
        System.out.println(" ошки не летают!");
    }

    @Override
    public String toString() {
        return super.toString()+"Discount("+discount+")";
    }
}
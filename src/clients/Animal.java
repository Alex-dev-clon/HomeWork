package clients;

import java.time.LocalDate;

public class Animal {

    protected String nickName;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;

    public Animal(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        this.nickName = nickName;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
    }

    public Animal() {
        this("������", new Owner("������"), LocalDate.now(), new Illness("������"));
    }

    public Animal(String name){
        this(name, new Owner("Owner"), LocalDate.now(), new Illness("Desire"));
    }

    public String getNickName() {
        return nickName;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public void lifeCycle() {
        wakeUp("12:00");
        hunt();
        eat();
        sleep();
    }

    private void wakeUp() {
        wakeUp("12:00");
    }

    private void wakeUp(String time) {
        System.out.println("�������� " + nickName + " ���������� � " + time);
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    private void hunt() {
        System.out.println("�������� ��������!");
    }

    private void eat() {
        System.out.println("�������� ���!");
    }

    private void sleep() {
        System.out.println("�������� ������!");
    }

    public void toGo (){
        System.out.println("�������� ���������!");
    }

    public void fly (){
        System.out.println("�������� �����!");
    }

    public void swim(){
        System.out.println("�������� ������!");
    }

    @Override
    public String toString() {
        return String.format("nickName = %s, bd = %s, owner = %s, illness = %s", nickName, birthDate, owner, illness);
    }
}
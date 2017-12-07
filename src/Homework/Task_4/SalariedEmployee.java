package Homework.Task_4;

public class SalariedEmployee extends Emploee implements Interface{

    int horlyPaid;
    String name;
    int age;
    int socialSecurityNumber;
    int hours;

    public SalariedEmployee(String name, int age, int horlyPaid, int socialSecurityNumber, int hours) {
        this.name = name;
        this.age = age;
        this.horlyPaid = horlyPaid;
        this.socialSecurityNumber = socialSecurityNumber;
        this.hours = hours;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }
    public int getAge() {
        return age;
    }

    public void changeAge(int age) {
        this.age = age;
    }
    public void changeHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {

        return hours;
    }

    public int getHorlyPaid() {
        return horlyPaid;
    }
    public void changeHorlyPaid(int horlyPaid) {
        this.horlyPaid = horlyPaid;
    }

    public void changeSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    @Override
    public int calculatePay(){
        return hours * horlyPaid;
    }
    @Override
    public String toString() {
        return "This is " + name + " and he(she) " + age  + " years old, salaried employee,  get`s " + horlyPaid +
                "$ per hour, worked " + hours + ", social security number - " + socialSecurityNumber + " and gets "
                + calculatePay() + " for mounth.";
    }
}


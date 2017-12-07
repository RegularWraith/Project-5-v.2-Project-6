package Homework.Task_4;

public class ContractEmployee extends Emploee implements Interface{

    String name;
    int age;
    int federalTaxIdmember;
    int fixedPayment;

    public ContractEmployee(String name, int age, int federalTaxIdmember, int fixedPayment) {
        this.name = name;
        this.age = age;
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedPayment = fixedPayment;
    }

    public void changeFixedPayment(int fixedPayment) {
        this.fixedPayment = fixedPayment;
    }

    public int getFixedPayment() {

        return fixedPayment;
    }

    public int getAge() {
        return age;
    }

    public void changeAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void changeFederalTaxIdmember(int federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public int changeFederalTaxIdmember() {
        return federalTaxIdmember;
    }
    @Override
    public int calculatePay(){
        return fixedPayment;
    }
    @Override
    public String toString() {
        return "This is " + name + " and he(she) " + age  + " years old, contract employee,  get`s " + fixedPayment +
                "$ per mounth, federal tax Id member - " + federalTaxIdmember + " and gets "
                + calculatePay() + " for mounth.";
    }
}


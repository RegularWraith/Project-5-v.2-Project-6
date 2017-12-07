package Homework.Task_4;

public class Main {
    public static void main(String[] args) {
        Emploee emploees[] = new Emploee[]{
                new SalariedEmployee("John", 25, 911, 12324, 132),
                new ContractEmployee("Viktor", 21, 135126, 32145),
                new SalariedEmployee("Andrew", 32, 420, 123441, 322),
                new ContractEmployee("Eddie", 29, 315421, 420000),
        };
        for ( int i = 0; i < emploees.length; i++) {
            System.out.println(emploees.toString());
        }
    }
}

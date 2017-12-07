package Homework.Task_3;

public class Swallow extends  FlyingBird{

    public Swallow(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly(){
        System.out.println("yes, he can");
    }

    @Override
    public String toString() {
        return "This is swallow. \n" + "Does swallow have a feathers?  - " + feathers + "\nDoes swallow lay eggs?  - " + layEggs +
                "\nDoes the swallow can fly?  - ";
    }
}

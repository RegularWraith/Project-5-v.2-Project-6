package Homework.Task_3;

public class Kiwi extends NonFlyingBird{
    public Kiwi(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly(){
        System.out.println("no, he can`t");
    }

    @Override
    public String toString() {
        return "This is kiwi. \n" + "Does kiwi have a feathers?  - " + feathers + "\nDoes kiwi lay eggs?  - " + layEggs +
                "\nDoes the kiwi can fly?  - ";
    }
}

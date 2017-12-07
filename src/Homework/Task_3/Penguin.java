package Homework.Task_3;

public class Penguin extends  NonFlyingBird{
    public Penguin(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly(){
        System.out.println("no, he can`t");
    }

    @Override
    public String toString() {
        return "This is penguin. \n" + "Does swallow have a feathers?  - " + feathers + "\nDoes swallow lay eggs?  - " + layEggs +
                "\nDoes the swallow can fly?  - ";
    }
}

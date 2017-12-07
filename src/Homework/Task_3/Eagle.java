package Homework.Task_3;

class Eagle extends FlyingBird {

    public Eagle(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly(){
        System.out.println("yes, he can");
    }

    @Override
    public String toString() {
        return "This is eagle \n" + "Does eagle have a feathers?  - " + feathers + "\nDoes eagle lay eggs?  - " + layEggs +
                "\nDoes the eagle can fly?  - ";
    }
}

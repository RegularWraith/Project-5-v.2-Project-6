package Homework.Task_3;

public class Main {
    public static void main(String[] args) {
        Bird birds[] = new Bird[]{
                new Eagle("Yes", "Yes"),
                new Swallow("Yes", "Yes"),
                new Penguin("No", "Yes"),
                new Kiwi("No", "Yes"),
        };
        for ( int i = 0; i < birds.length; i++) {
            System.out.println(birds.toString());
        }
    }
}

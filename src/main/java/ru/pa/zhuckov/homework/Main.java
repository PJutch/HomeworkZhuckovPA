package ru.pa.zhuckov.homework;

public class Main {
    public static void main(String[] args) {
        IWalking walking = new Camel();
        walking.walk();
        walking = new Tiger();
        walking.walk();

        new Dolphin().swim();
        new Eagle().fly();

        new Horse().eat(new Grass());
        new Camel().eat(new Grass());

        new Tiger().eat(new Beef());
    }
}

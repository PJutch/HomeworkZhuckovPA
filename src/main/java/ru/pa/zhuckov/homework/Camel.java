package ru.pa.zhuckov.homework;

public class Camel implements IWalking, IHerbivore {
    public void walk() {
        System.out.println("Camel walks");
    }

    public void eat(Grass grass) {
        System.out.println("Camel eats grass");
    }
}

package ru.pa.zhuckov.homework;

public class Camel implements IWalking, IHerbivore {
    @Override
    public void walk() {
        System.out.println("Camel walks");
    }

    @Override
    public void eat(Grass grass) {
        System.out.println("Camel eats grass");
    }
}

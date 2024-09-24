package ru.pa.zhuckov.homework;

public class Horse implements IWalking, IHerbivore {
    public void walk() {
        System.out.println("Horse walks");
    }

    public void eat(Grass grass) {
        System.out.println("Horse eats grass");
    }
}

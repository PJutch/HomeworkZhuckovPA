package ru.pa.zhuckov.homework;

public class Horse extends Herbivore implements Walking {
    @Override
    public void walk() {
        System.out.println("Horse walks");
    }

    @Override
    public void eat(Grass grass) {
        System.out.println("Horse eats grass");
    }
}

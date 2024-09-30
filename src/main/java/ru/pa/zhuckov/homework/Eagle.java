package ru.pa.zhuckov.homework;

public class Eagle extends Carnivore implements Flying {
    @Override
    public void fly() {
        System.out.println("Eagle flies");
    }

    @Override
    public void eat(Meat meat) {
        System.out.println("Eagle eats " + meat.name());
    }
}

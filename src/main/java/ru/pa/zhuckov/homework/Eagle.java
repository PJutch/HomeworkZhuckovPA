package ru.pa.zhuckov.homework;

public class Eagle implements IFlying, ICarnivore {
    @Override
    public void fly() {
        System.out.println("Eagle flies");
    }

    @Override
    public void eat(IMeat meat) {
        System.out.println("Eagle eats " + meat.name());
    }
}

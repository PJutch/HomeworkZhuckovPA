package ru.pa.zhuckov.homework;

public class Eagle implements IFlying {
    public void fly() {
        System.out.println("Eagle flies");
    }

    public void eat(IMeat meat) {
        System.out.println("Eagle eats " + meat.name());
    }
}

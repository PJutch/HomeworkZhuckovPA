package ru.pa.zhuckov.homework;

public class Tiger implements IWalking, ICarnivore {
    public void walk() {
        System.out.println("Tiger walks");
    }

    public void eat(IMeat meat) {
        System.out.println("Tiger eats");
    }
}

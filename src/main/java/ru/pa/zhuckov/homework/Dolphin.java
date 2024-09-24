package ru.pa.zhuckov.homework;

public class Dolphin implements ISwimming, ICarnivore {
    public void swim() {
        System.out.println("Dolphin swims");
    }

    public void eat(IMeat meat) {
        System.out.println("Dolphin eats");
    }
}

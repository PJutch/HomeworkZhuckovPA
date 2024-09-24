package ru.pa.zhuckov.homework;

public class Dolphin implements ISwimming, ICarnivore {
    public void swim() {
        System.out.println("Dolphin swims");
    }

    public void eat(IMeat meat) {
        if (!(meat instanceof Fish)) {
            throw new MeatTypeException("Dolphin can only eat fish");
        }

        System.out.println("Dolphin eats");
    }
}

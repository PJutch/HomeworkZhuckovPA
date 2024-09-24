package ru.pa.zhuckov.homework;

public class Dolphin implements ISwimming, ICarnivore {
    @Override
    public void swim() {
        System.out.println("Dolphin swims");
    }

    @Override
    public void eat(IMeat meat) {
        if (!(meat instanceof Fish)) {
            throw new MeatTypeException("Dolphin can only eat fish");
        }

        System.out.println("Dolphin eats " + meat.name());
    }
}

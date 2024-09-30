package ru.pa.zhuckov.homework;

public class Dolphin extends Carnivore implements ISwimming {
    @Override
    public void swim() {
        System.out.println("Dolphin swims");
    }

    @Override
    public void eat(Meat meat) {
        if (meat != Meat.FISH) {
            throw new MeatTypeException("Dolphin can only eat fish");
        }

        System.out.println("Dolphin eats " + meat.name());
    }
}

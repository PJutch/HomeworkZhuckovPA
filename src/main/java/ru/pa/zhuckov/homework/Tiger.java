package ru.pa.zhuckov.homework;

public class Tiger extends Carnivore implements IWalking {
    @Override
    public void walk() {
        System.out.println("Tiger walks");
    }

    @Override
    public void eat(IMeat meat) {
        if (!(meat instanceof Beef)) {
            throw new MeatTypeException("Tiger can only eat beef");
        }

        System.out.println("Tiger eats " + meat.name());
    }
}

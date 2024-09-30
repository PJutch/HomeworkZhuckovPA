package ru.pa.zhuckov.homework;

public class Tiger extends Carnivore implements Walking {
    @Override
    public void walk() {
        System.out.println("Tiger walks");
    }

    @Override
    public void eat(Meat meat) {
        if (meat != Meat.BEEF) {
            throw new MeatTypeException("Tiger can only eat beef");
        }

        System.out.println("Tiger eats " + meat.name());
    }
}

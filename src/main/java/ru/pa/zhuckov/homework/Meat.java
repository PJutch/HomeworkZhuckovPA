package ru.pa.zhuckov.homework;

public enum Meat {
    BEEF,
    FISH;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}

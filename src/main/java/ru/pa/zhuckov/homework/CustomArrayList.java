package ru.pa.zhuckov.homework;

public class CustomArrayList<T> implements CustomList<T> {
    private T[] values = (T[]) new Object[0];

    @Override
    public void add(T value) {

    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public T remove(int index) {

    }
}

package ru.pa.zhuckov.homework;

public class CustomArrayList<T> implements CustomList<T> {
    private T[] values = (T[]) new Object[0];

    @Override
    public void add(T value) {
        T[] newValues = (T[]) new Object[values.length + 1];
        for (int i = 0; i < values.length; ++i) {
            newValues[i] = values[i];
        }
        
        newValues[values.length] = value;
        values = newValues;
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public T remove(int index) {

    }
}

package ru.pa.zhuckov.homework;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
    private T[] values;

    public CustomArrayList(T... values) {
        this.values = values;
    }

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
    public T get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > values.length) {
            throw new IndexOutOfBoundsException(index);
        }
        return values[index];
    }

    @Override
    public T remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > values.length) {
            throw new IndexOutOfBoundsException(index);
        }

        T oldValue = get(index);

        T[] newValues = (T[]) new Object[values.length - 1];
        for (int i = 0; i < index; ++i) {
            newValues[i] = values[i];
        }

        for (int i = index + 1; i < values.length; ++i) {
            newValues[i - 1] = values[i];
        }

        values = newValues;
        return oldValue;
    }

    @Override
    public String toString() {
        return Arrays.toString(values);
    }
}

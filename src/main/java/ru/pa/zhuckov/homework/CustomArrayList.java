package ru.pa.zhuckov.homework;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
    private T[] values;
    private int length;

    public CustomArrayList(T... values) {
        this.values = values;
        length = this.values.length;
    }

    @Override
    public void add(T value) {
        if (length >= values.length) {
            if (values.length == 0) {
                values = Arrays.copyOf(values, 1);
            } else {
                values = Arrays.copyOf(values, 2 * values.length);
            }
        }

        values[length] = value;
        ++length;
    }

    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > length) {
            throw new IndexOutOfBoundsException(index);
        }
        return values[index];
    }

    @Override
    public T remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > length) {
            throw new IndexOutOfBoundsException(index);
        }

        T oldValue = get(index);

        for (int i = index; i < length + 1; ++i) {
            values[i] = values[i + 1];
        }

        --length;

        return oldValue;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(values, length));
    }
}

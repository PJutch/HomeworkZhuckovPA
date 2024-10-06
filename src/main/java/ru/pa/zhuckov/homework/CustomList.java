package ru.pa.zhuckov.homework;

public interface CustomList<T> {
    void add(T value);
    T get(int index);
    T remove(int index);
}

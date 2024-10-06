package ru.pa.zhuckov.homework;

public interface CustomList<T> {
    /**
     * Добавляет элемент в конец
     *
     * @param value значение нового элемента
     */
    void add(T value);

    /**
     * Получает значение элемента с данным индексом
     *
     * @param index индекс этого элемента, индексация с 0
     * @return значение элемента с индексом index
     * @throws IndexOutOfBoundsException если index вне [0, length)
     */
    T get(int index) throws IndexOutOfBoundsException;

    /**
     * Удаляет элемент с данным индексом
     *
     * @param index индекс этого элемента, индексация с 0
     * @return значение удалённого элемента
     * @throws IndexOutOfBoundsException если index вне [0, length)
     */
    T remove(int index) throws IndexOutOfBoundsException;
}

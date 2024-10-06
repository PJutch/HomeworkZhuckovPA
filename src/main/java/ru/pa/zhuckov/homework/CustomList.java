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
     */
    T get(int index);

    /**
     * Удаляет элемент с данным индексом
     *
     * @param index индекс этого элемента, индексация с 0
     * @return значение удалённого элемента
     */
    T remove(int index);
}

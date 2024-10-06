package ru.pa.zhuckov.homework;

import java.util.Arrays;

/**
 * Минималистичная реализация минималистичного списка.
 * Использует массив для хранения элементов.
 *
 * @param <T> тип элемента
 * @see java.util.ArrayList Более полный аналог в стандартной библиотеке
 */
public class CustomArrayList<T> implements CustomList<T> {
    private T[] values;
    private int length;

    /**
     * Создаёт список со значениями из values
     * Время работы - O(n)
     *
     * @param values значения, которыми будет инициализирован список
     */
    @SafeVarargs
    public CustomArrayList(T... values) {
        this.values = values;
        length = this.values.length;
    }

    /**
     * Добавляет value в конец списка
     * Время работы - O(n), амортизированное O(1)
     *
     * @param value значение элемента, добавленного в конец списка
     */
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

    /**
     * Получает элемент с индексом index
     * Время работы - O(1)
     *
     * @param index индекс элемента (начиная с 0)
     * @return значение элемента
     * @throws IndexOutOfBoundsException если index вне [0, length)
     */
    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > length) {
            throw new IndexOutOfBoundsException(index);
        }
        return values[index];
    }

    /**
     * Удаляет элемент с индексом index
     * Время работы - O(n)
     * Время удаления в конце - O(1)
     *
     * @param index индекс удаляемого элемента (начиная с 0)
     * @return значение удалённого элемента
     * @throws IndexOutOfBoundsException если index вне [0, length)
     */
    @Override
    public T remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > length) {
            throw new IndexOutOfBoundsException(index);
        }

        T oldValue = get(index);

        for (int i = index; i < length + 1; ++i) {
            values[i] = values[i + 1];
        }

        values[length] = null; // Удаляем лишнюю ссылку, чтобы память не утекала
        --length;

        return oldValue;
    }

    /**
     * Выводит все элементы.
     * Время работы - O(n)
     *
     * @return строку с toString всех элементов
     */
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(values, length));
    }
}

package ru.pa.zhuckov.homework;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>(1, 2, 3);
        System.out.println(list);

        list.add(4);
        System.out.println(list);

        System.out.println(list.get(1));

        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println(list.get(1));

        list.get(4);
    }
}

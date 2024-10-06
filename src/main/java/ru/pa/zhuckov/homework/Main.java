package ru.pa.zhuckov.homework;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        System.out.println(list.get(1));

        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println(list.get(1));
    }
}

package org.example;

public class Main {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.set(1, "frog");
        System.out.println(list.get(1));
        System.out.println(list.size());
        list.remove(2);
        System.out.println(list.size());
    }
}

package org.example;

public interface Collection<E> extends Iterable<E>{
    void add(E item); // добавить элемент в коллекцию

    boolean contains(Object element); //проверить, содержит ли коллекция элемент

    int size(); // размер коллекции

    boolean isEmpty(); // пустая ли коллекция

    void clear(); // очистить всю коллекцию

    void remove(int index); // удалить элемент из коллекции

    Iterator<E> iterator();
}

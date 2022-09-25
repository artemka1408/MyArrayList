package org.example;

public interface List<E> extends Collection<E> {
    E get(int index); // получить элемент по индексу

    void set(int index, E e); // установить элемент по индексу

    void addFirst(Object element); // добавить первым
}

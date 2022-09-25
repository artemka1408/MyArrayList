package org.example;

public interface Iterator<E> {
    E next(); // перейти к следующему элементу

    boolean hasNext();  // проверить, есть ли следующий элемент
}

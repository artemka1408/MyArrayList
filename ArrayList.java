package org.example;

public class ArrayList<E> implements List<E> {
    private static final int DEFAULT_SIZE = 10;

    private Object[] elements;

    private int size;

    public ArrayList() {
        elements = new Object[DEFAULT_SIZE];
        size = 0;
    }


    @Override
    public void add(Object element) {
        if (size == elements.length) {
            // создали массив в плотора раза больше
            resize();

        }

        this.elements[size] = element;
        size++;
    }

    private void resize() {
        Object[] newElements = new Object[elements.length + elements.length / 2];

        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }

        this.elements = newElements;
    }

    @Override
    public boolean contains(Object element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        for (Object o : elements) {
           o = null;
        }
    }

    @Override
    public void remove(int index) {
        if (index < 0 && index > size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < size; i++) {
            if (i == index) {
                elements[i] = null;
                size--;
            }
        }

    }

    // внутренний класс
    private class ArrayListIterator implements Iterator {
        // текущая позиция итератора
        private int current = 0;

        @Override
        public E next() {
            // запомнили элемент, который хотим вернуть
            Object element = elements[current];
            // сдвигаем позицию итератора
            current++;
            return (E) element;
        }

        @Override
        public boolean hasNext() {
            // пока не дошли до конца списка
            return current < size;
        }
    }

    @Override
    public Iterator iterator() {
        return new ArrayListIterator();
    }

    @Override
    public E get(int index) {
        if (index >= 0 && index < size) {
            return (E) elements[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void set(int index, E e) {
        if (index >= 0 && index < size) {
            elements[index] = e;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void addFirst(Object element) {
        if (size == elements.length) {
            resize();
        }
        for (int i = size + 1; i > 0; i--) {
            this.elements[i] = this.elements[i - 1];
        }

        this.elements[0] = element;
        size++;
    }
}


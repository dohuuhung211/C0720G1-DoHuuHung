package kiem_tra;

public class MyArrayList<E> {
    public int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(int index, E element) {
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    public void remove(int index) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == elements[index]) {
                elements[index] = elements[index + 1];
            }
            elements[size] = null;
        }
        size--;
    }

    public void displayArrayList() {
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }

}


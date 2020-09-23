package collections_10.bai_tap;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;

    //Suc chua cua ArrayList
    private static final int DEFAULT_CAPACITY = 10;

    //Mang chua cac phan tu
    Object elements[];

    //suc chua mac dinh khi khoi tao constractor ko tham so
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //constructor voi suc chua dc truyen vao
    public MyArrayList(int capacity){
        if (capacity > 0){
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Capacity: " + capacity);
        }
    }

    //Phuong thuc tra ve so luong phan tu
    public int size(){
        return this.size;
    }

    //Phuong thuc clear 1 ArrayList
    public void clear(){
        size = 0;
        for (int i = 0; i < elements.length; i++){
            elements[i] = null;
        }
    }

    //Phuong thuc add 1 phan tu vao ArrayList
    public boolean add(E element){
        if (elements.length == size){
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    //tang kich thuong mang khi so luong phan tu vuot qua
    public void ensureCapacity(int minCapacity){
        if (minCapacity >= 0){
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }
    //them phan tu tai vi tri index
    public void add(E element, int index){
        if (index > elements.length){
            throw new IllegalArgumentException();
        } else if (elements.length == size){
            this.ensureCapacity(5);
        }

        if (elements[index] == null){
            elements[index] = element;
            size++;
        }else {
            for (int i = size + 1; i >= index; i--){
                elements[i] = elements[i-1];
            }
            elements[index] = element;
            size++;
        }
    }

    //get 1 phan tu tai vi tri index
    public E get(int index){
        return (E) elements[index];
    }

    //Lay index cua 1 phan tu
    public int indexOf(E element){
        int index = -1;
        for (int i = 0; i < size; i++){
            if (this.elements[i].equals(element)){
                return i;
            }
        }
        return index;
    }

    public boolean contains (E element){
        return this.indexOf(element) >= 0;
    }

    public MyArrayList<E> clone(){
        MyArrayList<E> v = new MyArrayList<>();
        v.elements = Arrays.copyOf(elements,size);
        v.size = this.size;
        return v;
    }

    public E remove(int index){
        if (index < 0 || index > elements.length){
            throw new IllegalArgumentException("Error index: " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++){
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }
}

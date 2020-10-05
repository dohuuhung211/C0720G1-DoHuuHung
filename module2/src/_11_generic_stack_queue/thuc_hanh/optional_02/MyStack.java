package _11_generic_stack_queue.thuc_hanh.optional_02;

public class MyStack {
    public int[] arr;
    public int size;
    public int index = 0;
    public MyStack(int size){
        this.size = size;
        arr = new int[size];
    }
    public void push(int element){
        if (isFull()){
            throw new StackOverflowError("Stack da day");
        }
        arr[index] = element;
        index++;
    }
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }
    public int size() {
        return index;
    }
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }
}

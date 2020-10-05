package _11_generic_stack_queue.bai_tap.bai_01;

import java.util.Stack;

public class DaoNguocPhanTuTrongMang {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
//        System.out.println("before " + myStack.size());
        int sizeStack = myStack.size();
        for (int i = 0; i < sizeStack; i++){
            System.out.println(myStack.pop());
        }
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println(myStack);
    }
}

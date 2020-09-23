package generic_stack_queue.thuc_hanh.thuc_hanh_01;

import java.util.LinkedList;
import java.util.Queue;

class MyQueue {
    public static void main(String[] args) {
        Queue myQueue = new LinkedList();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        System.out.println(myQueue.peek());
        myQueue.poll();
//
        while (!myQueue.isEmpty()){
            System.out.println(myQueue.poll());
        }
    }
}


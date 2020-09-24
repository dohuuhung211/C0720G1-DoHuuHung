package generic_stack_queue_11.thuc_hanh.optional_01;

public class TrienKhaiQueueSuDungMang {
    static class MyQueue{
        public int capacity;
        public int[] queueArr;
        public int head = 0;
        public int tail = -1;
        public int currentSize = 0;

        public MyQueue(int queueSize){
            this.capacity = queueSize;
            queueArr = new int[this.capacity];
        }
        public boolean isQueueFull(){
            boolean status = false;
            if (currentSize == capacity){
                status = true;
            }
            return status;
        }
        public boolean isQueueEmpty(){
            boolean status = false;
            if (currentSize == 0){
                status = true;
            }
            return status;
        }
        public void enqueue(int item){

            if (isQueueFull()){
                System.out.println("Mang da day");
            } else {
                tail++;
                if (tail == capacity - 1){
                    tail = 0;
                }
                queueArr[tail] = item;
                currentSize++;
                System.out.println("Phan tu " + item + " da duoc them");
            }
        }
        public void dequeue() {
            if (isQueueEmpty()) {
                System.out.println("Mang rong, khong the xoa");
            } else {
                head++;
                if (head == capacity - 1) {
                    System.out.println("Da xoa phan tu: " + queueArr[head - 1]);
                    head = 0;
                } else {
                    System.out.println("Da xoa phan tu: " + queueArr[head - 1]);
                }
                currentSize--;
            }
        }
    }
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(56);
        queue.enqueue(2);
        queue.enqueue(67);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(24);
        queue.dequeue();
        queue.enqueue(98);
        queue.enqueue(45);
        queue.enqueue(23);
        queue.enqueue(435);
    }
}

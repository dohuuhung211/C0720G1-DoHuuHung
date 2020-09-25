package kiem_tra;

public class MyLinkedList<E> {
    public int size() {
        return numNodes;
    }

    public class Node{
        Node next;
        Object data;
        public Node(Object data){
            this.data = data;
        }
        Object getData(){
            return this.data;
        }
    }
    private Node head;
    private int numNodes;
    public MyLinkedList(E element){
        head = new Node(element);
        numNodes++;
    }
//    public void addLast(E element){
//        Node temp = head;
//
//        for (int i = 0; i < numNodes - 1; i++) {
//            temp = temp.next;
//        }
//
//        Node newNode = new Node(element);
//        temp.next = newNode;
//        numNodes++;
//    }
    public void addlast(E element){
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++){
            temp = temp.next;
        }
        Node newNode = new Node(element);
        temp.next = newNode;
        numNodes++;
    }
//    public void print(){
//        Node temp = head;
//        for (int i = 0; i < numNodes; i++){
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
//    }
    public void print(){
        Node temp = head;
        for (int i = 0; i < numNodes; i++){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void removeLast(){
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++){
            temp = temp.next;
        }
        temp.next = null;
        numNodes--;
    }
    public void add(E element, int index){
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1; i++){
             temp = temp.next;
        }
//        holder = temp.next;
//        temp.next = new Node(element);
//        temp.next.next = holder;
//        numNodes++;

        Node newElement = new Node(element);
        holder = temp.next;
        temp.next = newElement;
        newElement.next = holder;

        
        numNodes++;
    }
}

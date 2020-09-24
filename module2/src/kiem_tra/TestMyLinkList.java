package kiem_tra;
import java.util.Queue;
public class TestMyLinkList {
    public static void main(String[] args) {
        MyLinkedList<Integer> a = new MyLinkedList<>(1);
        a.addlast(8);
        a.addlast(22);
        a.addlast(1);
        a.addlast(4);
        a.addlast(7);
        a.addlast(2);
//        a.removeLast();
        a.print();
        System.out.println();
        a.add(5,4);
        a.print();
        }
    }

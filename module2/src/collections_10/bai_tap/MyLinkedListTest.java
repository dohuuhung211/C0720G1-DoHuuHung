package collections_10.bai_tap;

import javax.swing.*;
import java.util.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1,"Hung");
        Student student2 = new Student(2,"Trang");
        Student student3 = new Student(3,"Thuy");
        Student student4 = new Student(4,"Khang");
//        myLinkedList.addFir st(student1);
////        myLinkedList.addFirst(student2);
////        myLinkedList.addFirst(student3);
////        myLinkedList.addFirst(student4);
        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addLast(student3);
        for (int i = 0; i < myLinkedList.size(); i++){
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }
    }
}

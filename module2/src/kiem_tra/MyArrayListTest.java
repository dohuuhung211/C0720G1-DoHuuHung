package kiem_tra;

public class MyArrayListTest {

    public static void main(String[] args) {
//        class Student{
//            private int id;
//            private String name;
//            public Student(){};
//            public Student(int id, String name) {
//                this.id = id;
//                this.name = name;
//            }
//
//            public int getId() {
//                return id;
//            }
//
//            public void setId(int id) {
//                this.id = id;
//            }
//
//            public String getName() {
//                return name;
//            }
//
//            public void setName(String name) {
//                this.name = name;
//            }
//        }
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(0, 1);
        myArrayList.add(1, 2);
        myArrayList.add(2, 3);
        myArrayList.displayArrayList();
        myArrayList.remove(1);
        myArrayList.displayArrayList();

    }
}

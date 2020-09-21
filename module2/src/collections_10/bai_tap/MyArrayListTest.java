package collections_10.bai_tap;

public class MyArrayListTest {
    public static class Student{
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

    public static void main(String[] args) {
        Student a = new Student(1,"Hung");
        Student b = new Student(2,"Huy");
        Student c = new Student(3,"Hieu");
        Student d = new Student(4,"Hai");
        Student e = new Student(5, "Hoang");
        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e, 3);
//        for (int i = 0; i < studentMyArrayList.size(); i++){
//            Student student = (Student) studentMyArrayList.elements[i];
//            System.out.println(student.getId());
//            System.out.println(student.getName());
//        }
        System.out.println(studentMyArrayList.size());
    }
}
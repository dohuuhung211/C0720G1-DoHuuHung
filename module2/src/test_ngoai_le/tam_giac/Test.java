package test_ngoai_le.tam_giac;

import java_collection_framework_12.thuc_hanh.thuc_hanh_03.Student;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static final String FILE_NAME = "src/student.csv";
    public static final String COMMA = ",";
    public static void main(String[] args) {
//        Student student1 = new Student("Hung",25,"Da Nang");
//        Student student2 = new Student("Sa",24,"Quang Nam");
//        Student student3 = new Student("Can",25,"Da Nang");
//        List<Student> listStudent = new ArrayList<>();
//        listStudent.add(student1);
//        listStudent.add(student2);
//        listStudent.add(student3);
//        String line = null;
//        for (Student student: listStudent){
//            line = student.getName() + COMMA + student.getAge() + COMMA + student.getAddress();
//            TestCheckedException.writeFile(FILE_NAME,line);
//        }
        List<String> listLine = TestCheckedException.readFile(FILE_NAME);
        System.out.println(listLine);
        String[] lineSplit = listLine.get(0).split(COMMA);
        Student student1 = new Student(lineSplit[0],(Integer.parseInt(lineSplit[1])),lineSplit[2]);
        System.out.println(student1.getName() + " " + student1.getAge() + " " + student1.getAddress());
    }
}

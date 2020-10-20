package thi_module_2;

import thi_thu.FileUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static thi_module_2.Validate.*;

public class MainMenu {
    private static final String FILE_STUDENT = "G:\\C0720G1_Do_Huu_Hung\\module2\\src\\thi_module_2\\Student.csv";
    private static final String FILE_TEACHER = "G:\\C0720G1_Do_Huu_Hung\\module2\\src\\thi_module_2\\Teacher.csv";
    public static final String FILE_BACTCHS = "G:\\C0720G1_Do_Huu_Hung\\module2\\src\\thi_module_2\\Bacths.csv";

    static List<Student> studentList = new ArrayList<>();
    static List<String> stringList = new ArrayList<>();
    public static List<ClassMain> classList = new ArrayList<>();
    static List<Teacher> teacherList = new ArrayList<>();
    static List<String> stringList1 = new ArrayList<>();
    private static final String COMMA = ",";
    static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        int input;
        do {
            System.out.println("Vui long chon menu");
            System.out.println("1. Them moi sinh vien \n" +
                    "2. Xoa sinh vien \n" +
                    "3. Xem danh sach sinh vien \n" +
                    "4. Xem thong tin giao vien \n" +
                    "5. Tim kiem sinh vien theo ten \n" +
                    "6. Thoat");
            input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1:
                    addNewStudent();
                    break;
                case 2:
                    deleteStudent();
                    break;
                case 3:
                    showInforStudent();
                    break;
                case 4:
                    showInforTeacher();
                    break;
                case 5:
                    findStudent();
                    break;
                case 6:
                    break;
                default:
            }
        } while (input > 0 && input < 7);
    }
    public static void addNewStudent() {
        boolean flag = false;
        readFileBatch();
        readFileStudent();
        int id = 0;
        id = (studentList.size() == 0) ? 1 : id + (studentList.get(studentList.size() - 1).getId() + 1);
//          if (studentList.size() == 0) {
//            id = 1;
//        } else {
//            id = studentList.size() + 1;
//        }
        System.out.println("Ten sinh vien");
        String name = scanner.nextLine();
        while (!validNameStudent(name)){
            System.err.println("Ten khong dung dinh dang");
            name = scanner.nextLine();
        }
        System.out.println("Ngay sinh");
        String dateOfBirth = scanner.nextLine();
        while (!validDateOfBirth(dateOfBirth)){
            System.err.println("ngay sinh khong dung dinh dang");
            dateOfBirth = scanner.nextLine();
        }
        System.out.println("Gioi tinh");
        String gender = scanner.nextLine();
        while (!validGender(gender)){
            System.err.println("Vui long nhap gioi tinh");
            gender = scanner.nextLine();
        }
        System.out.println("So dien thoai");
        String phoneNumber = scanner.nextLine();
        while (!validPhoneNumber(phoneNumber)){
            System.err.println("So dien thoai khong dung dinh dang");
            phoneNumber = scanner.nextLine();
        }
        String idClass;
        do {
            flag = false;
            System.out.print("Nhap ma lop hoc: ");
            idClass = scanner.nextLine();
            for (ClassMain classMain : classList) {
                if (classMain.getIdClass().equals(idClass)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
            System.out.println("Ma lop hoc khong ton tai");
        } while (true);
        String line = id + COMMA + name + COMMA + dateOfBirth + COMMA + gender + COMMA + phoneNumber + COMMA + idClass;
        FileUtils.writeFile(FILE_STUDENT, line);
        Student student = new Student(id, name, dateOfBirth,gender, phoneNumber, idClass);
        studentList.add(student);
        System.out.println("Them sinh vien thanh cong");
        System.out.println("--------------------------------");
    }
    public static void readFileStudent(){
        studentList = new ArrayList<>();
        stringList = FileUtils.readFile(FILE_STUDENT);
        for (String line: stringList){
            String[] split = line.split(",");
            if (split.length != 1){
                Student student = new Student(Integer.parseInt(split[0]),split[1],split[2],split[3],split[4],split[5]);
                studentList.add(student);
            }
        }
    }
    public static void readFileTeacher(){
        teacherList = new ArrayList<>();
        stringList1 = FileUtils.readFile(FILE_TEACHER);
        for (String line: stringList1){
            String[] split = line.split(",");
            if (split.length != 1){
                Teacher teacher = new Teacher(Integer.parseInt(split[0]), split[1], split[2], split[3], split[4]);
                teacherList.add(teacher);
            }
        }
    }
    public static void readFileBatch() {
        stringList = FileUtils.readFile(FILE_BACTCHS);
        classList = new ArrayList<>();
        for (String line : stringList) {
            String[] split = line.split(",");
            ClassMain classMain = new ClassMain(split[0], split[1], split[2]);

            classList.add(classMain);
        }
    }

    public static void showInforStudent(){
        readFileStudent();
        System.out.println("Danh sach sinh vien");
        Collections.sort(studentList);
        int i = 1;
        for (Student list: studentList){
            System.out.println(i++ + ". " + list.toString());
        }
        System.out.println("--------------------------------------------------");
    }
    public static void showInforTeacher(){
        readFileTeacher();
        System.out.println("Danh sach giao vien");
        int i = 1;
        for (Teacher list: teacherList){
            System.out.println(i++ + ". " + list.toString());
        }
        System.out.println("--------------------------------------------------");
    }
    public static void findStudent(){
        boolean flag = false;
        while (!flag){
            System.out.println("Nhap ten sinh vien can tim");
            String name = scanner.nextLine();
            for (Student student: studentList){
                if (student.getName().contains(name)){
                    System.out.println(student);
                    flag = true;
                }
            }
            if (!flag){
                System.out.println("Ten sinh vien khong co trong danh sach, moi nhap lai");
                flag = false;
            }
        }
    }
//    public static void deleteStudent(){
//        showInforStudent();
//        stringList = FileUtils.readFile(FILE_STUDENT);
//        System.out.println("Chon vi tri sinh vien muon xoa");
//        String pos = scanner.nextLine();
//        stringList.remove(Integer.parseInt(pos) - 1);
//        FileUtils.writeInFile(FILE_STUDENT,stringList);
//        System.out.println("Xoa thanh cong");
//    }
    public static void deleteStudent() {
        readFileStudent();
        boolean flag;
        Scanner scanner = new Scanner(System.in);
        int id = 0;
        do {
            flag = true;
            try {
                System.out.print("Nhap id sinh vien: ");
                id = scanner.nextInt();
                scanner.nextLine();
                checkId(id);
            } catch (NotFoundStudentException e) {
                e.printStackTrace();
                flag = false;
            }

        } while (!flag);

        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                System.out.println("Yes hoac Khong");
                if (scanner.nextLine().equals("Yes")) {
                    studentList.remove(i);
                    i--;
                } else {
                    return;
                }
            }
        }
        stringList = new ArrayList<>();
        for (Student student : studentList) {
            String line = student.getId() + COMMA + student.getName() + COMMA +
                    student.getDateOfBirth() + COMMA + student.getGender() + COMMA +
                    student.getPhoneNumber() + COMMA + student.getIdClass();
            stringList.add(line);
        }

        thi_module_2.FileUtils.writeInFile(FILE_STUDENT, stringList);
        showInforStudent();
    }


    public static void main(String[] args) {
        displayMainMenu();
    }
}

package thi_thu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainMenu {
    static List<Student> studentList = new ArrayList<>();
    static List<String> stringList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    private static final String FILE_STUDENT = "G:\\C0720G1_Do_Huu_Hung\\module2\\src\\thi_thu\\Student.csv";
    private static final String COMMA = ",";
    public static void mainMenu(){
        int input;
        do {
            System.out.println("Vui long chon menu");
            System.out.println("1. Hien thi danh sach sinh vien \n" +
                    "2. Them sinh vien \n" +
                    "3. Sua thong tin sinh vien \n" +
                    "4. Xoa sinh vien \n" +
                    "5. Tim kien theo ten hoac id \n" +
                    "6. Thoat");
            input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1:
                    showListStudent();
                    break;
                case 2:
                    addNewStudent();
                    break;
                case 3:
                    editInforStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    findStudent();
                    break;
                case 6:
                    break;
                default:
                    mainMenu();
            }
        }while (input > 0 && input < 7);
    }
    public static void addNewStudent(){
        System.out.println("Nhap ma sinh vien");
        String id = scanner.nextLine();
        System.out.println("Nhap ten sinh vien");
        String name = scanner.nextLine();
        boolean flag = false;
        String birthday = null;
        do {
            try {
                flag = true;
                System.out.println("Nhap ngay sinh sinh vien");
                birthday = scanner.nextLine();
                validBirthday(birthday);
            } catch (ValidBirthday e) {
                System.err.println(e.getMessage());
                flag = false;
            }

        }while (!flag);
        String line = id + COMMA + name + COMMA + birthday;
        FileUtils.writeFile(FILE_STUDENT, line);
        Student student = new Student(Integer.parseInt(id),name,birthday);
        studentList.add(student);
        System.out.println("Them sinh vien thanh cong");
        System.out.println("--------------------------------");
    }
    public static void showListStudent(){
        readFileStudent();
        Collections.sort(studentList);
        int i = 1;
        for (Student student: studentList){
            System.out.println(i++ + ". " + student.toString());
        }
        System.out.println("----------------------------------------");

    }
    public static void readFileStudent(){
        stringList = FileUtils.readFile(FILE_STUDENT);
        studentList = new ArrayList<>();
        for (String list: stringList){
            String[] spl = list.split(",");
            if (spl.length != 1){
                Student student = new Student(Integer.parseInt(spl[0]),spl[1],spl[2]);
                studentList.add(student);
            }
        }
    }
    public static void deleteStudent(){
        showListStudent();
        System.out.println("Chon vi tri sinh vien muon xoa");
        String pos = scanner.nextLine();
        stringList.remove(Integer.parseInt(pos) - 1);
        FileUtils.writeInFile(FILE_STUDENT,stringList);
    }
    public static void editInforStudent(){
        showListStudent();
        System.out.println("1. Nhap sinh vien muon thay doi");
        String input = scanner.nextLine();
        System.out.println("1. Ma sinh vien: " + studentList.get(Integer.parseInt(input) - 1).getId() + "\n" +
                "2. Ten sinh vien: " + studentList.get(Integer.parseInt(input) - 1).getName() + "\n" +
                "3. Ngay sinh: " + studentList.get(Integer.parseInt(input) - 1).getBirthday() + "\n" +
                "4. Quay lai menu");
        System.out.println("Nhap thong tin can thay doi");
        int choose = scanner.nextInt();
        scanner.nextLine();
        switch (choose) {
            case 1:
                System.out.println("Nhap lai id moi");
                int id = scanner.nextInt();
                scanner.nextLine();
                studentList.get(Integer.parseInt(input) - 1).setId(id);
                System.out.println("thay doi thanh cong");
                break;
            case 2:
                System.out.println("Nhap lai ten moi");
                String name = scanner.nextLine();
                studentList.get(Integer.parseInt(input) - 1).setName(name);
                System.out.println("thay doi thanh cong");
                break;
            case 3:
                boolean flag = false;
                String age = null;
                do {
                    flag = true;
                    try {
                        System.out.println("Nhap tuoi moi");
                        age = scanner.nextLine();
                        validBirthday(age);
                    } catch (ValidBirthday e) {

                        System.err.println(e.getMessage());
                        flag = false;
                    }
                } while (!flag);
                studentList.get(Integer.parseInt(input) - 1).setBirthday(age);
                System.out.println("thay doi thanh cong");
                break;
            default:
                mainMenu();
        }
        updateFile();
    }
    public static void findStudent(){
        showListStudent();
        boolean flag = false;
        System.out.println("Nhap lua chon");
        System.out.println("1. Tim theo id \n" +
                            "2. Tim theo ten \n" +
                            "3. Quay lai menu");
        String input = scanner.nextLine();
        switch (input){
            case "1":
                System.out.println("Nhap id can tim");
                int id = scanner.nextInt();
                for (Student student: studentList){
                    if (student.getId() == id){
                        System.out.println(student);
                        flag = true;
                    }
                }
                if (!flag){
                    System.out.println("Id khong ton tai");
                }
                break;
            case "2":
                System.out.println("Nhap ten sinh vien can tim");
                String name = scanner.nextLine();
                for (Student student: studentList){
                    if (student.getName().contains(name)){
                        System.out.println(student);
                        flag = true;
                    }
                }
                if (!flag){
                    System.out.println("Ten sinh vien khong co trong danh sach");
                }
                break;
            case "3":
                break;
            default:
                mainMenu();
        }
    }
    public static void updateFile() {
        stringList = new ArrayList<>();
        for (Student student: studentList) {
            String line = student.getId() + COMMA + student.getName() + COMMA + student.getBirthday();
            stringList.add(line);
        }
        FileUtils.writeInFile(MainMenu.FILE_STUDENT, stringList);
    }
    public static void validBirthday(String regex) throws ValidBirthday{
        final String REGEX_BIRTHDAY = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])" +
                "[./-](19(\\d[1-9]|[1-9]\\d)|200[0-1])$";
        Pattern pattern = Pattern.compile(REGEX_BIRTHDAY);
        Matcher matcher = pattern.matcher(regex);
        if (!matcher.find()) throw new ValidBirthday("Ngay sinh khong dung dinh dang");
    }
    public static void main(String[] args) {
        mainMenu();
    }
}

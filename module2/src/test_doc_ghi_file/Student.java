package test_doc_ghi_file;

import java.io.*;
import java.util.Scanner;


public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String address;
    private int age;

    public void Studet() {}

    public Student(int id, String name, String address, int age) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString() {
        return "Student@[id=" + id + " , name=" + name + ", "
                + "address= " + address + ",age =" + age+ "]";
    }
    public static void ObjectInputStream() throws IOException{
        ObjectInputStream ois = null;
        try{
            ois = new ObjectInputStream(new FileInputStream("G:\\C0720G1_Do_Huu_Hung\\module2\\src\\test_doc_ghi_file\\alo.csv"));
            Student student = (Student) ois.readObject();
            System.out.println(student.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            ois.close();
        }
    }
    public static void ObjectOutputStream() throws IOException{
        ObjectOutputStream oos = null;
        try{
            System.out.println("Nhap so hoc sinh muon them");
            Scanner scanner = new Scanner(System.in);
            int add = scanner.nextInt();
            oos = new ObjectOutputStream(new FileOutputStream("G:\\C0720G1_Do_Huu_Hung\\module2\\src\\test_doc_ghi_file\\alo.csv",true));
            Student student = null;
            scanner.nextLine();
            while (add > 0){
                System.out.println("Nhap id");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Nhap ten");
                String name= scanner.nextLine();
                System.out.println("Nhap dia chi");
                String address = scanner.nextLine();
                System.out.println("Nhap tuoi");
                int age = scanner.nextInt();
                student = new Student(id,name,address,age);
                add--;
            }
            oos.writeObject(student);
            System.out.println("Ghi thanh cong");
        }catch (IOException e){
            System.out.println("File khong ton tai");
        } finally {
            oos.close();
        }
    }

    public static void main(String[] args) throws IOException {
        ObjectOutputStream();
        ObjectInputStream();
    }
}

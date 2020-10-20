package thi_module_2;

public class Student extends Person implements Comparable<Student>{
    String idClass;

    public Student(int id, String name, String dateOfBirth, String gender, String phoneNumber, String idClass) {
        super(id, name, dateOfBirth, gender, phoneNumber);
        this.idClass = idClass;
    }

    public String getIdClass() {
        return idClass;
    }

    public void setIdClass(String idClass) {
        this.idClass = idClass;
    }

    @Override
    public String toString() {
        return "Ma lop hoc: "  + idClass + ", " +
                "Ma sinh vien: " + id + ", " +
                "Ten: " + name + ", " +
                "Ngay sinh: " + dateOfBirth + ", " +
                "Gioi tinh: " + gender + ", " +
                "So dien thoai: " + phoneNumber;
    }

    @Override
    public int compareTo(Student student) {
        int result = this.getId() - (student.getId());
        if (result == 0){
            result = this.getName().compareTo(student.getName());
        }
        return result;
    }

    @Override
    public void showInfor() {
        this.toString();
    }
}

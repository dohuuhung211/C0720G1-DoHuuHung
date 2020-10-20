package thi_module_2;

public class Teacher extends Person{
    public Teacher(int id, String name, String dateOfBirth, String gender, String phoneNumber) {
        super(id, name, dateOfBirth, gender, phoneNumber);
    }

    @Override
    public void showInfor() {
        this.toString();
    }

    @Override
    public String toString() {
        return "Ma giao vien: " + id + ", " +
                "Ten: " + name + ", " +
                "Ngay sinh: " + dateOfBirth + ", " +
                "Gioi tinh: " + gender + ", " +
                "So dien thoai: " + phoneNumber;
    }
}

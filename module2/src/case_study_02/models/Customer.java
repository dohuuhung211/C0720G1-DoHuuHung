package case_study_02.models;

import case_study_02.models.Service;

import java.util.Calendar;
import java.util.Date;

public class Customer implements Comparable<Customer>{
    String nameCustomer;
    String dayOfBirth;
    String gender;
    int idCard;
    int phoneNumber;
    String email;
    String typeCustomer;
    String address;
    Service useService;
    public Customer(){}

    public Customer(String nameCustomer, String dayOfBirth, String gender, int idCard,
                    int phoneNumber, String email, String typeCustomer, String address, Service useService) {
        this.nameCustomer = nameCustomer;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
        this.useService = useService;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Service getUseService() {
        return useService;
    }

    public void setUseService(Service useService) {
        this.useService = useService;
    }
    public String showInfo(){
        return this.toString();
    }
    @Override
    public String toString() {
        return "Ten khach hang: " + nameCustomer + "\n" +
                "Ngay sinh: " + dayOfBirth + "\n" +
                "Gioi tinh: " + gender + "\n" +
                "Chung minh nhan dan: " + idCard + "\n" +
                "So dien thoai: " + phoneNumber + "\n" +
                "Email: " + email + "\n" +
                "Loai khach hang: " + typeCustomer + "\n" +
                "Dia chi: " + address + "\n" +
                "Su dung dich vu: " + useService;
    }

    @Override
    public int compareTo(Customer customer) {
        int result = this.getNameCustomer().compareTo(customer.getNameCustomer());
        if (result == 0){
            result = this.getDayOfBirth().substring(6,10).compareTo(customer.getDayOfBirth().substring(6,10));
        }
        return result;
    }
}

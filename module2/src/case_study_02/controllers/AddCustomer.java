package case_study_02.controllers;

import case_study_02.commons.FileUtils;
import case_study_02.exception.*;
import case_study_02.models.Customer;
import case_study_02.models.Service;

import java.util.*;

import static case_study_02.controllers.MainController.COMMA;
import static case_study_02.controllers.ValidateCustomer.*;

public class AddCustomer {
    static List<Customer> listCustomer = new ArrayList<>();
    private static final String FILE_ADD_CUSTOMER = "G:\\C0720G1_Do_Huu_Hung\\module2\\src\\case_study_02\\data\\Customer.csv";
    static Scanner scanner = new Scanner(System.in);
    public static String convert(String str){
        return str = str.toLowerCase();
    }
    public static void addNewCustomer(){
        boolean flag = false;
        String name = null;
        do {
            try{
                flag = true;
                System.out.println("Ten khach hang");
                name = scanner.nextLine();
                validNameCustomer(name);
            } catch (NameException e) {
                System.err.println(e.getMessage());
                flag = false;
            }
        } while (!flag);

        String dayOfBirth = null;
        do {
            try {
                flag = true;
                System.out.println("Ngay sinh");
                dayOfBirth = scanner.nextLine();
                validBirthday(dayOfBirth);
            } catch (BirthDayException e) {
                System.err.println(e.getMessage());
                flag = false;
            }
        }while (!flag);

        String gender = null;
        do {
            try{
                flag = true;
                System.out.println("Gioi tinh");
                gender = scanner.nextLine();
                validGender(gender);
            } catch (GenderException e) {
                System.err.println(e.getMessage());
                flag = false;
            }
        }while (!flag);


        String idCard = null;
        do {
            try {
                flag = true;
                System.out.println("Chung minh nhan dan");
                idCard = scanner.nextLine();
                validIdCard(idCard);

            } catch (IdCardException e) {
                System.err.println(e.getMessage());
                flag = false;
            }
        }while (!flag);
        System.out.println("So dien thoai");
        String phoneNumber = scanner.nextLine();
        String email = null;
        do {
            try {
                flag = true;
                System.out.println("Nhap email");
                email = scanner.nextLine();
                validEmail(email);

            } catch (EmailException e) {
                System.err.println(e.getMessage());
                flag = false;
            }
        }while (!flag);
        System.out.println("Loai khach hang");
        String typeCustomer = scanner.nextLine();
        System.out.println("Dia chi");
        String address = scanner.nextLine();
        System.out.println("Su dung dich vu");
        Service useService = null;
        Customer customer = new Customer(name, dayOfBirth, convert(gender), Integer.parseInt(idCard), Integer.parseInt(phoneNumber)
                , email , typeCustomer, address, useService);
        String line = name + COMMA + dayOfBirth + COMMA + convert(gender) + COMMA + idCard + COMMA + phoneNumber + COMMA  + email +
                COMMA + typeCustomer + COMMA + address + COMMA + useService;
        FileUtils.writeFile(FILE_ADD_CUSTOMER, line);
        listCustomer.add(customer);
        System.out.println("Them moi thanh cong");
        System.out.println("--------------------------------------------------");
    }
    public static void readFileCustomer(){
        List<String> customerList = FileUtils.readFile(FILE_ADD_CUSTOMER);
        for (String line: customerList){
            String[] split = line.split(",");
            if (split.length != 1){
                Customer customer = new Customer(split[0],split[1],split[2],Integer.parseInt(split[3]),
                        Integer.parseInt(split[4]),split[5],split[6],split[7],null);
                convert(split[2]);
                listCustomer.add(customer);
            }
        }
    }
    public static void showInforCustomer(){
        System.out.println("Thong tin khach hang");
        Collections.sort(listCustomer);
        for (Customer x: listCustomer){
            System.out.println(x.showInfo());
            System.out.println("--------------------------------------------------");
        }
    }
}

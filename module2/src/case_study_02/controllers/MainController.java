package case_study_02.controllers;

import _12_java_collection_framework.thuc_hanh.optional.Tree;
import case_study_02.commons.FileUtils;
import case_study_02.models.BonusService;
import case_study_02.models.House;
import case_study_02.models.Room;
import case_study_02.models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import static case_study_02.controllers.AddCustomer.*;
import static case_study_02.controllers.Booking.addNewBook;
import static case_study_02.controllers.Employee.showAllEmployee;
import static case_study_02.controllers.FilingCabinets.*;
import static case_study_02.controllers.ValidateService.*;

public class MainController {
    static List<Villa> villaList = new ArrayList<>();
    static List<House> houseList = new ArrayList<>();
    static List<Room> roomList = new ArrayList<>();
    public static final String COMMA = ",";
    public static final String FILE_VILLA = "G:\\C0720G1_Do_Huu_Hung\\module2\\src\\case_study_02\\data\\Villa.csv";
    public static final String FILE_HOUSE = "G:\\C0720G1_Do_Huu_Hung\\module2\\src\\case_study_02\\data\\House.csv";
    public static final String FILE_ROOM = "G:\\C0720G1_Do_Huu_Hung\\module2\\src\\case_study_02\\data\\Room.csv";
    static Scanner scanner = new Scanner(System.in);
    public static void displayMainMenu(){
        System.out.println("1. Them dich vu \n" +
                            "2. Hien thi dich vu \n" +
                            "3. Them khach hang \n" +
                            "4. Hien thi thong tin khach hang \n" +
                            "5. Dat cho moi \n" +
                            "6. Hien thi thong tin nhan vien \n" +
                            "7. Dat ve xem phim \n" +
                            "8. Tu dung ho so nhan vien \n" +
                            "9. Tim kiem ho so nhan vien \n" +
                            "10. Exit");
        int input = scanner.nextInt();
        scanner.nextLine();
        switch (input){
            case 1:
                addService();
                break;
            case 2:
                showServices();
                break;
            case 3:
                addNewCustomer();
                break;
            case 4:
                showInforCustomer();
                break;
            case 5:
                addNewBook();
                break;
            case 6:
                showAllEmployee();
                break;
            case 7:
                BookCinema.addTicket();
                break;
            case 8:
                cabinet();
                break;
            case 9:
                findCustomer();
                break;
            case 10:
                System.exit(10);
        }
        displayMainMenu();
    }
    public static void addService(){
        System.out.println("1. Them dich vu Villa \n" +
                            "2. Them dich vu House \n" +
                            "3. Them dich vu Room \n" +
                            "4. Quay lai menu \n" +
                            "5. Exit");
        int input = scanner.nextInt();
        scanner.nextLine();
        switch (input) {
            case 1:
                addServiceVilla();
                break;
            case 2:
                addServiceHouse();
                break;
            case 3:
                addServiceRoom();
                break;
            case 4:
                break;
            case 5:
                System.exit(5);
                break;
            default:
                System.out.println("Vui long chon lai menu");
        }
    }
    public static void addServiceVilla(){

        System.out.println("Ma dich vu");
        String code = scanner.nextLine();
        while (!validCodeVilla(code)){
            System.err.println("Ma khong dung dinh dang, moi nhap lai");
            code = scanner.nextLine();
        }
        System.out.println("Ten dich vu");
        String nameService = scanner.nextLine();
        while (!validNameService(nameService)){
            System.err.println("Ten dich vu phai viet hoa chu cai dau");
            nameService = scanner.nextLine();
        }
        System.out.println("Dien tich");
        String area = scanner.nextLine();
        while (!validArea(area)){
            System.err.println("Dien tich phai lon hon 30");
            area = scanner.nextLine();
        }
        System.out.println("Chi phi thue");
        String pay = scanner.nextLine();
        while (!validPay(pay)){
            System.err.println("Nhap khong dung dinh dang, moi nhap lai");
            pay = scanner.nextLine();
        }
        System.out.println("So luong khach");
        String quantity = scanner.nextLine();
        while (!validMaxQuantity(quantity)){
            System.err.println("So luong khong dung dinh dang");
            quantity = scanner.nextLine();
        }
        System.out.println("Kieu thue");
        String typeRent = scanner.nextLine();
        while (!validTypeRent(typeRent)){
            System.err.println("Phai theo tieu chuan thue: Theo ngay/ Theo thang/ Theo nam");
            typeRent = scanner.nextLine();
        }
        System.out.println("Tieu chuan phong");
        String standardRoom = scanner.nextLine();
        while(!validStandard(standardRoom)){
            System.err.println("Nhap chua dung dinh dang, vui long nhap lai");
            standardRoom = scanner.nextLine();
        }
        System.out.println("Mo ta dich vu");
        String ortherFacilities = scanner.nextLine();
        while (!validService(ortherFacilities)){
            System.err.println("Dich vu khong nam trong danh sach, moi nhap lai");
            ortherFacilities = scanner.nextLine();
        }
        System.out.println("Dien tich ho boi");
        String areaPool = scanner.nextLine();
        while (!validArea(areaPool)){
            System.err.println("Dien tich phai lon hon 30");
            areaPool = scanner.nextLine();
        }
        System.out.println("So Tang");
        String amountFloor = scanner.nextLine();
        while (!validFloor(amountFloor)){
            System.out.println("Nhap khong dung so tang");
            amountFloor = scanner.nextLine();
        }
        Villa villa = new Villa(code, nameService, Double.parseDouble(area), Double.parseDouble(pay),
                Integer.parseInt(quantity), typeRent, standardRoom, ortherFacilities,
                Double.parseDouble(areaPool), Integer.parseInt(amountFloor));
        String line = code + COMMA + nameService + COMMA + area + COMMA + pay + COMMA + quantity +
                COMMA + typeRent + COMMA + standardRoom + COMMA + ortherFacilities + COMMA + areaPool + COMMA + amountFloor;
        FileUtils.writeFile(FILE_VILLA, line);
        villaList.add(villa);
        System.out.println("Them dich vu thanh cong");
        System.out.println("---------------------------------------------------");
    }
    public static void addServiceHouse(){
        System.out.println("Ma dich vu");
        String code = scanner.nextLine();
        while (!validCodeHouse(code)){
            System.err.println("Ma khong dung dinh dang, moi nhap lai");
            code = scanner.nextLine();
        }
        System.out.println("Ten dich vu");
        String nameService = scanner.nextLine();
        while (!validNameService(nameService)){
            System.err.println("Ten dich vu phai viet hoa chu cai dau");
            nameService = scanner.nextLine();
        }
        System.out.println("Dien tich");
        String area = scanner.nextLine();
        while (!validArea(area)){
            System.err.println("Dien tich phai lon hon 30");
            area = scanner.nextLine();
        }
        System.out.println("Chi phi thue");
        String pay = scanner.nextLine();
        while (!validPay(pay)){
            System.err.println("Nhap khong dung dinh dang, moi nhap lai");
            pay = scanner.nextLine();
        }
        System.out.println("So luong khach");
        String quantity = scanner.nextLine();
        while (!validMaxQuantity(quantity)){
            System.err.println("So luong khong dung dinh dang");
            quantity = scanner.nextLine();
        }
        System.out.println("Kieu thue");
        String typeRent = scanner.nextLine();
        while (!validTypeRent(typeRent)){
            System.err.println("Phai theo tieu chuan thue: Theo ngay/ Theo thang/ Theo nam");
            typeRent = scanner.nextLine();
        }
        System.out.println("Tieu chuan phong");
        String standardRoom = scanner.nextLine();
        while(!validStandard(standardRoom)){
            System.err.println("Nhap chua dung dinh dang, vui long nhap lai");
            standardRoom = scanner.nextLine();
        }
        System.out.println("Mo ta dich vu");
        String ortherFacilities = scanner.nextLine();
        while (!validService(ortherFacilities)){
            System.err.println("Dich vu khong co trong danh sach, moi nhap lai");
            ortherFacilities = scanner.nextLine();
        }
        System.out.println("So Tang");
        String amountFloor = scanner.nextLine();
        House house = new House(code, nameService, Double.parseDouble(area), Double.parseDouble(pay),
                Integer.parseInt(quantity), typeRent, standardRoom, ortherFacilities, Integer.parseInt(amountFloor));
        String line = code + COMMA + nameService + COMMA + area + COMMA + pay + COMMA + quantity +
                COMMA + typeRent + COMMA + standardRoom + COMMA + ortherFacilities + COMMA + amountFloor;
        FileUtils.writeFile(FILE_HOUSE, line);
        houseList.add(house);
        System.out.println("Them dich vu thanh cong");
        System.out.println("---------------------------------------------------");
    }
    public static void addServiceRoom(){
        System.out.println("Ma dich vu");
        String code = scanner.nextLine();
        while (!validCodeRoom(code)){
            System.err.println("Ma khong dung dinh dang, moi nhap lai");
            code = scanner.nextLine();
        }
        System.out.println("Ten dich vu");
        String nameService = scanner.nextLine();
        while (!validNameService(nameService)){
            System.err.println("Ten dich vu phai viet hoa chu cai dau");
            nameService = scanner.nextLine();
        }
        System.out.println("Dien tich");
        String area = scanner.nextLine();
        while (!validArea(area)){
            System.err.println("Dien tich phai lon hon 30");
            area = scanner.nextLine();
        }
        System.out.println("Chi phi thue");
        String pay = scanner.nextLine();
        while (!validPay(pay)){
            System.err.println("Nhap khong dung dinh dang, moi nhap lai");
            pay = scanner.nextLine();
        }
        System.out.println("So luong khach");
        String quantity = scanner.nextLine();
        while (!validMaxQuantity(quantity)){
            System.err.println("So luong khong dung dinh dang");
            quantity = scanner.nextLine();
        }
        System.out.println("Kieu thue");
        String typeRent = scanner.nextLine();
        while (!validTypeRent(typeRent)){
            System.err.println("Phai theo tieu chuan thue: Theo ngay/ Theo tuan/ Theo nam");
            typeRent = scanner.nextLine();
        }
        System.out.println("Dich vu mien phi kem theo");
        String bonusService = scanner.nextLine();
        BonusService servicesBonusFree = null;
        while (!validBonusService(bonusService)){
            System.out.println("Chi co 3 dich vu di kem: Karaoke/Massage/Tour");
            bonusService = scanner.nextLine();
        }
        Room room = new Room(code, nameService, Double.parseDouble(area), Double.parseDouble(pay),
                Integer.parseInt(quantity), typeRent, new BonusService(bonusService));
        String line = code + COMMA + nameService + COMMA + area + COMMA + pay + COMMA + quantity +
                COMMA + typeRent + COMMA + new BonusService(bonusService);
        FileUtils.writeFile(FILE_ROOM, line);
        roomList.add(room);
        System.out.println("Them dich vu thanh cong");
        System.out.println("---------------------------------------------------");
    }

    /*---------------------------------------------------------------------*/

    public static void showServices(){
        System.out.println("1. Hien thi tat ca Villa \n" +
                            "2. Hien thi tat ca House \n" +
                            "3. Hien thi tat ca Room \n" +
                            "4. Hien thi tat ca Villa khong trung lap \n" +
                            "5. Hien thi tat ca House khong trung lap \n" +
                            "6. Hien thi tat ca Room khong trung lap \n" +
                            "7. Quay lai menu \n" +
                            "8 . Exit");
        int input = scanner.nextInt();
        switch (input){
            case 1:
                showVilla();
                break;
            case 2:
                showHouse();
                break;
            case 3:
                showRoom();
                break;
            case 4:
                showVillaNotDup();
                break;
            case 5:
                showHouseNotDup();
                break;
            case 6:
                showRoomNotDup();
                break;
            case 7:
                break;
            case 8:
                System.exit(8);
        }
    }
    public static void showVilla(){
        int i = 1;
        for (Villa list: villaList){
            System.out.println(i++ + ". " + list.showInfo());
            System.out.println("---------------------------------------------------");
        }
    }
    public static void showHouse(){
        int i = 1;
        for (House x: houseList){
            System.out.println(i++ + ". " + x.showInfo());
            System.out.println("---------------------------------------------------");
        }
    }
    public static void showRoom(){
        int i = 1;
        for (Room list: roomList){
            System.out.println(i++ + ". " + list.showInfo());
            System.out.println("---------------------------------------------------");
        }
    }
    public static void showVillaNotDup(){
        TreeSet<Villa> villaTree = new TreeSet<>();
        for (Villa list: villaList){
            villaTree.add(list);
        }
        for (Villa list: villaTree){
            System.out.println(list);
        }
        System.out.println("----------------------------------------------------");
    }
    public static void showHouseNotDup(){
        TreeSet<House> houseTree = new TreeSet<>();
        for (House list: houseList){
            houseTree.add(list);
        }
        for (House list: houseTree){
            System.out.println(list);
        }
        System.out.println("----------------------------------------------------");
    }
    public static void showRoomNotDup(){
        TreeSet<Room> roomTree = new TreeSet<>();
        for (Room list: roomList){
            roomTree.add(list);
        }
        for (Room list: roomTree){
            System.out.println(list);
        }
        System.out.println("----------------------------------------------------");
    }
    private static void readFileVilla() {
        List<String> listLine = FileUtils.readFile(FILE_VILLA);
        for (String line : listLine) {
            String[] split = line.split(",");
            if (split.length != 1) {
                Villa villa = new Villa(split[0], split[1], Double.parseDouble(split[2]), Double.parseDouble(split[3]), Integer.parseInt(split[4]),
                        split[5], split[6], split[7], Double.parseDouble(split[8]), Integer.parseInt(split[9]));
                villaList.add(villa);
            }
        }
    }
    private static void readFileHouse() {
        List<String> listLine = FileUtils.readFile(FILE_HOUSE);
        for (String line : listLine) {
            String[] split = line.split(",");
            if (split.length != 1) {
                House house = new House(split[0], split[1], Double.parseDouble(split[2]), Double.parseDouble(split[3]), Integer.parseInt(split[4]),
                        split[5], split[6], split[7], Integer.parseInt(split[8]));
                houseList.add(house);
            }
        }
    }
    private static void readFileRoom() {
        List<String> listLine = FileUtils.readFile(FILE_ROOM);
        for (String line : listLine) {
            String[] split = line.split(",");
            if (split.length != 1) {
                Room room = new Room(split[0], split[1], Double.parseDouble(split[2]), Double.parseDouble(split[3]), Integer.parseInt(split[4]),
                        split[5], new BonusService(split[6]));
                roomList.add(room);
            }
        }
    }


    public static void main(String[] args) {
        readFileVilla();
        readFileHouse();
        readFileRoom();
        readFileCustomer();
        displayMainMenu();
    }
}

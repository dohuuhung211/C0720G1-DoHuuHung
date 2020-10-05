package case_study_02.controllers;

import case_study_02.commons.FileUtils;
import case_study_02.models.House;
import case_study_02.models.Room;
import case_study_02.models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
                            "6. Them thong tin nhan vien \n" +
                            "7. Exit");
        int input = scanner.nextInt();
        scanner.nextLine();
        switch (input){
            case 1:
                addService();
                displayMainMenu();
                break;
            case 2:
                showServices();
                displayMainMenu();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                System.exit(7);
        }
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
                displayMainMenu();
                break;
            case 2:
                addServiceHouse();
                displayMainMenu();
                break;
            case 3:
                addServiceRoom();
                displayMainMenu();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                System.exit(5);
                break;
            default:
                System.out.println("Vui long chon lai menu");
                displayMainMenu();
        }
    }
    public static void addServiceVilla(){
        System.out.println("Ma dich vu");
        String code = scanner.nextLine();
        System.out.println("Ten dich vu");
        String nameService = scanner.nextLine();
        System.out.println("Dien tich");
        String area = scanner.nextLine();
        System.out.println("Chi phi thue");
        String pay = scanner.nextLine();
        System.out.println("So luong khach");
        String quantity = scanner.nextLine();
        System.out.println("Kieu thue");
        String typeRent = scanner.nextLine();
        System.out.println("Tieu chuan phong");
        String standardRoom = scanner.nextLine();
        System.out.println("Mo ta dich vu");
        String ortherFacilities = scanner.nextLine();
        System.out.println("Dien tich ho boi");
        String areaPool = scanner.nextLine();
        System.out.println("So Tang");
        String amountFloor = scanner.nextLine();
//        Villa villa = new Villa(code, nameService, Double.parseDouble(area), Double.parseDouble(pay),
//                Integer.parseInt(quantity), typeRent, standardRoom, ortherFacilities,
//                Double.parseDouble(areaPool), Integer.parseInt(amountFloor));
        String line = code + COMMA + nameService + COMMA + area + COMMA + pay + COMMA + quantity +
                COMMA + typeRent + COMMA + standardRoom + COMMA + ortherFacilities + COMMA + areaPool + COMMA + amountFloor;
        FileUtils.writeFile(FILE_VILLA, line);
        System.out.println("Them dich vu thanh cong");
        System.out.println("---------------------------------------------------");
    }
    public static void addServiceHouse(){
        System.out.println("Ma dich vu");
        String code = scanner.nextLine();
        System.out.println("Ten dich vu");
        String nameService = scanner.nextLine();
        System.out.println("Dien tich");
        String area = scanner.nextLine();
        System.out.println("Chi phi thue");
        String pay = scanner.nextLine();
        System.out.println("So luong khach");
        String quantity = scanner.nextLine();
        System.out.println("Kieu thue");
        String typeRent = scanner.nextLine();
        System.out.println("Tieu chuan phong");
        String standardRoom = scanner.nextLine();
        System.out.println("Mo ta dich vu");
        String ortherFacilities = scanner.nextLine();
        System.out.println("So Tang");
        String amountFloor = scanner.nextLine();
//        House house = new House(code, nameService, Double.parseDouble(area), Double.parseDouble(pay),
//                Integer.parseInt(quantity), typeRent, standardRoom, ortherFacilities, Integer.parseInt(amountFloor));
        String line = code + COMMA + nameService + COMMA + area + COMMA + pay + COMMA + quantity +
                COMMA + typeRent + COMMA + standardRoom + COMMA + ortherFacilities + COMMA + amountFloor;
        FileUtils.writeFile(FILE_HOUSE, line);
        System.out.println("Them dich vu thanh cong");
        System.out.println("---------------------------------------------------");
    }
    public static void addServiceRoom(){
        System.out.println("Ma dich vu");
        String code = scanner.nextLine();
        System.out.println("Ten dich vu");
        String nameService = scanner.nextLine();
        System.out.println("Dien tich");
        String area = scanner.nextLine();
        System.out.println("Chi phi thue");
        String pay = scanner.nextLine();
        System.out.println("So luong khach");
        String quantity = scanner.nextLine();
        System.out.println("Kieu thue");
        String typeRent = scanner.nextLine();
        System.out.println("Dich vu mien phi kem theo");
        String servicesBonusFree = scanner.nextLine();
//        Room room = new Room(code, nameService, Double.parseDouble(area), Double.parseDouble(pay),
//                Integer.parseInt(quantity), typeRent, servicesBonusFree);
        String line = code + COMMA + nameService + COMMA + area + COMMA + pay + COMMA + quantity +
                COMMA + typeRent + COMMA + servicesBonusFree;
        FileUtils.writeFile(FILE_ROOM, line);
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
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                displayMainMenu();
                break;
            case 8:
                System.exit(8);
        }
    }
    public static void showVilla(){
        for (Villa x: villaList){
            System.out.println(x.showInfo());
        }
        System.out.println("---------------------------------------------------");
//        System.out.println("Thong tin khach hang thue dich vu Villa");
//        List<String> stringList = FileUtils.readFile(FILE_VILLA);
//        System.out.println("---------------------------------------------------");
    }
    public static void showHouse(){
        for (House x: houseList){
            System.out.println(x.showInfo());
        }
        System.out.println("---------------------------------------------------");
//        System.out.println("Thong tin khach hang thue dich vu House");
//        List<String> stringList = FileUtils.readFile(FILE_HOUSE);
//        System.out.println("---------------------------------------------------");
    }
    public static void showRoom(){
        for (Room x: roomList){
            System.out.println(x.showInfo());
        }
        System.out.println("---------------------------------------------------");
//        System.out.println("Thong tin khach hang thue dich vu Room");
//        List<String> stringList = FileUtils.readFile(FILE_ROOM);
//        System.out.println("---------------------------------------------------");
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
//    String code, String nameService, double area, double pay,
//    int quantity, String typeRent, String servicesBonusFree
    private static void readFileRoom() {
        List<String> listLine = FileUtils.readFile(FILE_ROOM);
        for (String line : listLine) {
            String[] split = line.split(",");
            if (split.length != 1) {
                Room room = new Room(split[0], split[1], Double.parseDouble(split[2]), Double.parseDouble(split[3]), Integer.parseInt(split[4]),
                        split[5], split[6]);
                roomList.add(room);
            }
        }
    }
    public static void main(String[] args) {
        readFileVilla();
        readFileHouse();
        readFileRoom();
        displayMainMenu();
    }
}

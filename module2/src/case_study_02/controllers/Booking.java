package case_study_02.controllers;

import case_study_02.commons.FileUtils;
import case_study_02.models.Customer;

import java.util.Scanner;
import java.util.concurrent.ConcurrentMap;

import static case_study_02.controllers.AddCustomer.listCustomer;
import static case_study_02.controllers.AddCustomer.showInforCustomer;
import static case_study_02.controllers.MainController.*;

public class Booking {
    static final String FILE_BOOKING = "G:\\C0720G1_Do_Huu_Hung\\module2\\src\\case_study_02\\data\\Booking.csv";
    static Scanner scanner = new Scanner(System.in);
    public static void addNewBook(){
        showInforCustomer();
        System.out.println("Chon khach hang muon dat lich");
        String chooseCustomer = scanner.nextLine();
        System.out.println("Chon dich vu muon dat");
        System.out.println("1. Booking Villa \n" +
                            "2. Booking House \n" +
                            "3. Booking Room \n" +
                            "4. Quay lai menu");
        int chooseService = scanner.nextInt();
        scanner.nextLine();
        switch (chooseService){
            case 1:
                showVilla();
                System.out.println("Chon loai villa muon dat");
                String chooseVilla = scanner.nextLine();
                listCustomer.get(Integer.parseInt(chooseCustomer) - 1).setUseService(villaList.get(Integer.parseInt(chooseVilla) - 1));
                addInforToFile(Integer.parseInt(chooseCustomer));
                System.out.println("Dat lich thanh cong");
                displayMainMenu();
                break;
            case 2:
                showRoom();
                displayMainMenu();
                break;
            case 3:
                showRoom();
                System.out.println("Chon loai Room muon dat");
                String chooseRoom = scanner.nextLine();
                listCustomer.get(Integer.parseInt(chooseCustomer) - 1).setUseService(roomList.get(Integer.parseInt(chooseRoom) - 1));
                addInforToFile(Integer.parseInt(chooseCustomer));
                System.out.println("Dat lich thanh cong");
                displayMainMenu();
                break;
            case 4:
                displayMainMenu();
                break;
            default:
                System.out.println("Moi chon lai menu");
                addNewBook();
        }
    }
    public static void addInforToFile(int chooseCustomer){
        String line = listCustomer.get(chooseCustomer - 1).getNameCustomer() + COMMA + listCustomer.get(chooseCustomer - 1).getDayOfBirth() +
                COMMA + listCustomer.get(chooseCustomer - 1).getGender() + COMMA + listCustomer.get(chooseCustomer - 1).getIdCard() +
                COMMA + listCustomer.get(chooseCustomer - 1).getPhoneNumber() + COMMA + listCustomer.get(chooseCustomer - 1).getEmail() +
                COMMA + listCustomer.get(chooseCustomer - 1).getTypeCustomer() + COMMA + listCustomer.get(chooseCustomer - 1).getAddress() +
                COMMA + listCustomer.get(chooseCustomer - 1).getUseService().showInfo();
        FileUtils.writeFile(FILE_BOOKING,line);
    }
}

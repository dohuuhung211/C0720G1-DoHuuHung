package case_study_02.controllers;

import case_study_02.models.Customer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import static case_study_02.controllers.AddCustomer.listCustomer;
import static case_study_02.controllers.AddCustomer.showInforCustomer;
import static case_study_02.controllers.MainController.displayMainMenu;

public class BookCinema {
    static Scanner scanner = new Scanner(System.in);
    static Queue<Customer> queue = new LinkedList<>();
    public static void addTicket(){
        System.out.println("1. Dat ve \n" +
                            "2. Hien thi danh sach khach hang dat ve \n" +
                            "3. Quay lai menu \n" +
                            "4. Exit.");
        int input = scanner.nextInt();
        switch (input){
            case 1:
                bookTicket();
                break;
            case 2:
                showTicketBooked();
                break;
            case 3:
                break;
            case 4:
                System.exit(4);
                break;
            default:
                System.err.println("Vui long nhap dung so thu tu");
        }
    }
    public static void bookTicket(){
        showInforCustomer();
        System.out.println("Chon khach hang muon dat ve");
        int chooseCustomer = scanner.nextInt();
        queue.add(listCustomer.get(chooseCustomer - 1));
        System.out.println("Dat ve thanh cong");
    }

    public static void showTicketBooked(){
        System.out.println("Khach hang da dat ve:");
        if (queue.isEmpty()){
            System.out.println("Danh sach trong");
        } else {
            for (int i = 0; i < queue.size(); i++){
                System.out.println(queue.peek());
            }
        }
        System.out.println("------------------------------------------------");
    }
}

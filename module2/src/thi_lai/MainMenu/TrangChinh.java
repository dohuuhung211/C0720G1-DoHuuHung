package thi_lai.MainMenu;

import thi_lai.models.XoaSanPham;

import java.util.Scanner;

import static case_study_02.controllers.AddCustomer.addNewCustomer;
import static case_study_02.controllers.AddCustomer.showInforCustomer;
import static case_study_02.controllers.Booking.addNewBook;
import static case_study_02.controllers.Employee.showAllEmployee;

public class TrangChinh {
    public static final String FILE_SP = "G:\\C0720G1_Do_Huu_Hung\\module2\\src\\case_study_02\\data\\Villa.csv";
    public static Scanner scanner = new Scanner(System.in);
    public static void MenuChinh() {
        int input;
        System.out.println("Moi chon menu");
        do {
            System.out.println("1. Them moi san pham\n" +
                    "2. Xoa san pham \n" +
                    "3. Xem danh sach cac san pham \n" +
                    "4. Tim Kiem \n" +
                    "5. Thoat");
            input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1:
                    ThemSanPham.themSanPham();
                    break;
                case 2:
                    XoaSanPham.xoaSanPham();
                    break;
                case 3:
                    HienThiSanPham.hienThiSanPham();
                    break;
                case 4:
                    TimKiemSanPham.timKiemSanPham();
                    break;
                case 5:
                    break;
                case 6:

                    break;
            }
        }while (input > 0 && input < 5);
    }

    public static void main(String[] args) {
        MenuChinh();
    }
}

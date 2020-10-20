package thi_lai.MainMenu;

import thi_lai.models.SanPhamNhapKhau;
import thi_lai.models.SanPhamXuatKhau;
import thi_module_2.Student;

import static thi_lai.MainMenu.TrangChinh.scanner;

public class TimKiemSanPham {

    public static void timKiemSanPham(){
        HienThiSanPham.hienThiSanPhamXK();
        System.out.println("1. Tim kiem san pham nhap khau \n" +
                "2.Tim kiem san pham xuat khau \n" +
                "3. Quay lai menu");
        int input = scanner.nextInt();
        scanner.nextLine();
        switch (input){
            case 1:
                timKiemSPNhapKhau();
                break;
            case 2:
                timKiemSPXuatKhau();
                break;
            default:
                System.out.println("Nhap lai menu");
        }
    }
    public static void timKiemSPNhapKhau(){
        HienThiSanPham.hienThiSanPhamNK();
        boolean flag = false;
        while (!flag){
            System.out.println("Nhap ten san pham nhap khau");
            String ten = scanner.nextLine();
            for (SanPhamNhapKhau sp: ThemSanPham.sanPhamNhapKhauList){
                if (sp.getTenSanPham().contains(ten)){
                    System.out.println(sp);
                    flag = true;
                }
            }
            if (!flag){
                System.out.println("Ten san pham khong ton tai");
                flag = false;
            }
        }
    }
    public static void timKiemSPXuatKhau(){
        boolean flag = false;
        while (!flag){
            System.out.println("Nhap ten san pham xuat khau");
            String ten = scanner.nextLine();
            for (SanPhamXuatKhau sp: ThemSanPham.sanPhamXuatKhausList){
                if (sp.getTenSanPham().contains(ten)){
                    System.out.println(sp);
                    flag = true;
                }
            }
            if (!flag){
                System.out.println("Ten san pham khong ton tai");
                flag = false;
            }
        }
    }
}

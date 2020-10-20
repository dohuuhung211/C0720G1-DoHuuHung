package thi_lai.MainMenu;

import thi_lai.models.SanPhamNhapKhau;
import thi_lai.models.SanPhamXuatKhau;
import thi_thu.FileUtils;

import java.util.ArrayList;

import static thi_lai.MainMenu.ThemSanPham.*;

public class HienThiSanPham {
    public static void hienThiSanPham(){
        System.out.println("1. Hien thi san pham nhap khau \n" +
                            "2. Hien thi san pham xuat khau \n" +
                            "3. Quay lai menu");
        int input = scanner.nextInt();
        scanner.nextLine();
        switch (input){
            case 1:
                hienThiSanPhamNK();
                break;
            case 2:
                hienThiSanPhamXK();
                break;
            default:
                System.out.println("Nhap lai menu");
        }
    }
    public static void docFileSanPhamNK(){
        sanPhamNhapKhauList = new ArrayList<>();
        danhSachNK_CSV = FileUtils.readFile(ThemSanPham.FILE_SANPHAMNK);
        for (String line: danhSachNK_CSV){
            String[] split = line.split(",");
            if (split.length != 1){
                SanPhamNhapKhau sanPhamNhapKhau = new SanPhamNhapKhau(Integer.parseInt(split[0]),Integer.parseInt(split[1]),
                        split[2],Double.parseDouble(split[3]), split[4],split[5],Double.parseDouble(split[6]),split[7],Integer.parseInt(split[8]));
                sanPhamNhapKhauList.add(sanPhamNhapKhau);
            }
        }
    }
    public static void docFileSanPhamXK(){
        ThemSanPham.sanPhamXuatKhausList = new ArrayList<>();
        danhSachXK_CSV = FileUtils.readFile(ThemSanPham.FILE_SANPHAMXK);
        for (String line: danhSachXK_CSV){
            String[] split = line.split(",");
            if (split.length != 1){
                SanPhamXuatKhau sanPhamXuatKhau = new SanPhamXuatKhau(Integer.parseInt(split[0]),Integer.parseInt(split[1]),
                        split[2],Double.parseDouble(split[3]), split[4],split[5],Double.parseDouble(split[6]),split[7]);
                sanPhamXuatKhausList.add(sanPhamXuatKhau);
            }
        }
    }
    public static void hienThiSanPhamNK(){
        docFileSanPhamNK();
        System.out.println("Danh sach san pham");
        int i = 1;
        for (SanPhamNhapKhau list: sanPhamNhapKhauList){
            System.out.println(i++ + ". " + list.toString());
        }
        System.out.println("--------------------------------------------------");
    }
    public static void hienThiSanPhamXK(){
        docFileSanPhamXK();
        System.out.println("Danh sach san pham");
        int i = 1;
        for (SanPhamXuatKhau list: sanPhamXuatKhausList){
            System.out.println(i++ + ". " + list.toString());
        }
        System.out.println("--------------------------------------------------");
    }
}

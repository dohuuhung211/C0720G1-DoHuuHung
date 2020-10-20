package thi_lai.models;

import thi_lai.MainMenu.ThemSanPham;
import thi_lai.NotFoundProductException;
import thi_module_2.FileUtils;
import thi_module_2.NotFoundStudentException;
import thi_module_2.Student;

import java.util.ArrayList;
import java.util.Scanner;

import static thi_lai.MainMenu.HienThiSanPham.*;
import static thi_lai.MainMenu.ThemSanPham.*;

public class XoaSanPham {
    static Scanner scanner = new Scanner(System.in);
    public static void xoaSanPham(){
        System.out.println("1. Xoa san pham nhap khau \n" +
                            "2. Xoa san pham xuat khau \n" +
                            "3. Quay lai menu");
        int input = scanner.nextInt();
        scanner.nextLine();
        switch (input){
            case 1:
                xoaSanPhamNK();
                break;
            case 2:
                xoaSanPhamXK();
                break;
            default:
                System.out.println("Nhap lai menu");
        }
    }
    public static void xoaSanPhamNK() {
        docFileSanPhamNK();
        boolean flag;
        Scanner scanner = new Scanner(System.in);
        int maSanPham = 0;
        do {
            flag = true;
            try {
                System.out.print("Nhap ma san pham: ");
                maSanPham = scanner.nextInt();
                scanner.nextLine();
                kiemTraMaNK(maSanPham);
            } catch (NotFoundProductException e) {
                e.printStackTrace();
                flag = false;
            }

        } while (!flag);

        for (int i = 0; i < sanPhamNhapKhauList.size(); i++) {
            if (sanPhamNhapKhauList.get(i).getMaSanPham() == maSanPham) {
                System.out.println("Yes hoac Khong");
                if (scanner.nextLine().equals("Yes")) {
                    sanPhamNhapKhauList.remove(i);
                    i--;
                } else {
                    return;
                }
            }
        }
        ThemSanPham.danhSachNK_CSV = new ArrayList<>();
//        int id, int maSanPham, String tenSanPham, double giaBan, String soLuong, String nhaSanXuat,
//                           double giaNhapKhau, String tinhThanhNhap, int thueNhapKhau
        for (SanPhamNhapKhau sp : sanPhamNhapKhauList) {
            String line = sp.getId() + COMMA + sp.getMaSanPham() + COMMA + sp.getTenSanPham() + COMMA +
                    sp.getGiaBan() + COMMA + sp.getSoLuong() + COMMA + sp.getNhaSanXuat() + COMMA + sp.getGiaNhapKhau() +
                    COMMA + sp.getTinhThanhNhap() + COMMA + sp.getThueNhapKhau();
            danhSachNK_CSV.add(line);
        }

        FileUtils.writeInFile(FILE_SANPHAMNK, danhSachNK_CSV);
        hienThiSanPhamNK();
    }

    public static void xoaSanPhamXK() {
        docFileSanPhamXK();
        boolean flag;
        Scanner scanner = new Scanner(System.in);
        int maSanPham = 0;
        do {
            flag = true;
            try {
                System.out.print("Nhap ma san pham: ");
                maSanPham = scanner.nextInt();
                scanner.nextLine();
                kiemTraMaXK(maSanPham);
            } catch (NotFoundProductException e) {
                e.printStackTrace();
                flag = false;
            }
        } while (!flag);

        for (int i = 0; i < sanPhamXuatKhausList.size(); i++) {
            if (sanPhamXuatKhausList.get(i).getMaSanPham() == maSanPham) {
                System.out.println("Yes hoac Khong");
                if (scanner.nextLine().equals("Yes")) {
                    sanPhamXuatKhausList.remove(i);
                    i--;
                } else {
                    return;
                }
            }
        }
        danhSachXK_CSV = new ArrayList<>();
//       int id, int maSanPham, String tenSanPham, double giaBan, String soLuong, String nhaSanXuat,
//                           double giaXuatKhau, String quocGiaNhapSP
        for (SanPhamXuatKhau sp : sanPhamXuatKhausList) {
            String line = sp.getId() + COMMA + sp.getMaSanPham() + COMMA + sp.getTenSanPham() + COMMA +
                    sp.getGiaBan() + COMMA + sp.getSoLuong() + COMMA +
                    sp.getNhaSanXuat() + COMMA + sp.getGiaXuatKhau() + COMMA + sp.getQuocGiaNhapSP();
            danhSachXK_CSV.add(line);
        }

        FileUtils.writeInFile(FILE_SANPHAMXK, danhSachXK_CSV);
        hienThiSanPhamXK();
    }

    public static void kiemTraMaNK(int maSanPham) throws NotFoundProductException {
        docFileSanPhamNK();
        boolean flag = false;
        for (SanPhamNhapKhau sp : sanPhamNhapKhauList) {
            if (sp.getMaSanPham() == maSanPham) {
                flag = true;
                break;
            }
        }
    }
    public static void kiemTraMaXK(int maSanPham) throws NotFoundProductException {
        docFileSanPhamXK();
        boolean flag = false;
        for (SanPhamXuatKhau sp : sanPhamXuatKhausList) {
            if (sp.getMaSanPham() == maSanPham) {
                flag = true;
                break;
            }
        }
    }
}

package thi_lai.MainMenu;

import thi_lai.models.SanPhamNhapKhau;
import thi_lai.models.SanPhamXuatKhau;
import thi_lai.validate.Validate;
import thi_module_2.FileUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static thi_module_2.Validate.validNameStudent;

public class ThemSanPham {
    public static final String FILE_SANPHAMNK = "G:\\C0720G1_Do_Huu_Hung\\module2\\src\\thi_lai\\data\\SPnhapkhau.csv";
    public static final String FILE_SANPHAMXK = "G:\\C0720G1_Do_Huu_Hung\\module2\\src\\thi_lai\\data\\SPxuatkhau.csv";
    static Scanner scanner = new Scanner(System.in);
    public static final String COMMA = ",";
    public static List<String> danhSachNK_CSV = new ArrayList<>();
    public static List<String> danhSachXK_CSV = new ArrayList<>();
    public static List<SanPhamNhapKhau> sanPhamNhapKhauList = new ArrayList<>();
    public static List<SanPhamXuatKhau> sanPhamXuatKhausList = new ArrayList<>();
    public static void themSanPham(){
        System.out.println("Moi nhap san pham muon them");
        System.out.println("1. Them san pham nhap khau \n" +
                            "2. Them san pham xuat khau \n" +
                            "3. Thoat");
        int input = scanner.nextInt();
        scanner.nextLine();
        switch (input){
            case 1:
                themSPNhapKhau();
                break;
            case 2:
                themSPXuatKhau();
                break;
            case 3:
                System.exit(3);
            default:
                System.out.println("Vui long chon lai menu");
        }
    }
    public static void themSPNhapKhau(){
        int id = 0;
        id = (sanPhamNhapKhauList.size() == 0) ? 1 : id + (sanPhamNhapKhauList.get(sanPhamNhapKhauList.size() - 1).getId() + 1);
        System.out.println("Ma san pham");
        String maSanPham = scanner.nextLine();
        while (!Validate.validNumber(maSanPham)){
            System.err.println("ma ko dung");
            maSanPham = scanner.nextLine();
        }
        System.out.println("Ten san pham");
        String tenSanPham = scanner.nextLine();
        System.out.println("Gia ban");
        String giaBan = scanner.nextLine();
        while (!Validate.validNumber(giaBan)){
            System.err.println("ma ko dung");
            giaBan = scanner.nextLine();
        }
        System.out.println("So luong");
        String soLuong = scanner.nextLine();
        System.out.println("Nha san xuat");
        String nhaSanXuat = scanner.nextLine();
        System.out.println("Gia nhap khau");
        String giaNhapKhau = scanner.nextLine();
        System.out.println("Tinh thanh nhap khau");
        while (!Validate.validNumber(giaNhapKhau)){
            System.err.println("ma ko dung");
            giaNhapKhau = scanner.nextLine();
        }
        String tinhThanhNhap = scanner.nextLine();
        System.out.println("Thue nhap khau");
        String thueNhapKhau = scanner.nextLine();
        String line = id + COMMA + maSanPham + COMMA + tenSanPham + COMMA + giaBan + COMMA + soLuong + COMMA + nhaSanXuat +
                COMMA + giaNhapKhau + COMMA + tinhThanhNhap + COMMA + thueNhapKhau;
        FileUtils.writeFile(FILE_SANPHAMNK, line);
        SanPhamNhapKhau sanPhamNhapKhau = new SanPhamNhapKhau(id,Integer.parseInt(maSanPham),tenSanPham,
                Double.parseDouble(giaBan),soLuong,nhaSanXuat,Double.parseDouble(giaNhapKhau),tinhThanhNhap,
                Integer.parseInt(thueNhapKhau));
        sanPhamNhapKhauList.add(sanPhamNhapKhau);
        System.out.println("Them moi thanh cong");
        System.out.println("-----------------------------------------");
    }
    public static void themSPXuatKhau(){
        int id = 0;
        id = (sanPhamXuatKhausList.size() == 0) ? 1 : id + (sanPhamXuatKhausList.get(sanPhamXuatKhausList.size() - 1).getId() + 1);
        System.out.println("Ma san pham");
        String maSanPham = scanner.nextLine();
        while (!Validate.validNumber(maSanPham)){
            System.err.println("ma ko dung");
            maSanPham = scanner.nextLine();
        }
        System.out.println("Ten san pham");
        String tenSanPham = scanner.nextLine();
        System.out.println("Gia ban");
        String giaBan = scanner.nextLine();
        while (!Validate.validNumber(giaBan)){
            System.err.println("ma ko dung");
            giaBan = scanner.nextLine();
        }
        System.out.println("So luong");
        String soLuong = scanner.nextLine();
        System.out.println("Nha san xuat");
        String nhaSanXuat = scanner.nextLine();
        System.out.println("Gia nhap khau");
        String giaXuatKhau = scanner.nextLine();
        while (!Validate.validNumber(giaXuatKhau)){
            System.err.println("ma ko dung");
            giaXuatKhau = scanner.nextLine();
        }
        System.out.println("Quoc gia nhap san pham");
        String quocGiaNhapSP = scanner.nextLine();
        String line = id + COMMA + maSanPham + COMMA + tenSanPham + COMMA + giaBan + COMMA + soLuong + COMMA + nhaSanXuat +
                COMMA + giaXuatKhau + COMMA + quocGiaNhapSP;
        FileUtils.writeFile(FILE_SANPHAMXK, line);
        SanPhamXuatKhau sanPhamXuatKhau = new SanPhamXuatKhau(id,Integer.parseInt(maSanPham),tenSanPham,
                Double.parseDouble(giaBan),soLuong,nhaSanXuat,Double.parseDouble(giaXuatKhau),quocGiaNhapSP);
        sanPhamXuatKhausList.add(sanPhamXuatKhau);
        System.out.println("Them moi thanh cong");
        System.out.println("-----------------------------------------");
    }
}

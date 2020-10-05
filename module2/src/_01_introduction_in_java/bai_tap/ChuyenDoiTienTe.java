package _01_introduction_in_java.bai_tap;
import java.util.Scanner;
public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap usd");
        usd = scanner.nextDouble();
        double change = usd * vnd;
        System.out.println(usd + "$ = " + change + "vnd" );
    }
}

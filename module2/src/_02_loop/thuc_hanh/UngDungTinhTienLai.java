package _02_loop.thuc_hanh;
import java.util.Scanner;
public class UngDungTinhTienLai {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien gui");
        money = scanner.nextDouble();
        System.out.println("Thang gui");
        month = scanner.nextInt();
        System.out.println("Ti le lai suat");
        interestRate = scanner.nextDouble();
        double totalInterest  = 0;
        for (int i = 0; i < month; i++){
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println(totalInterest);
    }
}

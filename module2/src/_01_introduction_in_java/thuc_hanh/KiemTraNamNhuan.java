package _01_introduction_in_java.thuc_hanh;
import java.util.Scanner;
public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap nam");
        int year = scanner.nextInt();
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0) {
                    System.out.println(year + " la nam nhuan");
                } else {
                    System.out.println(year + " ko phai la nam nhuan");
                }
            } else {
                System.out.println(year + " la nam nhuan");
            }
        } else {
            System.out.println(year + " ko phai la nam nhuan");
        }
    }
}

package _01_introduction_in_java.thuc_hanh;
import java.util.Scanner;
public class TinhChiSoCanNangCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap can nang");
        float weight = scanner.nextFloat();
        System.out.println("Nhap chieu cao");
        float height = scanner.nextFloat();
        float bmi = (float) (weight / Math.pow(height,2));
        if (bmi >= 30){
            System.out.println("Beo phi");
        } else if (bmi >= 25){
            System.out.println("Thua can");
        } else if (bmi >= 18.5){
            System.out.println("Can doi");
        } else {
            System.out.println("Thieu can");
        }
    }
}

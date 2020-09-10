package vong_lap_trong_java_02.thuc_hanh;
import java.util.Scanner;
public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so");
        int numb = scanner.nextInt();
        if (numb < 2){
            System.out.println(numb + "ko phai la so nguyen to");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(numb)){
                if (numb % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(numb + " la so nguyen to");
            }else {
                System.out.println(numb + " ko phai la so nguyen to");
            }
        }
    }
}

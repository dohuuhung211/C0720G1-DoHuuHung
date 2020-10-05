package _02_loop.thuc_hanh;
import java.util.Scanner;
public class TinhUCLN {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a");
        a = scanner.nextInt();
        System.out.println("Nhap so b");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        while (a != b){
            if (a > b){
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("Uoc chung lon nhat cua a va b: " + a);
    }
}

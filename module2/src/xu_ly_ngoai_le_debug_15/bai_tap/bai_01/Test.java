package xu_ly_ngoai_le_debug_15.bai_tap.bai_01;

import test_ngoai_le.tam_giac.IllegalTriangleException;
import test_ngoai_le.tam_giac.Triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println("Nhap so a");
                int a = scanner.nextInt();
                if (a < 0){
                    System.err.println("So phai lon hon 0");
                    break;
                }
                System.out.println("Nhap so b");
                int b = scanner.nextInt();
                if (a < 0){
                    System.err.println("So phai lon hon 0");
                    break;
                }
                System.out.println("Nhap so c");
                int c = scanner.nextInt();
                if (a < 0){
                    System.err.println("So phai lon hon 0");
                    break;
                }
                test_ngoai_le.tam_giac.Triangle triangle = new Triangle(a,b,c);
                triangle.inputNumber();
            } catch (InputMismatchException e){
                System.err.println("Ban nhap chu mat roi");
                scanner.nextLine();
            } catch (IllegalTriangleException e){
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
        }
    }
}

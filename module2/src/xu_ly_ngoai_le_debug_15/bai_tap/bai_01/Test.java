package xu_ly_ngoai_le_debug_15.bai_tap.bai_01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Nhap canh a");
            int a = scanner.nextInt();
            if (a < 0){
                throw new IllegalTriangleException("So phai lon hon 0");
            }
            System.out.println("Nhap canh b");
            int b = scanner.nextInt();
            if (b < 0){
                throw new IllegalTriangleException("So phai lon hon 0");
            }
            System.out.println("Nhap canh c");
            int c = scanner.nextInt();
            if (c < 0){
                throw new IllegalTriangleException("So phai lon hon 0");
            }
            Triangle triangle = new Triangle(a,b,c);
            triangle.inputNumber();
        } catch (InputMismatchException e){
            System.out.println("Phai nhap so");
        } catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
    }
}

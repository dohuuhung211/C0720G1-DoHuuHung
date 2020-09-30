package xu_ly_ngoai_le_debug_15.bai_tap.bai_01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh a");
        int a = scanner.nextInt();
        System.out.println("Nhap canh b");
        int b = scanner.nextInt();
        System.out.println("Nhap canh c");
        int c = scanner.nextInt();
        Triangle triangle = new Triangle(a,b,c);
        triangle.inputNumber();
    }


}

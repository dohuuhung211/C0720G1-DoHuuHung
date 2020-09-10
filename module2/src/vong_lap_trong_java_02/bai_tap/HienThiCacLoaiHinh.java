package vong_lap_trong_java_02.bai_tap;
import javax.crypto.spec.PSource;
import java.util.Scanner;
public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle" +
                " (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        while (true){
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    for (int i = 0; i < 3; i++){
                        for (int j = 0; j < 7; j++){
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    for( int i = 1; i <= 6; i++){
                        for (int j = 1; j < i; j++){
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    for(int i = 6; i > 1; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    System.out.println("No choice");
                    System.exit(4);
            }
        }

    }
}

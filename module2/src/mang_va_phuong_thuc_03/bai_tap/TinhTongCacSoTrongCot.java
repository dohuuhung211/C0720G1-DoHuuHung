package mang_va_phuong_thuc_03.bai_tap;
import java.util.Arrays;
import java.util.Scanner;
public class TinhTongCacSoTrongCot {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[][] array = {
//                {1,2,3},
//                {4,5,6}
//        };
//
//        System.out.println("Nhap cot muon tinh");
//        System.out.println("1. Tinh cot 1");
//        System.out.println("2. Tinh cot 2");
//        System.out.println("3. Tinh cot 3");
//        System.out.println("4. Thoat");
//        while (true) {
//            int sum = 0;
//            int choose = scanner.nextInt();
//            switch (choose) {
//                case 1:
//                    sum = array[0][0] + array[1][0];
//                    break;
//                case 2:
//                    sum = array[0][1] + array[1][1];
//                    break;
//                case 3:
//                    sum = array[0][2] + array[1][2];
//                    break;
//                case 4:
//                    System.exit(4);
//            }
//            System.out.println("Tong cot la: " + sum);
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dong");
        int n = scanner.nextInt();
        System.out.println("Nhap so cot");
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.println("Nhap phan tu " + (j+1) + " trong mang " + (i+1));
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("Nhap cot muon tinh");
        int k = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i][k-1];
        }
        System.out.println(sum);
    }
}

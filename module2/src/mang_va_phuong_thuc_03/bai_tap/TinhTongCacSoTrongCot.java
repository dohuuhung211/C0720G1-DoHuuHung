package mang_va_phuong_thuc_03.bai_tap;
import java.util.Arrays;
import java.util.Scanner;
public class TinhTongCacSoTrongCot {
    public static void main(String[] args) {
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

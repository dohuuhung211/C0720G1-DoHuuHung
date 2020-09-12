package mang_va_phuong_thuc_03.bai_tap;
import java.util.Scanner;
import java.util.Arrays;
public class TimPhanTuLonNhatMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ban muon nhap bao nhieu mang ");
        int n = scanner.nextInt();
        System.out.print("So phan tu trong 1 mang ");
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print("Nhap phan tu thu " + (j+1) + " cua mang " + (i+1) + "\t");
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        int max = arr[0][0];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat trong cac mang la: " + max);
    }
}

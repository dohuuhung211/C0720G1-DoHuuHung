package _03_array_method.bai_tap;
import java.util.Scanner;
import java.util.Arrays;
public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("So phan tu trong mang: ");
        int n = scanner.nextInt();
        int[] arrNum = new int[n];
        System.out.print("Nhap tung phan tu trong mang");
        for (int i = 0; i < n; i++){
            arrNum[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arrNum));

        int min = arrNum[0];
        for (int i = 0; i < arrNum.length; i++){
            if (arrNum[i] < min){
                min = arrNum[i];
            }
        }
        System.out.println("Phan tu nho nhat trong mang la " + min);
    }
}

package _03_array_method.bai_tap;
import java.util.Arrays;
import java.util.Scanner;
public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vi tri muon chen");
        int index = scanner.nextInt();
        System.out.print("Nhap phan tu muon chen");
        int add = scanner.nextInt();
        int[] array = {10,4,6,7,8};
        int[] resultArray = new int[array.length + 1];

        if (index < 1 && index > array.length){
            System.out.println("Khong duoc chen phan tu vao mang");
        }
        for (int i = 0; i < resultArray.length - 1; i++) {
            resultArray[i] = array[i];
        }
        System.out.println("Process: " + Arrays.toString(resultArray));

        for (int i = resultArray.length - 1; i > index; i--) {
            resultArray[i] = resultArray[i - 1];
        }
        resultArray[index] = add;
        System.out.println("Result: " + Arrays.toString(resultArray));
    }
}


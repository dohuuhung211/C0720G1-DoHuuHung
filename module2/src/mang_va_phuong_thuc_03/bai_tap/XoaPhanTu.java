package mang_va_phuong_thuc_03.bai_tap;
import java.util.Scanner;
public class XoaPhanTu {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] array = {1,2,3,4,5,6,7,8,9};
//        System.out.println("Nhap phan tu");
//        int x = scanner.nextInt();
//        for (int i = 0; i < array.length; i++){
//            if (array[i] == x){
//                System.out.println("Vi tri cua phan tu la: " + (i + 1));
//                for (int j = i; j < array.length; j++){
//                    array[i] = array[i+1];
//                    break;
//                }
//            }
//        }
//        System.out.println(array.toString(array));

        int[] num = {1,2,3,4,5};
        for (int i = 0; i < num.length; i++){
            num[i] = num[i + 1];
        }
        System.out.println(num);
    }
}

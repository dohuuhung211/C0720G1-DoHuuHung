package _03_array_method.bai_tap;
import java.util.Scanner;
public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {5,4,7,8,9,3,2,1};
        System.out.println("Nhap phan tu muon xoa");
        int x = scanner.nextInt();
        for (int i = 0; i < array.length; i++){
            if (array[i] == x){
                System.out.println("Vi tri cua phan tu la: " + (i + 1));
                for (int j = i; j < array.length-1; j++){
                    array[j] = array[j+1];
                }
                array[array.length - 1] = 0;
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}

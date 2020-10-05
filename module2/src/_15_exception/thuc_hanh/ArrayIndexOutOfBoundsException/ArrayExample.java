package _15_exception.thuc_hanh.ArrayIndexOutOfBoundsException;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayExample array = new ArrayExample();
        Integer[] arr = array.createRandom();
        System.out.println("Nhap chi so phan tu muon tim");
        int x = scanner.nextInt();
        try {
            System.out.println("Phan tu co chi so " + x + " la " + arr[x]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Chi so vuot qua gioi han cua mang");

        }

    }
}

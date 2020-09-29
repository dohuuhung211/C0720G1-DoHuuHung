package test_sap_xep;

import java.util.Scanner;

public class Sort {
    //Insertion sort
    public static void  inserttionSort ( int array[]){
        int  n = array.length;
        for  (int i = 1 ; i < n; i++) {
            int temp = array[i];
            int j = i - 1 ;
            while ((j > -1) && (array[j] > temp)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int temp = arr[i];
            for (int j = i + 1; j < arr.length; j++){
                if (temp > arr[j]){
                    arr[i] = arr[j];
                    arr[j] = temp;
                    temp = arr[i];
                }
            }
        }
    }
    //insertion sort
    public static void sort1(int[] array) {

        for (int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;
            for (; j >= 0 && array[j] > temp; j--){
                array[j+1] = array[j];
            }
            array[j+1] = temp;
        }
    }
//        for (int i = 0; i < array.length; i++){
//            for (int j = 0; j < i; j++){
//                if (array[i] < array[j]){
//                    int temp = array[i];
//                    for (int k = i; k > j; k--){
//                        array[k] = array[k-1];
//                    }
//                    array[j] = temp;
//                    break;
//                }
//            }
//        }
    public static void bubbleSort(int[] array){
        boolean flag = true;
        for (int i = 1; i < array.length; i++){
            flag = false;
            for (int j = 0; j < array.length - i; j++){
                if (array[j] > array[j+1]){
                    flag = true;
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int array[] = {2, 9, 5, 4, 8, 1, 6};
        System.out.println();
        sort1(array);
        for (int o : array) {
            System.out.print(o + " ");
        }
    }
}
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap so phan tu trong mang");
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        for (int x : arr) {
//            System.out.print(x + " ");
//        }
//        inserttionSort(arr);
//        for (int x : arr) {
//            System.out.print(x + " ");
//        }
////        for (int i = 1; i < n; i++) {
////            int j = i - 1;
////            int temp = arr[i];
////            while (temp < arr[j] && j > 0) {
////                arr[j+1] = arr[j];
////                j--;
////            }
////            arr[j + 1] = temp;
////        }
////        for (int x : arr) {
////            System.out.println(x);
////        }
//        }
////        for (int i = 0; i < arr.length; i++){
////            int temp = arr[i];
////            for (int j = i + 1; j < arr.length; j++){
////                if (temp > arr[j]){
////                    arr[i] = arr[j];
////                    arr[j] = temp;
////                    temp = arr[i];
////                }
////            }
////        }
////        System.out.println("Mang duoc sap xep tang dan");
////        for (int x: arr){
////            System.out.println(x);
////        }


package thuat_toan_tim_kiem_14.bai_tap;

import java.util.Arrays;

public class MinhHoaSapXepChen {

    public static void main(String[] args) {
        int[] array = {2,6,7,1,9,4,8};
        for (int x: array){
            System.out.print(x + " ");
        }
        for (int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;
            for (; j >= 0 && array[j] > temp; j--){
                System.out.println("insert " + array[j] + ", index= " + j + " into " + array[i] + ", index= " + i);
                array[j+1] = array[j];
                System.out.println(Arrays.toString(array));
                System.out.print("\n");
            }
            array[j+1] = temp;
            System.out.print("\n");
        }
        System.out.print("Array sorted: " + Arrays.toString(array));
        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (array[i] < array[j]) {
//                    System.out.println("insert " + array[i] + " into " + array[j]);
//                    int temp = array[i];
//                    for (int k = i; k > j; k--) {
//                        array[k] = array[k - 1];
//                    }
//                    array[j] = temp;
//                    for (int o : array) {
//                        System.out.print(o + " ");
//                    }
//                    System.out.println();
//                    break;
//                }
//            }
//        }
    }


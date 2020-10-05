package _03_array_method.bai_tap;

public class GopMang {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "";
        int[] arr1 = new int[3];
        arr1[0] = 5;
        arr1[1] = 7;
        arr1[2] = 9;
        int[] arr2 = new int[4];
        arr2[0] = 2;
        arr2[1] = 4;
        arr2[2] = 6;
        arr2[3] = 8;
        for (int i = 0; i < arr1.length; i++){
            str1 += arr1[i];
        }
        System.out.println(str1);
        for (int i = 0; i < arr2.length; i++){
            str2 += arr2[i];
        }
        System.out.println(str2);
        int[] arr3 = new int[arr1.length + arr2.length];
        int iArray3 = 0;
        for (int i = 0; i < arr1.length; i++){
            arr3[iArray3++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[iArray3++] = arr2[i];
        }

        for (int i = 0; i < arr3.length; i++){
            System.out.printf(arr3[i] + "\t");
        }
    }
}

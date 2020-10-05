package _04_class_object.bai_tap;

import static java.util.Arrays.sort;

public class TestStopWatch {
   static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int[] arr = new int[100000];
        //(Math.random() * ( max - min )) + min
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 100);
        }
        sort(arr);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}

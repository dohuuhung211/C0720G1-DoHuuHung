package lop_va_doi_tuong_04.bai_tap;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int[] arr = new int[100];
        //(Math.random() * ( max - min )) + min
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 100);
        }
        public static void sort(int[] arr){
            int n = arr.length;
            int[] arr = new int[100];
            // One by one move boundary of unsorted subarray
            for (int i = 0; i < n-1; i++) {
                // Find the minimum element in unsorted array
                int min_idx = i;
                for (int j = i+1; j < n; j++)
                    if (arr[j] < arr[min_idx])
                        min_idx = j;

                // Swap the found minimum element with the first
                // element
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(sort(arr));
        sort(arr);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}

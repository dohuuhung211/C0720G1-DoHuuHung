package thuat_toan_tim_kiem_14.bai_tap;

public class ThuatToanSapXepChen {
    public static void insertionSort(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < i; j++){
                if (array[i] < array[j]){
                    int temp = array[i];
                    for (int k = i; k > j; k--){
                        array[k] = array[k-1];
                    }
                    array[j] = temp;
                    break;
                }
            }
        }
    }
    public static void  insertionSort1 ( int array[]){
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
    public static void main(String[] args) {
        int array[] = {2, 9, 5, 4, 8, 1, 6};
        System.out.println();
        insertionSort(array);
        for (int o : array) {
            System.out.print(o + " ");
        }
    }
}

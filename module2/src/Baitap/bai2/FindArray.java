package Baitap.bai2;

public class FindArray {
    public static int search(int[] arr, int x){
        for (int i = 0; i < arr.length; i++){
            if (arr[i]==x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int result = search(arr,2);
        if (result == -1){
            System.out.println("x khong nam trong mang");
        } else {
            System.out.println("x nam tai vi tri thu: " + result);
        }
    }
}

package thuat_toan_tim_kiem_13.bai_tap.optional_cai_dat_tim_kiem_nhi_phan;

public class Search {
    public static int search(int[] arr, int l, int r, int x){
        if (r >= 1){
            int mid = l + (r - 1) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return search(arr, l, mid - 1, x);
            }
            return search(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int result = search(arr,0,arr.length - 1,8);
        if (result == -1){
            System.out.println("x khong nam trong mang");
        } else {
            System.out.println("x nam vi tri thu " + result);
        }
    }
}

package Baitap.bai2;

public class Search {
//    public int search(int[] arr, int l, int r, int x){
//        if (r >= 1){
//            int mid = l + (r - l) / 2;
//
//            if (arr[mid] == x)
//                return mid;
//
//            if (arr[mid] > x)
//                return search(arr, l, mid - 1, x);
//
//            return search(arr,mid + 1, r, x);
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        Search obj = new Search();
//        int[] arr = {1,5,8,10,40};
//        int result = obj.search(arr,0,arr.length - 1, 8);
//        if (result == -1){
//            System.out.println("x khong nam trong mang");
//        } else {
//            System.out.println("x nam vi tri " + result);
//        }
//    }
    public int search(int[] arr, int l, int r, int x){
        if (r >= 1){
            int mid = l + (r - 1) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return search(arr, l , mid - 1, x);

            return search(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        Search obj = new Search();
        int arr[] = {1,5,10,20,25};
        int result = obj.search(arr,0,arr.length - 1,10);
        if (result == -1){
            System.out.println("x khong nam trong mang");
        } else {
            System.out.println("x nam vi tri thu " + result);
        }
    }
}

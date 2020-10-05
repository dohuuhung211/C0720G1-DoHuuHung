package _11_generic_stack_queue.bai_tap.dem_so_lan_xuat_hien_phan_tu;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class CountElement {
//    public static Scanner scanner = new Scanner(System.in);
//    public static void main(String[] args) {
//        System.out.print("Nhập số phần tử của mảng: ");
//        int size = scanner.nextInt();
//        int [] arr = new int [size];
//        System.out.print("Nhập các phần tử của mảng: \n");
//        for (int i = 0; i < size; i++) {
//            System.out.printf("a[%d] = ", i);
//            arr[i] = scanner.nextInt();
//        }
//        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
//        for (int i = 0; i < size; i++) {
//            addElement(map, arr[i]);
//        }
//        for (Integer key : map.keySet()) {
//            System.out.printf("%d xuất hiện %d lần.\n", key, map.get(key));
//        }
//    }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("So phan tu trong mang");
    int size = scanner.nextInt();
    String[] arr = new String[size];
    for (int i = 0; i < size; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.next();
        }
    Map<String,Integer> map = new TreeMap<>();
    for (int i = 0; i < size; i++){
        addElement(map,arr[i]);
    }
//    Iterator<String> iterator = map.keySet().iterator();
//    while (iterator.hasNext()){
//        System.out.println(iterator.next());
//    }
    for (String key: map.keySet()){
        System.out.printf("Phan tu %s xuat hien %d lan \n", key, map.get(key));
    }
}

    public static void addElement(Map<String, Integer> map, String element) {
        if (map.containsKey(element)) {
            int count = map.get(element) + 1;
            map.put(element, count);
        } else {
            map.put(element, 1);
        }
    }
}

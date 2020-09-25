package java_collection_framework_12.thuc_hanh.thuc_hanh_01;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class thuc_hanh_01 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Hung",30);
        hashMap.put("Trung",27);
        hashMap.put("Vi",21);
        hashMap.put("Trang",25);
        System.out.println(hashMap);

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(hashMap);
        System.out.println("Tuoi cua Trung la " + linkedHashMap.get("Trung"));
        }
    }

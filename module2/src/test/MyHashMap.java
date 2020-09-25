package test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyHashMap {
    public static void main(String[] args) {
        Map<Student, String> treeMap = new TreeMap<>();
        treeMap.put(new Student(5,"Hung"),"C07");
        treeMap.put(new Student(2,"Trang"),"C07");
        treeMap.put(new Student(5,"Vo"),"C07");
        treeMap.put(new Student(4,"Voa"),"C07");
        treeMap.put(new Student(1,"na"),"C07");
        for (Student student: treeMap.keySet()){
            System.out.println(student.toString() + treeMap.get(student));
        }
    }
}

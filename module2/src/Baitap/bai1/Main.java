package Baitap.bai1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Test a = new Test(1,"hung");
        Test b = new Test(1,"Trang");
        Test c = new Test(2,"Viet");
        ArrayList<Test> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        Collections.sort(list, new Comparator<Test>() {
            @Override
            public int compare(Test test, Test t1) {
                if (test.getId() == t1.getId()){
                    return test.getName().compareTo(t1.getName());
//                    return t1.getName().compareTo(test.getName());
                }
                return t1.getId() - test.getId();
            }
        });
        for (Test x: list){
            System.out.println(x);
        }
//        Map<Integer,Test> myMap = new HashMap<Integer,Test>();
//        myMap.put(1,new Test(1,"Hung"));
//        myMap.put(2,new Test(1,"Hung"));
//        myMap.put(3,new Test(1,"Hung"));
////        Collections.sort(myMap);
////        for (Integer key: myMap.keySet()){
////            System.out.println(key + " " + myMap.get(key));
////        }
//        for (Map.Entry<Integer, Test> entry: myMap.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
    }
}

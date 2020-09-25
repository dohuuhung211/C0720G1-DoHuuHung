import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

class Person{
    public static void main(String[] args) {
        //hashmap
//        HashMap<Integer,String> hm = new HashMap<>();
//        hm.put(1,"one");
//        hm.put(2,"two");
//        hm.put(3,"three");
//        hm.put(4,"four");
//        for (int key : hm.keySet()){
//            System.out.println(key + " " + hm.get(key));
//        }
//        Iterator<Integer> ite = hm.keySet().iterator();
//        while (ite.hasNext()){
//            System.out.println(ite.next());
//        }
//        for (String value: hm.values()){
//            System.out.println(value);
//        }

        //tree map
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("five",5);
        tm.put("six",6);
        tm.put("seven",7);
        tm.put("eight",8);
        System.out.println(tm.get("five"));
//        for (String key: tm.keySet()){
//            System.out.println(key + " " + tm.get(key));
//        }
        Iterator<String> ite1 = tm.keySet().iterator();
        while (ite1.hasNext()){
            System.out.println(ite1.next().toUpperCase() + " ");
        }
//        for (Integer value: tm.values()){
//            System.out.println(value);
//        }
//        //kiem tra key co hay ko
//        tm.containsKey("five");
//        System.out.println(tm.containsKey("a"));
    }
}

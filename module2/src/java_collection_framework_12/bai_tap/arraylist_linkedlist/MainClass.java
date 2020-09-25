package java_collection_framework_12.bai_tap.arraylist_linkedlist;

import test.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
//        ProductManager productManager = new ProductManager();
//
//        productManager.addProduct();
//        productManager.removeProduct();
//        productManager.printList();
////        productManager.findProduct();
//        productManager.editProduct();
//
        List<Product> sp1 = new ArrayList<>();
        sp1.add(new Product(1,"Nam"));
        sp1.add(new Product(1,"Hoang"));
        sp1.add(new Product(1,"Khai"));
        sp1.add(new Product(1,"Buoi"));
        for (Product pro: sp1){
            System.out.println(pro);
        }
//        sp1.add(productManager);
        Collections.sort(sp1);
        for (Product pro: sp1){
            System.out.println(pro);
        }

    }
}

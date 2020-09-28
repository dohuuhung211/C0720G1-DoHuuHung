package java_collection_framework_12.bai_tap.arraylist_linkedlist;

import test.Person;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        productManager.addProduct();
//        productManager.removeProduct();
        productManager.sortByComparator();
        productManager.printList();
//        productManager.findProduct();
//        productManager.editProduct();

    }
}

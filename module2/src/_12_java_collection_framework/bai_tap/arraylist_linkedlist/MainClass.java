package _12_java_collection_framework.bai_tap.arraylist_linkedlist;

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

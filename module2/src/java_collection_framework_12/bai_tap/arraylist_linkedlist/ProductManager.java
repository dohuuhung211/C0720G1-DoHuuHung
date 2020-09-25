package java_collection_framework_12.bai_tap.arraylist_linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ProductManager {

    List<Product> productList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addProduct() {
        System.out.println("Amount product: ");
        int size = scanner.nextInt();
        while (size != 0){
            System.out.println("please input id : ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("input name: ");
            String name = scanner.nextLine();
            Product product = new Product(id,name);
            this.productList.add(product);
            size--;
        }
//        for (int i = 0; i < size; i++){
//            System.out.println("please input id: ");
//            int id = scanner.nextInt();
//            scanner.nextLine();
//            System.out.println("input name: ");
//            String name = scanner.nextLine();
//            Product product = new Product(id,name);
//            this.productList.add(product);
//        }
    }
    public void removeProduct() {
        System.out.println("please input id you want to delete");
        int id = scanner.nextInt();
        for (int i = 0; i < this.productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                this.productList.remove(i);
                break;
            }
        }
    }


    public void printList() {
        for (Product product : this.productList) {
            System.out.println(product);
        }
    }
    public void findProduct(){
        System.out.println("product's name you want to search");
        Object pro = scanner.nextLine();
//        for (int i = 0; i < this.productList.size(); i++){
//            if (this.productList.get(i).getName() == pro){
//                System.out.println();
//            }
//        }
        for (Product product : this.productList){
            if (product.getName().equals(pro)){
                System.out.println(product);
                break;
            } else {
                System.out.println("Not found!");
                break;
            }
        }
    }
    public void editProduct(){
        System.out.println("Input product's id you want to edit");
        int id = scanner.nextInt();
        for (int i = 0; i < productList.size(); i++){
            if (productList.get(i).getId() == id){
                System.out.println(productList.get(i));
                scanner.nextLine();
                System.out.println("Input new Id");
                int editId = scanner.nextInt();
                productList.get(i).setId(editId);
                scanner.nextLine();
                System.out.println("Input new name");
                String editName = scanner.nextLine();
                productList.get(i).setName(editName);
            }
        }
        printList();
    }
}

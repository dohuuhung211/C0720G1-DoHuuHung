package _12_java_collection_framework.bai_tap.arraylist_linkedlist;

public class Product implements Comparable<Product>{
    public int id;
    public String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Product(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product product) {
        int result = this.id - product.getId();
        if (result == 0){
            return this.name.compareTo(product.getName());
        }
        return result;
    }
}

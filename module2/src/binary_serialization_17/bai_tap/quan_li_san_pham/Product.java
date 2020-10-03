package binary_serialization_17.bai_tap.quan_li_san_pham;

import java.io.Serializable;

public class Product implements Serializable {
    int code;
    String name;
    String brand;
    double price;
    public Product(){}
    public Product(int code, String name, String brand, double price) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}

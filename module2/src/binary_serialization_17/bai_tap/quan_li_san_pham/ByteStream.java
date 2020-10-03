package binary_serialization_17.bai_tap.quan_li_san_pham;
import javax.sound.midi.Soundbank;
import java.io.*;
import java.util.*;
public class ByteStream {
    Scanner scanner = new Scanner(System.in);
    public static final String FILE_PATH = "G:\\C0720G1_Do_Huu_Hung\\module2\\src\\binary_serialization_17\\bai_tap\\quan_li_san_pham\\product.csv";

    public static void add(List<Product> listProduct){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so san pham muon them");
        int amount = scanner.nextInt();
        while (amount > 0){
            System.out.println("Nhap ma san pham");
            int code = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhap ten san pham");
            String name = scanner.nextLine();
            System.out.println("Nhap hang san pham");
            String brand = scanner.nextLine();
            System.out.println("Nhap gia san pham");
            double price = scanner.nextInt();
            Product product = null;
            product = new Product(code,name,brand,price);
            listProduct.add(product);
            amount--;
        }
    }
    public static void writeObjectList(List<Product> productList) {
        FileOutputStream fos;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(FILE_PATH);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(productList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static List<Product> readObject(){
        FileInputStream fis;
        ObjectInputStream ois = null;
        List<Product> productList = null;
        try {
            fis = new FileInputStream(FILE_PATH);
            ois = new ObjectInputStream(fis);
            try {
                productList = (List<Product>) ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productList;
    }

    public static void search(List<Product> productList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tim kiem san pham");
        System.out.println("1. Tim theo ma san pham \n" +
                            "2. Tim theo ten san pham");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("Nhap id can tim");
                int code = scanner.nextInt();
                for (Product x : productList) {
                    if (x.getCode() == code) {
                        System.out.println(x);
                    } else {
                        System.out.println("San pham khong ton tai");
                    break;
                    }
                }
                break;
            case 2:
                System.out.println("Nhap ten san pham can tim");
                scanner.nextLine();
                Object name = scanner.nextLine();

                for (Product y: productList){
                    if (y.getName().equals(name)){
                        System.out.println(y);
                        break;
                    } else {
                        System.out.println("San pham khong ton tai");
                        break;
                    }
                }
                break;
        }
    }
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        add(list);
        writeObjectList(list);
        List<Product> output = readObject();
        for (Product x: output){
            System.out.println(x);
        }
        search(list);

    }
}

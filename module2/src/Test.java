import java.util.Arrays;
import java.util.zip.CheckedInputStream;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
//        Person a = new Person("Hung",25,1.8f);
//        System.out.println(a.name);
//        System.out.println(a.age);
//        System.out.println(a.height);
//        a.age = 17;
//        a.name = "hung";
//        a.height = 1.8f;
//        a.eat("Com");
//        int age = a.getAge();
//        System.out.println("Tuoi cua anh ay: " + age);
//        Person b = new Person("Trang" , 21,1.6f);
//        System.out.println(b.name);
//        System.out.println(b.age);
//        System.out.println(b.height);
//        b.eat("Cut");
//        int ageB = b.getAge();
//        System.out.println("Tuoi cua trang: " + ageB);
//        String nameB = b.getName();
//        System.out.println(nameB);
//        float heightB = b.getHeight();
//        System.out.println(heightB);
//        Person a = new Person("Chau",7,1.6f);
//        Person b = new Person("Trang",9,1.7f
//        );
//        Person array = new Person();
//        int[] arr = {1,2,3};
//        array.setArray(arr);
//        array.displayArray();
//        arr[1] = 5;
//        array.displayArray();
//        Student a = new Student("Chau",28,1.7f,"havard");
//        Student b = new Student("hung",25,1.7f,"havard");
//        a.getInfo();
//        b.getInfo();
//        Scanner scanner = new Scanner(System.in);
//        int n1 = 5, n2 = 6, n3=8;
//        int[] arr1 = new int[n1];
//        int[] arr2 = new int[n2];
//        int[] arr3 = new int[n3];
//        for (int i = 0; i < arr1.length; i++){
//            arr1[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < arr2.length; i++){
//            arr2[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < arr3.length; i++){
//            arr3[i] = scanner.nextInt();
//        }
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));
        Scanner scanner = new Scanner(System.in);
        int[] arr1, arr2;
        arr1 = Person.inArr(2,scanner);
        arr2 = Person.inArr(3,scanner);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}

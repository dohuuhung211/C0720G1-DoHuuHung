import java.util.Scanner;
    class Person{
        public String name;
        public int age;
        public float height;
        public Person(){

        }
        public Person(int name){

        }
//
        public Person(String name) {
            this.name = name;
        }
        public Person(String name, int age){
            this(name);
            this.age = age;
        }
        public Person(String name, int age, float height){
            this(name, age);
            this.height = height;
            this.getInfo();
        }
//        public String getName() {
//            return name;
//        }
//
//        public float getHeight() {
//            return height;
//        }
//
//        public void eat(String foodName){
//            System.out.println(name + " is eating " + foodName);
//        }
//        public int getAge(){
//            return age;
//        }
        public void getInfo(){
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Height: " + this.height);
        }
        public static int[] inArr(int n, Scanner scanner){
            int[] arr = new int[n];
            for (int i = 0; i < n; i++){
                System.out.println("Nhap phan tu " + arr[i]);
                arr[i] = scanner.nextInt();
            }
            return arr;
        }
//        int[] array;
//        public void setArray(int[] array){
//            this.array = array;
//        }
//        public void displayArray(){
//            for (int x: this.array){
//                System.out.print(x);
//            }
//            System.out.println();
//        }
    }

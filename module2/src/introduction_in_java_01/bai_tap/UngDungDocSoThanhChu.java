package introduction_in_java_01.bai_tap;
import java.util.Scanner;
public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can doc");
        int num = scanner.nextInt();
        if (num < 10) {
            switch (num) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                default:
                    System.out.println("out of ability");
            }
            } else if (num < 20){
            switch (num){
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
                }
            } else if (num < 100){
                int tens = num / 10;
                int ones = num % 10;
                switch (tens){
                    case 2:
                        System.out.print("twenty ");
                        break;
                    case 3:
                        System.out.print("thirty ");
                        break;
                    case 4:
                        System.out.print("forty ");
                        break;
                    case 5:
                        System.out.print("fifty ");
                        break;
                    case 6:
                        System.out.print("sixty ");
                        break;
                    case 7:
                        System.out.print("seventy ");
                        break;
                    case 8:
                        System.out.print("eighty ");
                        break;
                    case 9:
                        System.out.print("ninety ");
                        break;
                }
                switch (ones){
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;
                }
            } else if (num < 1000){
                int hundred = num / 100;
                int tens = num / 10;
                int ones = num % 10;
                switch (hundred){
                    case 1:
                        System.out.print("one hundred ");
                        break;
                    case 2:
                        System.out.print("two hundred ");
                        break;
                    case 3:
                        System.out.print("three hundred ");
                        break;
                    case 4:
                        System.out.print("four hundred ");
                        break;
                    case 5:
                        System.out.print("five hundred ");
                        break;
                    case 6:
                        System.out.print("six hundred ");
                        break;
                    case 7:
                        System.out.print("seven hundred ");
                        break;
                    case 8:
                        System.out.print("eight hundred ");
                        break;
                    case 9:
                        System.out.print("nine hundred ");
                        break;
                }
                switch (tens){
                    case 2:
                        System.out.print("twenty ");
                        break;
                    case 3:
                        System.out.print("thirty ");
                        break;
                    case 4:
                        System.out.print("forty ");
                        break;
                    case 5:
                        System.out.print("fifty ");
                        break;
                    case 6:
                        System.out.print("sixty ");
                        break;
                    case 7:
                        System.out.print("seventy ");
                        break;
                    case 8:
                        System.out.print("eighty ");
                        break;
                    case 9:
                        System.out.print("ninety ");
                        break;
                }
                switch (ones){
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;
                }
            }
        }
    }

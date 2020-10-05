package _01_introduction_in_java.bai_tap;
import java.util.Scanner;
public class DocSoThanhChu {

    static String from1to10(int numb){
        String str = "";
        switch (numb){
            case 1:
                str = "one";
                break;
            case 2:
                str = "two";
                break;
            case 3:
                str = "three";
                break;
            case 4:
                str = "four";
                break;
            case 5:
                str = "five";
                break;
            case 6:
                str = "six";
                break;
            case 7:
                str = "seven";
                break;
            case 8:
                str = "eight";
                break;
            case 9:
                str = "nine";
                break;
        }
        return str;
    }
    static String readTy(int numb){
        String str = "";
        switch (numb){
            case 20:
                str = "twenty";
                break;
            case 30:
                str = "thirty";
                break;
            case 40:
                str = "forty";
                break;
            case 50:
                str = "fifty";
                break;
            case 60:
            case 70:
            case 80:
            case 90:
                int tens = numb / 10;
                str = from1to10(tens) + "ty";
                break;
        }
        return str + " ";
    }
    static String from11to19(int numb){
        String str = "";
        switch (numb) {
            case 11:
                str = "eleven";
                break;
            case 12:
                str = "twelve";
                break;
            case 13:
                str = "thirteen";
                break;
            case 14:
                str = "forteen";
                break;
            case 15:
                str = "fifteen";
                break;
            case 16:
            case 17:
            case 18:
            case 19:
                int ones = numb % 10;
                str = from1to10(ones) + "teen";
                break;
        }
        return str;
    }
    static String readHundred(int numb){
        return from1to10(numb) + " hundred";
    }
    static String from1to99(int numb){
        String str ="";
        if (numb > 0 && numb < 10){
            str = from1to10(numb);
        } else if (numb > 10 && numb < 20){
            str = from11to19(numb);
        } else if (numb > 20 && numb < 100){
            int tens = numb / 10;
            String strTens = tens + "0";
            int ones = numb % 10;
            str = readTy(Integer.parseInt(strTens)) + from1to10(ones);
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so can doc");
        int numb = scanner.nextInt();
        String str = "";
        if (numb > 0 && numb < 100){
            str = from1to99(numb);
            System.out.println(str);
        } else {
            int ones = numb % 10;
            int onesAndTens = numb % 100;
            int huns = numb / 100;
            String result = readHundred(huns) + " and " + from1to99(onesAndTens);
            System.out.println(result);
        }
    }
}

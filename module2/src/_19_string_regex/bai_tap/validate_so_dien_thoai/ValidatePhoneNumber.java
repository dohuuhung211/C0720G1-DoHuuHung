package _19_string_regex.bai_tap.validate_so_dien_thoai;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static final String VALIDATE_PHONE = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
    public static boolean validate(String regex){
        Pattern pattern = Pattern.compile(VALIDATE_PHONE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (validate(input)){
            System.out.println("Invalid");
        } else {
            System.out.println("Illegal");
        }
    }
}

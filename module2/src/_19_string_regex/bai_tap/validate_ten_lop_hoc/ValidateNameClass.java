package _19_string_regex.bai_tap.validate_ten_lop_hoc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    static Scanner scanner = new Scanner(System.in);
    public static final String CLASS_REGEX = "^(A|P|C)\\d{4}(G|H|I|K|L|M)$";
    public static boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String input = scanner.nextLine();
        if (validate(input)){
            System.out.println("Invalid");
        } else {
            System.out.println("Illegal");
        }
    }
}

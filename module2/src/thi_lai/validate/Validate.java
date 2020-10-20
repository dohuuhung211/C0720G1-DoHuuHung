package thi_lai.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static boolean validNumber(String regex){
        final String REGEX_NUMBER = "^\\d+$";
        Pattern pattern = Pattern.compile(REGEX_NUMBER);
        Matcher matcher = pattern.matcher(regex);
        return matcher.find();
    }

}

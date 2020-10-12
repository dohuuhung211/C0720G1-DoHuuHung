package case_study_02.controllers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateService {
    public static boolean validCodeVilla(String regex){
        final String REGEX_VILLA = "^SVVL-\\d{4}$";
        Pattern pattern = Pattern.compile(REGEX_VILLA);
        Matcher matcher = pattern.matcher(regex);
        return matcher.find();
    }
    public static boolean validCodeHouse(String regex){
        final String REGEX_VILLA = "^SVHO-\\d{4}$";
        Pattern pattern = Pattern.compile(REGEX_VILLA);
        Matcher matcher = pattern.matcher(regex);
        return matcher.find();
    }
    public static boolean validCodeRoom(String regex){
        final String REGEX_VILLA = "^SVRO-\\d{4}$";
        Pattern pattern = Pattern.compile(REGEX_VILLA);
        Matcher matcher = pattern.matcher(regex);
        return matcher.find();
    }
    public static boolean validNameService(String regex){
        final String REGEX_NAME_SERVICE = "^[A-Z][a-z]+(\\s[a-z]+)*$";
        Pattern pattern = Pattern.compile(REGEX_NAME_SERVICE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.find();
    }
    public static boolean validArea(String regex){
        final String REGEX_AREA = "^([3][0]\\.\\d+)|([3][1-9]\\.?\\d*)|([4-9]\\d\\.?\\d*)|(\\d{3,}\\.?\\d*)$";
        Pattern pattern = Pattern.compile(REGEX_AREA);
        Matcher matcher = pattern.matcher(regex);
        return matcher.find();
    }
    public static boolean validPay(String regex){
        final String REGEX_PAY = "^\\d*\\.?\\d*";
        Pattern pattern = Pattern.compile(REGEX_PAY);
        Matcher matcher = pattern.matcher(regex);
        return matcher.find();
    }
    public static boolean validFloor(String regex){
        final String REGEX_FLOOR = "^([1-9]|[1-2][\\d])$";
        Pattern pattern = Pattern.compile(REGEX_FLOOR);
        Matcher matcher = pattern.matcher(regex);
        return matcher.find();
    }
    public static boolean validService(String regex){
        final String REGEX_SERVICE = "^(massage|karaoke|car|drink|food)$";
        Pattern pattern = Pattern.compile(REGEX_SERVICE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.find();
    }
    public static boolean validMaxQuantity(String regex){
        final String REGEX_MAX_QUANTITY = "^([1-9]|[1][\\d])$";
        Pattern pattern = Pattern.compile(REGEX_MAX_QUANTITY);
        Matcher matcher = pattern.matcher(regex);
        return matcher.find();
    }
    public static boolean validStandard(String regex){
        final String REGEX_MAX_QUANTITY = "3 sao|4 sao|5 sao|\\*{3,5}";
        Pattern pattern = Pattern.compile(REGEX_MAX_QUANTITY);
        Matcher matcher = pattern.matcher(regex);
        return matcher.find();
    }
    public static boolean validTypeRent(String regex){
        final String REGEX_MAX_QUANTITY = "^([T-t]heo ngay|[T-t]heo ngày|[T-t]heo tuan|[T-t]heo tuần|[T-t]heo nam|[T-t]heo năm)$";
        Pattern pattern = Pattern.compile(REGEX_MAX_QUANTITY);
        Matcher matcher = pattern.matcher(regex);
        return matcher.find();
    }
    public static boolean validBonusService(String regex){
        final String REGEX_BONUS_SERVICE = "^([K-k]araoke|[M-m]assage|[T-t]our)$";
        Pattern pattern = Pattern.compile(REGEX_BONUS_SERVICE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.find();
    }
    public static boolean validDayOfBirth(String regex){
//        final String REGEX_MAX_QUANTITY = "^0?[1-9]|([1-2]\\d-[30-31])[./-](0?[1-9]|1[012])[./-]$";
        final String REGEX_MAX_QUANTITY = "^\\d{1,2}[./-]\\d{1,2}[./-]\\d{4}$";
        Pattern pattern = Pattern.compile(REGEX_MAX_QUANTITY);
        Matcher matcher = pattern.matcher(regex);
        return matcher.find();
    }
}

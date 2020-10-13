package case_study_02.controllers;

import case_study_02.exception.*;
import javafx.css.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCustomer {
    public static void validNameCustomer(String regex) throws NameException {
        final String REGEX_NAME_CUSTOMER = "^([A-Z][a-z]+)(\\s[A-Z][a-z]+)*$";
        Pattern pattern = Pattern.compile(REGEX_NAME_CUSTOMER);
        Matcher matcher = pattern.matcher(regex);
        if(!matcher.find()) throw  new NameException("Ten phai viet hoa chu cai dau");
    }
    public static void validEmail(String regex) throws EmailException {
        final String REGEX_EMAIL = "^\\w{3,}@\\w+\\.\\w+";
        Pattern pattern = Pattern.compile(REGEX_EMAIL);
        Matcher matcher = pattern.matcher(regex);
        if (!matcher.find()) throw new EmailException("Email khong dung dinh dang");
    }
    public static void validIdCard(String regex) throws IdCardException {
        final String REGEX_IDCARD = "^\\d{9}$";
        Pattern pattern = Pattern.compile(REGEX_IDCARD);
        Matcher matcher = pattern.matcher(regex);

        if (!matcher.find()) throw new IdCardException("Chung minh nhan dan phai dung 9 so");
    }
    public static void validBirthday(String regex) throws BirthDayException {
        final String REGEX_BIRTHDAY = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[./-](19(\\d[1-9]|[1-9]\\d)|200[0-1])$";
        Pattern pattern = Pattern.compile(REGEX_BIRTHDAY);
        Matcher matcher = pattern.matcher(regex);
        if (!matcher.find()) throw new BirthDayException("Ngay sinh khong dung dinh dang");
    }
    public static void validGender(String regex) throws GenderException {
        final String REGEX_GENDER = "^([N-n][A-a][M-m]|[N-n][U-u]|[K-k][H-h][A-a][C-c])$";
        Pattern pattern = Pattern.compile(REGEX_GENDER);
        Matcher matcher = pattern.matcher(regex);
        if (!matcher.find()) throw new GenderException("Ngay sinh khong dung dinh dang");
    }
}

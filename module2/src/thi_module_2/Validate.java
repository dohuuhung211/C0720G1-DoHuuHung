package thi_module_2;

import case_study_02.exception.BirthDayException;
import case_study_02.exception.NameException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static thi_module_2.MainMenu.readFileStudent;
import static thi_module_2.MainMenu.studentList;

public class Validate {
    public static boolean validNameStudent(String regex){
        final String REGEX_NAME_STUDENT = "^[A-Za-z]{4,50}$";
        Pattern pattern = Pattern.compile(REGEX_NAME_STUDENT);
        Matcher matcher = pattern.matcher(regex);
        return matcher.find();
    }
    public static boolean validDateOfBirth(String regex){
        final String REGEX_DAYOFBIRTH = "^\\d{2}/\\d{2}/\\d{4}$";
        Pattern pattern = Pattern.compile(REGEX_DAYOFBIRTH);
        Matcher matcher = pattern.matcher(regex);
        return matcher.find();
    }
    public static boolean validPhoneNumber(String regex){
        final String REGEX_PHONE = "^(090)|(091)\\d{7}$";
        Pattern pattern = Pattern.compile(REGEX_PHONE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.find();
    }
    public static boolean validGender(String regex){
        final String REGEX_GENDER = "^\\w+";
        Pattern pattern = Pattern.compile(REGEX_GENDER);
        Matcher matcher = pattern.matcher(regex);
        return matcher.find();
    }
    public static void checkId(int id) throws NotFoundStudentException {
        readFileStudent();
        boolean flag = false;
        for (Student student: studentList) {
            if (student.getId() == id) {
                flag = true;
                break;
            }
        }

        if (!flag) throw new NotFoundStudentException("Sinh vien khong ton tai");
    }

}

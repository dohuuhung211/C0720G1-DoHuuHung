package clean_code_08.thuc_hanh.thuc_hanh_2;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if(isFizz && isBuzz)
            return "FizzBuzz";

        if(number % 3 == 0)
            return "Fizz";

        if(number % 5 == 0)
            return "Buzz";

        return number + "";
    }
}
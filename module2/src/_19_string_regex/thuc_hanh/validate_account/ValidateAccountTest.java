package _19_string_regex.thuc_hanh.validate_account;

public class ValidateAccountTest {
    static ValidateAccount validateAccount;
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456","abcdefgh"};
    public static final String[] inValidAccount = new String[]{ ".@", "12345", "1234_", "abcde" };

    public static void main(String[] args) {
        validateAccount = new ValidateAccount();
        for (String x: validAccount){
            boolean isvalid = validateAccount.validate(x);
            System.out.println("Account is: " + x + " is valid: " + isvalid);
        }
        for (String x: inValidAccount){
            boolean isvalid = validateAccount.validate(x);
            System.out.println("Account is: " + x + " is valid: " + isvalid);
        }
    }

}

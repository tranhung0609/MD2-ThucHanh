package string_regex.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_Account {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public Email_Account() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate1(String regex) {
        Pattern pattern1 = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher1 = pattern1.matcher(regex);
        return matcher1.matches();
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    private static Email_Account validateMail;
    public static final String[] validEmail = new String[]{"trvanhung.nhk.0609@gmail.com", "Hungtran.nhk.0609@gmail.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};


    public static void main(String[] args) {


        validateMail = new Email_Account();
        for (String email : validEmail) {
            boolean isvalid = validateMail.validate(email);
            System.out.println("Email is " + email + " is valid " + isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = validateMail.validate(email);
            System.out.println("Email is " + email + " is valid " + isvalid);
        }

        for (String account : validAccount) {
            boolean isvalid1 = validateMail.validate1(account);
            System.out.println("Account is " + account + " is valid " + isvalid1);
        }
        for (String account : invalidAccount) {
            boolean isvalid1 = validateMail.validate1(account);
            System.out.println("Account is " + account + " is valid " + isvalid1);
        }
    }
}

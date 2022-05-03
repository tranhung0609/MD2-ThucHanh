package string_regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidateTest {
    private static final String PHONE_NUMBER_REGEX = "/^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$/";

    public static boolean validate(PhoneNumberValidate phoneNumberValidate, String string){
        Pattern pattern = Pattern.compile(phoneNumberValidate.getRegex());
        Matcher matcher = pattern.matcher(string);
        if (!matcher.matches()){
            System.out.println(phoneNumberValidate.getMessage());
        }
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber= scanner.nextLine();
        validate(new PhoneNumberValidate(PHONE_NUMBER_REGEX,"Nhập chưa đúng vui lòng nhập lại !!!"),phoneNumber);
    }
}

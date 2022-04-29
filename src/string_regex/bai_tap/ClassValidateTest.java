package string_regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassValidateTest {
    private static final String CLASS_NAME_REGEX =  "^[CAP]+[\\d]{4}[GHIKLM]$";

        public static boolean validate(ClassValiDate classValidate, String string){
            Pattern pattern = Pattern.compile(classValidate.getRegex());
            Matcher matcher = pattern.matcher(string);
            if (!matcher.matches()){
                System.out.println(classValidate.getMessage());
            }
            return matcher.matches();
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String className =scanner.nextLine();
        validate(new ClassValiDate(CLASS_NAME_REGEX,"Nhập chưa đúng vui lòng nhập lại"), className);
    }
    }


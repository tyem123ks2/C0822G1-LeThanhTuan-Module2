package ss19_regex.exercise.validatePhone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    public static final String PHONE_NUMBER = "^[(]+[0-9]{2}+[)]+-+[(]+[0][0-9]{9}+[)]$";

    public ValidatePhone() {

    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

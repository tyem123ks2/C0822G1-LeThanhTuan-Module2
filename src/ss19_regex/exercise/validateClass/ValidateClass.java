package ss19_regex.exercise.validateClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    public static final String CLASS_NAME = "^[CAP]+\\d{4}[GHIKLM]$";

    public ValidateClass(){

    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_NAME);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();

    }
}

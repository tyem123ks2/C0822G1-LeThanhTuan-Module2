package ss19_regex.exercise.validatePhone;

public class ValidatePhoneTest {
    private static ValidatePhone validatePhone;

    public static final String[] valiPhone = new String[] { "(84)-(0912080223)" };
    public static final String[] invalidPhone = new String[] { "(814)-(0912080223)", "(84)-(1912080223)"};

    public static void main(String[] args) {
        validatePhone = new ValidatePhone();
        for (String number : valiPhone){
            boolean isvalid = validatePhone.validate(number);
            System.out.println("Number Phone is " + number + " is valid: " + isvalid);
        }
        for (String number : invalidPhone) {
            boolean isvalid = validatePhone.validate(number);
            System.out.println("Number Phone is " + number +" is valid: "+ isvalid);
        }
    }
}

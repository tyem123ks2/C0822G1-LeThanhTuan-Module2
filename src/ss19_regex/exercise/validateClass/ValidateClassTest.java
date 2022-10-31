package ss19_regex.exercise.validateClass;


public class ValidateClassTest {
    private static ValidateClass validateClass;

    public static final String[] valiClass = new String[] { "C0318G", "C6718G"};
    public static final String[] invalidClass = new String[] { "M0318G", "P0323A"};

    public static void main(String[] args) {
        validateClass = new ValidateClass();
        for (String name : valiClass){
            boolean isvalid = validateClass.validate(name);
            System.out.println("Name is " + name + " is valid " + isvalid);
        }
        for (String name : invalidClass) {
            boolean isvalid = validateClass.validate(name);
            System.out.println("Name is " + name +" is valid: "+ isvalid);
        }
    }
}

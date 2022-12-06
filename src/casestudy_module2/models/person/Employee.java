package casestudy_module2.models.person;

public class Employee extends Person {

    public String level;
    public String Standard;
    public int salary;
    public static final String IMTERMEDIATE = "Imetermiate";
    public static final String COLLAGE = "College";
    public static final String UNIVERSITY = "University";
    public static final String AFTER_UNIVERSITY = "After-University";
    public static final String RECEPTIONIST = "Receptionist";
    public static final String STAFF = "Staff";
    public static final String EXPERT = "expert";



    public static final String MONITORING = "monitoring";
    public static final String MANAGE = "Manage";
    public static final String CEO = "CEO";


    public Employee() {
    }


    public Employee(String name, String date, String gender, String idCard, String phoneNumber, String email, String level, String standard, int salary) {
        super(name, date, gender, idCard, phoneNumber, email);
        this.level = level;
        Standard = standard;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getStandard() {
        return Standard;
    }

    public void setStandard(String standard) {
        Standard = standard;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getIMTERMEDIATE() {
        return IMTERMEDIATE;
    }

    public String getCOLLAGE() {
        return COLLAGE;
    }

    public String getUNIVERSITY() {
        return UNIVERSITY;
    }

    public String getAFTER_UNIVERSITY() {
        return AFTER_UNIVERSITY;
    }

    public String getRECEPTIONIST() {
        return RECEPTIONIST;
    }

    public String getSTAFF() {
        return STAFF;
    }

    public String getEXPERT() {
        return EXPERT;
    }

    public static String getMONITORING() {
        return MONITORING;
    }

    public String getMANAGE() {
        return MANAGE;
    }

    public String getCEO() {
        return CEO;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Full Name:'" + name + '\'' +
                ", Date = " + date +
                ", Gender = '" + gender + '\'' +
                ", IdCard = " + idCard +
                ", PhoneNumber = " + phoneNumber +
                ", Email = '" + email + '\'' +
                ", Level ='" + level + '\'' +
                ", Standard = '" + Standard + '\'' +
                ", Salary = " + salary +'\'' +
                '}';
    }
}

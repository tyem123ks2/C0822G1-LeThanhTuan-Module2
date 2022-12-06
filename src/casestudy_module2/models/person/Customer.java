package casestudy_module2.models.person;

import java.util.Date;

public class  Customer extends Person {
    public String idCustomer;
    public String rank;
    public String address;
    public static final String DIAMOND = "Diamond";
    public static final String PLATINIUM = "Platinium";
    public static final String GOLD = "Gold";
    public static final String SILVER = "Silver";
    public static final String MEMBER = "Member";

    public Customer() {

    }

    public Customer(String name, String date, String gender, String idCard, String phoneNumber, String email, String idCustomer, String rank, String address) {
        super(name, date, gender, idCard, phoneNumber, email);
        this.idCustomer = idCustomer;
        this.rank = rank;
        this.address = address;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static String getDIAMOND() {
        return DIAMOND;
    }

    public static String getPLATINIUM() {
        return PLATINIUM;
    }

    public static String getGOLD() {
        return GOLD;
    }

    public static String getSILVER() {
        return SILVER;
    }

    public static String getMEMBER() {
        return MEMBER;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer='" + idCustomer + '\'' +
                ", rank='" + rank + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", gender='" + gender + '\'' +
                ", idCard=" + idCard +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}

package IdentifyMethod;

public class Customer {
    public int idCard;
    public String firstName;
    public String lastName;
    public String phoneNumber;

    public Customer(int idCard, String firstName, String lastName, String phoneNumber) {
        this.idCard = idCard;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public int getIdCard(){
        return idCard;
    };
//    public String getFirstName()
//            ;
//    public String getLastName()
//            ;
}

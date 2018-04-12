package dalsanto_schooldudes;

//Matthew Dal Santo
//ITDEV140
//Assignment 7

abstract public class Person {
    
    private String firstName;
    public String getFirstName() { return firstName; }
    public void setFirstName(String s) { firstName = s; }
    
    private String lastName;
    public String getLastName() { return lastName; }
    public void setLastName(String s) { lastName = s; }    
    
    private String streetAddress;
    public String getStreetAddress() { return streetAddress; }
    public void setStreetAddress(String s) { streetAddress = s; }    
    
    private String zipCode;
    public String getZipCode() { return zipCode; }
    public void setZipCode(String s) { zipCode = s; }
    
    private String phoneNumber;
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String s) { phoneNumber = s; }    
    
    abstract void displayAll();    
}

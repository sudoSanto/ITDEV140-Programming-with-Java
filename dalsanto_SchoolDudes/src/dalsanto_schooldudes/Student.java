package dalsanto_schooldudes;

//Matthew Dal Santo
//ITDEV140
//Assignment 7

public class Student extends Person{
    
    private String major;
    public String getMajor() { return major; }
    public void setMajor(String s) { major = s; }
    
    private double gpa;
    public double getGPA() { return gpa; }
    public void setGPA(double d) { gpa = d; }


    @Override
    void displayAll()
    {
        System.out.println("\n\tName: " + getFirstName() + 
                " " +
                getLastName());
        System.out.println("\tAddress: " + getStreetAddress());
        System.out.println("\tZip Code: " + getZipCode());
        System.out.println("\tPhone Number: " + getPhoneNumber());
        System.out.println("\tMajor: " + getMajor());
        System.out.println("\tGPA: " + getGPA());
    }
}

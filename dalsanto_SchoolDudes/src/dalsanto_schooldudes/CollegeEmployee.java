package dalsanto_schooldudes;

//Matthew Dal Santo
//ITDEV140
//Assignment 7

public class CollegeEmployee extends Person{
    
    private String ssn;
    public String getSSN() { return ssn; }
    public void setSSN(String s) { ssn = s; }
    
    private String department;
    public String getDepartment() { return department; }
    public void setDepartment(String s) { department = s; }

    private double salary;
    public double getSalary() { return salary; }
    public void setSalary(double d) { salary = d; }

    @Override
    void displayAll()
    {
        System.out.println("\n\tName: " + getFirstName() + 
                " " +
                getLastName());
        System.out.println("\tAddress: " + getStreetAddress());
        System.out.println("\tZip Code: " + getZipCode());
        System.out.println("\tPhone Number: " + getPhoneNumber());
        System.out.println("\tSocial Security Number: " + getSSN());
        System.out.println("\tDepartment: " + getDepartment());
        System.out.println("\tSalary: " + getSalary());
    }
}

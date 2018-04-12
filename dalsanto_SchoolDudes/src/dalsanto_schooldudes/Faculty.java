package dalsanto_schooldudes;

//Matthew Dal Santo
//ITDEV140
//Assignment 7

public class Faculty extends Person{

    private Boolean tenured;
    public Boolean getTenured() { return tenured; }
    public void setTenured(Boolean b) { tenured = b; }
    
    @Override
    void displayAll()
    {
        System.out.println("\n\tName: " + getFirstName() + 
                " " +
                getLastName());
        System.out.println("\tAddress: " + getStreetAddress());
        System.out.println("\tZip Code: " + getZipCode());
        System.out.println("\tPhone Number: " + getPhoneNumber());
        System.out.print("\tTenured? ");
        if (getTenured())
            System.out.print("Yes\n");
        else
            System.out.print("No\n");
    }
}

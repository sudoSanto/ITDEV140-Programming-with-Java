
//The app must have at least six classes including the classes listed below
//Correctly apply names to the package, classes, and files.
//Controller
//Account
//Introduction

package dalsanto_midterm;

//Matthew Dal Santo
//ITDEV140
//Midterm Exam

//Create an Account class.  The account class will be the superclass.
//Account class should have the following properties that can be used by subclasses:     
//private String customerName;
//private String accountType;
//private double interestRate;
//private String dateCreated;
//private double accountBalance; 
public class Account {
    
    public Account(String cCustomerName,
        String cAccountType,
        double cInterestRate,
        String cDateCreated,
        double cAccountBalance){
        customerName = cCustomerName;
        accountType = cAccountType;
        interestRate = cInterestRate;
        dateCreated = cDateCreated;
        accountBalance = cAccountBalance;
    }
    
    //All should have get / set methods.
    private String customerName = "";
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String str) { customerName = str; }
    
    private String accountType = "";
    public String getAccountType() { return accountType; }
    public void setAccountType(String str) { accountType = str; }

    private double interestRate = 0;
    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double x) { interestRate = x; }
    
    private String dateCreated = "";
    public String getDateCreated() { return dateCreated; }
    public void setDateCreated(String str) { dateCreated = str; }
    
    private double accountBalance = 0;
    public double getAccountBalance() { return accountBalance; }
    public void setAccountBalance(double x) { accountBalance = x; }
    
    //Account class should have the following methods to be used by subclasses: 
    //calculateInterest() - that will calculate interest based on the interest
    //rate for each class. This method should return a double with the
    //calculated interest rate
    public double calculateInterest() {
        //calculateInterest() from Account class should return a double from
        //your interest calculation based on Interest rate from the Account
        //object.
        //Use the following calculation for interest earned: 
        //interestEarned = InterestRate * balance;
        return (interestRate * accountBalance);
    }
    
    //Account class should have the following methods to be used by subclasses:
    //getUniqueMessage() - that will display a unique message based on which
    //class it is located and return a string. 
    public String getUniqueMessage() {
        //Example: getUniqueMessage() from the Account class should return a
        //message within a string that says “This is a bank account”. 
        return "This is a bank account";
    }
}

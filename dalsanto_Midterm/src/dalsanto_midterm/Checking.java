package dalsanto_midterm;

//Matthew Dal Santo
//ITDEV140
//Midterm Exam

//Create two subclasses named Checking and MoneyMarket.
public class Checking extends Account{
    
    //Add a unique property to the Checking account class named
    //hasOverdraftProtection.  This should be a boolean. Set it to true. Code
    //an if else statement within your application that displays “yes” if the
    //checking account has overdraft protection.
    //Instructions did not direct a "no" response so one was not coded.
    //Property is set in constructor and initially set true as per instructions.
    private boolean hasOverdraftProtection = true;
    public String getHasOverdraftProtection() {
        if (hasOverdraftProtection) { return "yes"; }
        else { return ""; }
    }
    
    //Each Account subclass should have a constructor that sets the properties
    //for each new object created with unique values for each instance.
    public Checking(String customerName,
        String accountType,
        double interestRate,
        String dateCreated,
        double accountBalance,
        boolean hasOverdraftProtection){
        super(customerName,
            accountType,
            interestRate,
            dateCreated,
            accountBalance);
    }
    
    //The subclasses of Account should each override the calculateInterest()
    //method.
    @Override
    public double calculateInterest() {
        //calculateInterest() within Checking subclass should return a double
        //with your interest calculation based on checking account object’s
        //interest rate..
        //Use the following calculation for interest earned: 
        //interestEarned = InterestRate * balance;
        return (super.getInterestRate() * super.getAccountBalance());
    }
    
    //The subclasses of Account should each override the displayUniqueMessage
    //method
    @Override
    public String getUniqueMessage() {
        //getUniqueMessage within the Checking account subclass should return
        //a message within a string that says ”This is a checking account”.
        return "This is a checking account";
    }    
}

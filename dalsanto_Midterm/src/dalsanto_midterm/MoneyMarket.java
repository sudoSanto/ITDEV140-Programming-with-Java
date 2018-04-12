package dalsanto_midterm;

//Matthew Dal Santo
//ITDEV140
//Midterm Exam

//Create two subclasses named Checking and MoneyMarket.
public class MoneyMarket extends Account{

    //Add a unique property to the MoneyMarket class called hasMinimumBalance.
    //This should be a boolean. Set it false.  Code an if else statement within
    //your application that displays “no” in the output if the MoneyMarket
    //account does not require a minimum balance.
    //Instructions did not direct a "yes" response so one was not coded.
    //Property is set in constructor and initially set false as per instructions.
    private boolean hasMinimumBalance = false;
    public String getHasMinimumBalance() {
        if (!hasMinimumBalance) { return "no"; }
        else { return ""; }
    }
    
    //Each Account subclass should have a constructor that sets the properties
    //for each new object created with unique values for each instance.    
    public MoneyMarket(String customerName,
        String accountType,
        double interestRate,
        String dateCreated,
        double accountBalance,
        boolean hasMinimumBalance){
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
        //calculateInterest() within MoneyMarket subclass should return a
        //double with your interest calculation based on the money market
        //object’s interest rate.
        //Use the following calculation for interest earned: 
        //interestEarned = InterestRate * balance;
        return (super.getInterestRate() * super.getAccountBalance());
    }

    //The subclasses of Account should each override the displayUniqueMessage
    //method
    @Override
    public String getUniqueMessage() {
        //getUniqueMessage() method within the MoneyMarket class should
        //return a message within a string that says, “This is a Money Market
        //account.
        return "This is a Money Market account";
    }
}

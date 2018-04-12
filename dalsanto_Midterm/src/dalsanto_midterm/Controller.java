
//The app must have at least six classes including the classes listed below
//Correctly apply names to the package, classes, and files.
//Controller
//Account
//Introduction

package dalsanto_midterm;
import java.text.DecimalFormat;

//Matthew Dal Santo
//ITDEV140
//Midterm Exam

//Create a controller class that creates an object of the Account. Within the
//controller class create objects of each of the Account subclasses.
public class Controller {
    Account account = new Account("Gal Smith",
            "Bank One Premium",
            0.05,
            "2018-03-13",
            110.00);
    
    Account checking = new Checking("Tammy Townsel",
            "Checking Advantage",
            0.02,
            "2018-03-13",
            2010.00,
            true);
    
    Account moneyMarket = new MoneyMarket("Dude Dudeboy",
            "Bank of US Money Market",
            0.03,
            "2018-03-13",
            3010.00,
            false);
    
    public void runApp() {
        Introduction intro = new Introduction();
        intro.DisplayIntroduction();
        showAccounts();
    }
    
    //The controller class will have a method that will display the property
    //values for all of the objects created named: showAccounts();   This
    //method should display the properties as the sample output appears below: 
    private void showAccounts() {
        //Money values should display with 2 decimal places.
        DecimalFormat cFormat = new DecimalFormat("###,###.00");
        
        //Account super
        System.out.println("\n\nCustomer Name: " + account.getCustomerName());
        System.out.println("Account Type: " + account.getAccountType());
        System.out.println("Date Opened: " + account.getDateCreated());
        System.out.println("Interest Rate: " + cFormat.format(account.getInterestRate()));
        System.out.println("Account Balance: " + cFormat.format(account.getAccountBalance()));
        System.out.println("Unique Message: " + account.getUniqueMessage());
        System.out.println("Interest Earned: " + cFormat.format(account.calculateInterest()));
        
        //Checking subclass
        System.out.println("\n\nCustomer Name: " + checking.getCustomerName());
        System.out.println("Account Type: " + checking.getAccountType());
        System.out.println("Date Opened: " + checking.getDateCreated());
        System.out.println("Interest Rate: " + cFormat.format(checking.getInterestRate()));
        System.out.println("Account Balance: " + cFormat.format(checking.getAccountBalance()));
        System.out.println("Has OverDraft Protection: " + ((Checking) checking ).getHasOverdraftProtection());
        System.out.println("Unique Message: " + checking.getUniqueMessage());
        System.out.println("Interest Earned: " + cFormat.format(checking.calculateInterest()));
        
        //MoneyMarket subclass
        System.out.println("\n\nCustomer Name: " + moneyMarket.getCustomerName());
        System.out.println("Account Type: " + moneyMarket.getAccountType());
        System.out.println("Date Opened: " + moneyMarket.getDateCreated());
        System.out.println("Interest Rate: " + cFormat.format(moneyMarket.getInterestRate()));
        System.out.println("Account Balance: " + cFormat.format(moneyMarket.getAccountBalance()));
        System.out.println("Requires Minimum Balance: " + ((MoneyMarket) moneyMarket ).getHasMinimumBalance());
        System.out.println("Unique Message: " + moneyMarket.getUniqueMessage());
        System.out.println("Interest Earned: " + cFormat.format(moneyMarket.calculateInterest()));
    }
}

//Sample Output:

//run:

//Customer Name: Gal Smith
//Account Type: Bank One Premium
//Date Opened: 2018-03-13
//Interest Rate: .05
//Account Balance: 110.00
//Unique Message: This is an Account
//Interest Earned: 5.50

//Customer Name: Tammy Townsel
//Account Type: Checking Advantage
//Date Opened: 2018-03-13
//Interest Rate: .02
//Account Balance: 2,010.00
//Has OverDraft Protection: yes
//Unique Message: This is a checking account
//Interest Earned: 40.20

//Customer Name: Dude Dudeboy
//Account Type: Bank of US Money Market
//Date Opened: 2018-03-13
//Interest Rate: .03
//Account Balance: 3,010.00
//Requires Minimum Balance: no
//Unique Message: This is a Money Market account
//Interest Earned: 90.30

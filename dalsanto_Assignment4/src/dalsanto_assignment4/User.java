package dalsanto_assignment4;
import java.util.Scanner;

//Matthew Dal Santo
//ITDEV140
//Assignment 4

public class User {
    
    Scanner input = new Scanner(System.in);
    
    private String userName = "";
    public void SetUserName(String setName) { userName = setName; }
    public String GetUserName() { return userName; }
    
    private String phoneNumber = "";
    public void SetPhoneNumber(String setPhone) { phoneNumber = setPhone; }
    public String GetPhoneNumber() { return phoneNumber; }

    private int userID = 0;
    public void SetUserID(int setID) { userID = setID; }
    public int GetUserID() { return userID; }

    private double userBalance = 0;
    public void SetUserBalance(double setBalance) { userBalance = setBalance; }
    public double GetUserBalance() { return userBalance; }
    
    private double userPay = 0;
    public void SetUserPay(double setPay) { userPay = setPay; }
    public double GetUserPay() { return userPay; }
    
    private String userStatus = "";
    public void SetUserStatus(String setStatus) { userStatus = setStatus; }
    public String GetUserStatus() { return userStatus; }    
    
    //Create a User class that accepts user input for a gym membership.  In the user class a
    //user should be able to enter information to create a new membership.  The User will be
    //able to input customer's name, phone number, new membership id number, and
    //membership balance.
    User(int EorP)
    {
        if( EorP == 1 ) { SetUserStatus("E"); }
        if( EorP == 2 ) { SetUserStatus("P"); }

        System.out.println("Customer Name: ");
        SetUserName(input.nextLine());
        System.out.println("Customer Phone Number: ");
        SetPhoneNumber(input.nextLine());
        System.out.println("Customer ID Number: ");
        while (!input.hasNextInt())
        {
            System.out.println("That is not a valid number.");
            System.out.println("Customer ID Number: ");
            input.next();
        }
        SetUserID(input.nextInt());
        System.out.println("Customer Account Balance: ");
        while (!input.hasNextDouble())
        {
            System.out.println("That is not a valid number.");
            System.out.println("Customer Account Balance: ");
            input.next();
        }
        SetUserBalance(input.nextDouble());
        
        if ( EorP == 2 )
        {
            System.out.println("Customer Payment Amount: ");
            while (!input.hasNextDouble())
            {
                System.out.println("That is not a valid number.");
                System.out.println("Customer Payment Amount: ");
                input.next();
            }
            SetUserPay(input.nextDouble());
            SetUserBalance(GetUserBalance() - GetUserPay());
        }        
    }
}

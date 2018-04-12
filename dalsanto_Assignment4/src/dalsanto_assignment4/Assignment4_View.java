package dalsanto_assignment4;
import java.util.Scanner;

//Matthew Dal Santo
//ITDEV140
//Assignment 4

public class Assignment4_View {

    public int Display_Intro()
    {
        System.out.println("\t Get Swole!  Gym Membership Program");
        return EnrollOrPay();
    }
    
    public int EnrollOrPay()
    {
        Scanner input = new Scanner(System.in);
        String userChoice;
        //1 = E, 2 = P
        int EorP = 0;
        
        do{
            System.out.println("\nEnroll(E) or Pay(P): ");
            userChoice = input.nextLine();

            if( userChoice.isEmpty()) { EorP = 0; userChoice = "X"; }
            else{ userChoice = userChoice.toLowerCase(); }

            if( userChoice.charAt(0) == 'e' ) { EorP = 1; }
            else if( userChoice.charAt(0) == 'p' ) { EorP = 2; }
        }while( EorP <= 0 ); 
        
        return EorP;
    }

    public void DisplayUser(String name, String status, String phoneNumber, int userID, double balance, double pay)
    {        
        System.out.println("\nCustomer Name: " + name);
        System.out.println("Customer Status: " + status);
        System.out.println("Customer Phone Number: " + phoneNumber);
        System.out.println("Customer ID: " + userID);
        if (pay > 0){ System.out.printf("Amount Paid: %.2f\n", pay); }
        System.out.printf("Balance: %.2f\n", balance);
    }
}

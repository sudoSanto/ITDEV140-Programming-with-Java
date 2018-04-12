package dalsanto_ofakind;
import java.util.Scanner;

//Matthew Dal Santo
//ITDEV140
//Assignment 3

public class OfAKind_View {
        
    Scanner input = new Scanner(System.in);
    
    public void Display_Intro()
    {
        System.out.println("\t Of A Kind Dice Game!");
        System.out.println("\nEach round you and the Computer will roll 5 die against each other.");
        System.out.println("The player with the most matching die wins the round.");
        System.out.println("Should both the User and the Computer have the same amount of");
        System.out.println("  matching die, the player with the highest dice value wins the round.");
        System.out.println("Should both the User and the Computer have matching multiples of equal value,");
        System.out.println("  neither win and no points are awarded for that round.");
        System.out.println("After 10 rounds, the player that won the most rounds wins the match.\n");
    }
    
    public void DisplayRound(int round, int p0, int p1, int p2, int p3, int p4, int c0, int c1, int c2, int c3, int c4)
    {
        System.out.println("Round: \t" + round);
        System.out.println("User: \t\t" + p0 + " - " + p1 + " - " + p2 + " - " + p3 + " - " + p4);
        System.out.println("Computer: \t" + c0 + " - " + c1 + " - " + c2 + " - " + c3 + " - " + c4);
    }
    
    public void Score(int pScore, int pMatch, int pHigh, int cScore, int cMatch, int cHigh)
    {
        //PLAYER Score
        if(pMatch > 0)
        {
            System.out.println("\nUser had " + pMatch + " dice with a value of " + pHigh);
        }
        else
        {
            System.out.println("\nUser had no dice multiples.");
        }
        //COMPUTER Score
        if(cMatch > 0)
        {
            System.out.println("Computer had " + cMatch + " dice with a value of " + cHigh);
        }
        else
        {
            System.out.println("Computer had no dice multiples.");
        }
        //Total Score for match.
        System.out.println("\nWins: \t\tUser: " + pScore + "\t\tComputer: " + cScore);
    }
    
    public void PressEnter()
    {
        //Acts as a pause between dice rolls.  Only accepts the enter key as input.
        System.out.println("\nPress Enter key to roll again...");
        try
        {
            System.in.read();
        }
        catch(Exception e) {}
    }
    
    public void EndMatch(int pScore, int cScore)
    {
        if(pScore > cScore) { System.out.println("\nYou won!"); }
        else if(pScore < cScore) { System.out.println("\nThe Computer won!  Better luck next time."); }
        else if(pScore == cScore) { System.out.println("\nThe match ended in a tie!"); }
    }
    
    public boolean PlayAgain()
    {
        String userChoice;
        boolean userBool;
        
        System.out.println("Would you like to play again?(y/n)");
        userChoice = input.nextLine();

        //Resets the game if the User types anything starting with the 'y' char.
        if(userChoice.isEmpty()) { userBool = false; }
        else
        {
            userChoice = userChoice.toLowerCase();
            if(userChoice.charAt(0) == 'y') { userBool = true; }
            else { userBool = false; }
        }
        return userBool;
    }    
}

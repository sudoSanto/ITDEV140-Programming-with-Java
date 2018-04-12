package dalsanto_guesstheword;
import java.util.Scanner;

//Matthew Dal Santo
//ITDEV140
//Assignment 5

public class GuessTheWord_View {

    GuessTheWord_Sound WinSound = new GuessTheWord_Sound("src\\dalsanto_guesstheword\\win.wav");    
    GuessTheWord_Sound LoseSound = new GuessTheWord_Sound("src\\dalsanto_guesstheword\\lose.wav");

    Scanner input = new Scanner(System.in);    
    String nextPrompt = "Pick a letter or press enter to quit: ";
            
    public void DrawIntro()
    {
        System.out.println("\t Guess The Word!");
        System.out.println("\nEach round you can guess a letter to complete the word.");
        System.out.println("You have seven tries to guess the word or you lose!");
        System.out.println("Good luck!\n\n");
    }
    
    //i = attempts
    public void DrawHangman(String hangman[][], int i,
            String word, String lettersGuessed)
    {
        ClearTerminal();
        DrawIntro();

        System.out.println("\t /---\\");
        System.out.println("\t" + hangman[i][0] + "  |   Guess the Word: " + word);
        System.out.println("\t" + hangman[i][1] + "  |");
        System.out.println("\t" + hangman[i][2] + "  |   Letters Guessed: " + lettersGuessed);
        System.out.println("\t" + hangman[i][3] + "  |");
        System.out.println("\t------   Attempts Remaining: " + (7 - i));
        System.out.println("");
    }
    
    public String DrawGetGuess(String lettersGuessed)
    {
        String userInput;
        char[] tempChar;
        
        System.out.print(nextPrompt);
        //reset nextPrompt to default value
        nextPrompt = "Pick a letter or press enter to quit: ";
        userInput = input.nextLine();
        
        //Check for Carriage Return
        if (userInput != null && !userInput.isEmpty() && userInput.length() > 0){
            userInput = userInput.substring(0, 1).toUpperCase();
            tempChar = userInput.toCharArray();
            //Check if userInput is a Letter
            if (Character.isLetter(tempChar[0])){
                //Check if userInput has been entered prior
                for (int i = 0; i < lettersGuessed.length(); i++){
                    if (lettersGuessed.substring(i, i+1).equals(userInput)){
                        nextPrompt = "You've already picked that letter.  Pick a different letter: ";
                        userInput = " ";
                    }
                }
            }
            else{
                nextPrompt = "That was not a letter.  Pick a letter: ";
                userInput = " ";
            }
        }
        else { userInput = "!"; }
        //A userInput value of " " will deduct no available attempts and indicates incorrect input.
        //A userInput value of "!" indicates a carraige return which also prompts the user if they
        //want to exit.
        //Any other input is a valid guess and is passed along a single string uppercase letter.
        return userInput;
    }
    
    public Boolean DrawExit()
    {
        String userInput;
        boolean tempBool;

        System.out.print("\nAre you sure you want to exit?(y/n): ");
        userInput = input.nextLine();

        if(userInput.isEmpty()) { tempBool = false; }
        else
        {
            userInput = userInput.toUpperCase();
            if(userInput.charAt(0) == 'Y') { tempBool = true; }
            else { tempBool = false; }
        }
        return tempBool;
    }

    public Boolean PlayAgain(int attempts)
    {
        String userInput;
        boolean tempBool;

        if (attempts < 7) { 
            System.out.println("Huzzah!  You won!"); 
            WinSound.play();
        }
        else { 
            System.out.println("Too bad!  You lost!");
            LoseSound.play();
        }
        
        System.out.print("\nWould you like to play again?(y/n): ");
        userInput = input.nextLine();

        if(userInput.isEmpty()) { tempBool = false; }
        else
        {
            userInput = userInput.toUpperCase();
            if(userInput.charAt(0) == 'Y') { tempBool = true; }
            else { tempBool = false; }
        }
        return tempBool;
    }
    
    //ClearTerminal is a bit of a workaround to NetBeans' IDE console.
    private void ClearTerminal() { for(int i = 0; i < 1000; i++) { System.out.println(); } }
}

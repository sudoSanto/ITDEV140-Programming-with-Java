package dalsanto_guesstheword;
import java.util.concurrent.ThreadLocalRandom;

//Matthew Dal Santo
//ITDEV140
//Assignment 5

public class GuessTheWord_Model {

    private Boolean runGame = true;
    public Boolean GetRunGame() { return runGame; };
    public void SetRunGame(Boolean i) { runGame = i; };
    
    private int attempts = 0;
    public int GetAttempts() { return attempts; }
    public void SetAttempts(int i) { attempts = i; }
    
    private String guess = "";
    public String GetGuess() { return guess; }
    public void SetGuess(String str) { guess = str; }
    
    private String[] word = {
        "NORTH",
        "CONTINENTAL",
        "PACIFIC",
        "WEST",
        "FLORIDA",
        "CANYON",
        "EAST",
        "ARIZONA",
        "WISCONSIN",
        "SOUTH"};
    public String GetWord()
    { 
        int rnd = ThreadLocalRandom.current().nextInt(0, 10);
        return word[rnd];
    }
    
    public String[][] hangman = {
        {"   ", "   ", "   ", "   "},
        {" O ", "   ", "   ", "   "},
        {" O ", " | ", "   ", "   "},
        {" O ", "/| ", "   ", "   "},
        {" O ", "/|\\", "   ", "   "},
        {" O ", "/|\\", " | ", "   "},
        {" O ", "/|\\", " | ", "/  "},
        {" O ", "/|\\", " | ", "/ \\"}};
    
    public Boolean CheckExit()
    {
        Boolean tempBool = false;
        if (guess.equals("!")) { tempBool = true; }
        return tempBool;
    }
    
    public Boolean CheckGuess(String word)
    {
        Boolean tempBool = false;
        if (!guess.equals(" ") || !guess.equals("!")) {
            for (int i = 0; i < word.length(); i++){
                if (word.substring(i, i+1).equals(guess)){
                    tempBool = true;
                }
            }
            if (tempBool == false) { attempts++; }
        }
        return tempBool;
    }
        
    public Boolean CheckWin(String word, String guessedWord)
    {
        if (word.equals(guessedWord)) { return true; }
        else { return false; }
    }
}

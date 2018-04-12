package dalsanto_guesstheword;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

//Matthew Dal Santo
//ITDEV140
//Assignment 5

public class GuessTheWord_Word {
    
    GuessTheWord_Sound CorrectSound = new GuessTheWord_Sound("src\\dalsanto_guesstheword\\correct.wav");
    
    //Convert the passed String to a ListArray.  Also add an equilent number
    //of indexes to a lettersCorrect ListArray with the "_" value.  This primes
    //a master word and a pseudo-blank word.
    public GuessTheWord_Word(String str)
    {
        for (int i = 0; i < str.length(); i++) 
        { 
            word.add(str.substring(i, i+1));
            lettersCorrect.add("_");
        }
    }
            
    private ArrayList<String> word = new ArrayList<String>();
    public String GetWord() { return String.join("", word); }

    private ArrayList<String> lettersCorrect = new ArrayList<String>(); 
    public String GetLettersCorrect() { return String.join("", lettersCorrect); }
    public String GetDrawLettersCorrect() { return String.join(" ", lettersCorrect); }
    
    private ArrayList<String> lettersGuessed = new ArrayList<String>();
    public void AddLettersGuessed(String str) { lettersGuessed.add(str); }
    public String GetLettersGuessed() { return String.join("", lettersGuessed); }
    public String GetDrawLettersGuessed() { return String.join(" ", lettersGuessed); }
    
    public void CorrectGuess(String guess)
    {
        for (int i = 0; i < word.size(); i++){ 
            if (word.get(i).equals(guess)){ 
               lettersCorrect.set(i, guess);
               CorrectSound.play();
               try { TimeUnit.MILLISECONDS.sleep(100); }
               catch(InterruptedException e) { }
            }
        }
        lettersGuessed.add(guess);
    }
}

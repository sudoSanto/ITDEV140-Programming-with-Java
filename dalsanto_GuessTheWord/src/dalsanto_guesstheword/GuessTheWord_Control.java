package dalsanto_guesstheword;

//Matthew Dal Santo
//ITDEV140
//Assignment 5

public class GuessTheWord_Control {
     
    GuessTheWord_Model Model = new GuessTheWord_Model();
    GuessTheWord_View View = new GuessTheWord_View();
    GuessTheWord_Sound IncorrectSound = new GuessTheWord_Sound("src\\dalsanto_guesstheword\\incorrect.wav");
    
    public void RunGame()
    {
        do
        {
            GameLoop();
            
            //Prompt if user wants to play again if they haven't forced an exit
            if (!Model.CheckExit()){
                Model.SetRunGame(View.PlayAgain(Model.GetAttempts()));
            }
            else { Model.SetRunGame(false); }
        }while(Model.GetRunGame());
    }
    
    private void GameLoop()
    {
        //Create a new Word object when this method is called.  When a Word object
        //is created, Model.Getword passes a random word from an array of 10.
        GuessTheWord_Word Word = new GuessTheWord_Word(Model.GetWord());
        
        //The attempts value is used to dertermine player victory.  As such it must
        //be used outside the GameLoop method to avoid recursion and cannot be 
        //contained within the Word object.  It must be reset each new
        //time this method is called.
        Model.SetAttempts(0);
        
        do
        {
            //Draw the board
            View.DrawHangman(Model.hangman, Model.GetAttempts(),
                Word.GetDrawLettersCorrect(), Word.GetDrawLettersGuessed());
            
            //Get guess
            Model.SetGuess(View.DrawGetGuess(Word.GetLettersGuessed()));
            
            //Check for exit
            if (Model.CheckExit()){ 
                //Check if player really wants to exit.  If they dont, instead change
                //the input to " " skipping the exit sequence.
                if (!View.DrawExit()){
                    Model.SetGuess(" "); 
                } 
            }
            //Check if the guessed letter matches a letter in the word
            else if (Model.CheckGuess(Word.GetWord())){ Word.CorrectGuess(Model.GetGuess()); }
            else{ 
                Word.AddLettersGuessed(Model.GetGuess());
                IncorrectSound.play();
            }
        
        }while(Model.GetAttempts() < 7 && 
            !Model.CheckWin(Word.GetWord(), Word.GetLettersCorrect()) &&
            !Model.GetGuess().equals("!"));
        
        //Final Draw
        View.DrawHangman(Model.hangman, Model.GetAttempts(),
                Word.GetDrawLettersCorrect(), Word.GetDrawLettersGuessed());
    }
}

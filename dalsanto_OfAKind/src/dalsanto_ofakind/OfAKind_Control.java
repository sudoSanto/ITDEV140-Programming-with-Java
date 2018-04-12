package dalsanto_ofakind;

//Matthew Dal Santo
//ITDEV140
//Assignment 3

public class OfAKind_Control {

    OfAKind_Model Model = new OfAKind_Model();
    OfAKind_View View = new OfAKind_View();
    
    public void RunApp()
    {
        View.Display_Intro();
        
        //Main App Loop
        do{
        Model.RollDice();
        
        View.DisplayRound(Model.Round(), Model.GetPDice(0), Model.GetPDice(1), Model.GetPDice(2), Model.GetPDice(3), Model.GetPDice(4),
                Model.GetCDice(0), Model.GetCDice(1), Model.GetCDice(2), Model.GetCDice(3), Model.GetCDice(4));
        
        View.Score(Model.PScore(), Model.PMatch(), Model.PHigh(), 
                Model.CScore(), Model.CMatch(), Model.CHigh());
        
        if(Model.Round() > 9) 
        {
            View.EndMatch(Model.PScore(), Model.CScore());
            Model.SetRunApp(View.PlayAgain());
            Model.ResetGame();
        }
        else { View.PressEnter(); }
        
        }while(Model.GetRunApp());   
    }
}
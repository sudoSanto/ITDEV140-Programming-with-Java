package dalsanto_ofakind;
import java.util.Random;

//Matthew Dal Santo
//ITDEV140
//Assignment 3

public class OfAKind_Model {
    
    //PLAYER Dice Array
    private int[] pDice = new int[5];
    public int GetPDice(int i) { return pDice[i]; }
    //COMPUTER Dice Array
    private int[] cDice = new int[5];
    public int GetCDice(int i) { return cDice[i]; }
    
    //Used for counting dice multiples.
    private int[] pCount = new int[7];
    private int[] cCount = new int[7];
    
    //Main Control loop boolean.
    private boolean runApp = true;
    public void SetRunApp(boolean cont) { runApp = cont; }
    public boolean GetRunApp() { return runApp; }

    //Misc Variables
    private int countPNum;
    private int countCNum;
    private int pHigh;
    public int PHigh() { return pHigh; }
    private int cHigh;
    public int CHigh() { return cHigh; }
    private int pMatch;
    public int PMatch() { return pMatch; }
    private int cMatch;
    public int CMatch() { return cMatch; }    
    private int pScore;
    public int PScore() { return pScore; }
    private int cScore;
    public int CScore() { return cScore; }
    private int round = 0;
    public int Round() { return round; }
        
    public void RollDice()
    {
        //re-instantiate variables
        Random r = new Random();
        for(int i = 0; i < pCount.length; i++) { pCount[i] = 0; }
        for(int i = 0; i < cCount.length; i++) { cCount[i] = 0; }
        pHigh = 0;
        cHigh = 0;
        pMatch = 0;
        cMatch = 0;
        
        //Roll PLAYER Dice
        for(int i = 0; i < pDice.length; i++)
        {
            pDice[i] = r.nextInt((6 - 1) + 1) + 1;
        }
        //Roll COMPUTER Dice
        for(int i = 0; i < cDice.length; i++)
        {
            cDice[i] = r.nextInt((6 - 1) + 1) + 1;
        }
        
        //PLAYER - Count total iterations of each index's occurance in pCount.
        for(int i = 0; i < pDice.length; i++)
        {
            countPNum = pDice[i];
            pCount[countPNum]++;
        }
        //PLAYER - Find the highest number over 2 in occurances.
        for(int i = 0; i < pCount.length; i++)
        {
            if(pCount[i] >= 2 && pCount[i] >= pMatch)
            {
                pMatch = pCount[i];
                pHigh = i;
            }
        }
        
        //COMPUTER - Count total iterations of each index's occurance in pCount.
        for(int i = 0; i < cDice.length; i++)
        {
            countCNum = cDice[i];
            cCount[countCNum]++;
        }
        //COMPUTER - Find the highest number over 2 in occurances.
        for(int i = 0; i < cCount.length; i++)
        {
            if(cCount[i] >= 2 && cCount[i] >= cMatch)
            {
                cMatch = cCount[i];
                cHigh = i;
            }
        }
        
        if(pMatch > cMatch) { pScore++; }
        else if(pMatch < cMatch) { cScore++; }
        else if(pMatch == cMatch && pHigh > cHigh) { pScore++; }
        else if(pMatch == cMatch && pHigh < cHigh) { cScore++; }
        
        round++;
    }
    
    public void ResetGame()
    {
        round = 0;
        pScore = 0;
        cScore = 0;
    }
    
}

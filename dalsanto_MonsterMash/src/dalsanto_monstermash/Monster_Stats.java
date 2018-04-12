package dalsanto_monstermash;
import java.util.Random;

//Matthew Dal Santo
//ITDEV140
//Assignment 6

public class Monster_Stats {
    
    //Number of Monsters
    private int NOM = 6;
    public int GetNOM() { return NOM; }

    private String[] monsterType = new String[NOM];
    public String GetType(int i) { return monsterType[i]; }
    
    private String[] monsterName = new String[NOM];
    public String GetName(int i) { return monsterName[i]; }
        
    private int[] maxScareFactor = new int[NOM];
    public int GetMaxScareFactor(int i) { return maxScareFactor[i]; }
    
    private int[] minScareFactor = new int[NOM];
    public int GetMinScareFactor(int i) { return minScareFactor[i]; }
    
    private int[] maxSize = new int[NOM];
    public int GetMaxSize(int i) { return maxSize[i]; }
    
    private int[] minSize = new int[NOM];
    public int GetMinSize(int i) { return minSize[i]; }
    
    private int[] maxSpeed = new int[NOM];
    public int GetMaxSpeed(int i) { return maxSpeed[i]; }
    
    private int[] minSpeed = new int[NOM];
    public int GetMinSpeed(int i) { return minSpeed[i]; }
    
    private String[] winLine = new String[NOM];
    public String GetWinLine(int i) { return winLine[i]; }
    
    public int GetScareFactor(int i){
        Random rnd = new Random();
        return rnd.nextInt((maxScareFactor[i] - minScareFactor[i])+1) + minScareFactor[i];
    }
    
    public int GetSize(int i){
        Random rnd = new Random();
        return rnd.nextInt((maxSize[i] - minSize[i])+1) + minSize[i];
    }
    
    public int GetSpeed(int i){
        Random rnd = new Random();
        return rnd.nextInt((maxSpeed[i] - minSpeed[i])+1) + minSpeed[i];
    }

    public Monster_Stats(){
        String[] iType = { "Classic",
            "Classic",
            "Classic",
            "Fantasy",
            "Fantasy",
            "Fantasy"
            };
        String[] iName = { "Vampire     ",
            "Werewolf    ",
            "Frankenstein",
            "Beholder    ",
            "Mind Flayer ",
            "Kobold      "
            };
        int iMaxScareFactor[] = { 100, 100, 100, 100, 100, 100 };
        int iMinScareFactor[] = { 40, 20, 10, 50, 30, 10 };
        int iMaxSize[] = { 6, 8, 8, 15, 6, 4 };
        int iMinSize[] = { 4, 5, 8, 6, 4, 2 };
        int iMaxSpeed[] = { 8, 9, 3, 2, 5, 10 };
        int iMinSpeed[] = { 3, 4, 1, 1, 2, 1 };
        String[] iWinLine = { "The Vampire won!  He must have been thirsty!",
            "The Werewolf won by a hair!",
            "Frankenstein won!  Putting on the Ritz!",
            "The Beholder won!  He saw his competition from a mile away!",
            "The Mind Flayer won!  He didn't have the mind to lose!",
            "The Kobold won.  Wow!  What a scrapper!"
            };

        for (int i = 0; i < NOM; i++){
            monsterType[i] = iType[i];
            monsterName[i] = iName[i];
            maxScareFactor[i] = iMaxScareFactor[i];
            minScareFactor[i] = iMinScareFactor[i];
            maxSize[i] = iMaxSize[i];
            minSize[i] = iMinSize[i];
            maxSpeed[i] = iMaxSpeed[i];
            minSpeed[i] = iMinSpeed[i];
            winLine[i] = iWinLine[i];
        }
    }    
}

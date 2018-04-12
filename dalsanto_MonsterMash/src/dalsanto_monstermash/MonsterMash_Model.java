package dalsanto_monstermash;
import java.util.Random;
import java.util.ArrayList;

//Matthew Dal Santo
//ITDEV140
//Assignment 6

public class MonsterMash_Model {
    
    //Monster_Stats represents a temporary pseudo database that holds all Monster data.
    //NOM acts as an upper bound to the 'rows' in the pseudo database.
    Monster_Stats stats = new Monster_Stats();
    public int GetNOM() { return stats.GetNOM(); }
    
    //ArrayList allows any number of monster objects.
    ArrayList<Monster> monster = new ArrayList<Monster>();
    public Monster GetMonster(int i) { return monster.get(i); }
    //public Monster SetMonster(Monster iMonster, int i) { return monster.set(i, iMonster); }
    
    //Array limits battling monsters to two.
    private Monster[] activeMonster = new Monster[2];
    public Monster GetActiveMonster(int i) { return activeMonster[i]; }

    public Monster MakeMonster (int i) {
        Random rnd = new Random();
        Monster monster = new Monster("Monster", "", 0, 0, 0);
        //If index is out of bounds, assign a random index within bounds.
        if (i >= stats.GetNOM() || i < 0) { i = rnd.nextInt(stats.GetNOM()); }
        
        if (stats.GetType(i).equals("Classic")){
            monster = new Monster_Classic(stats.GetType(i), //String monsterType,
                stats.GetName(i),                           //int name,
                stats.GetScareFactor(i),                    //int scareFactor,
                stats.GetSize(i),                           //int size,
                stats.GetSpeed(i),                          //int speed,
                stats.GetWinLine(i));
            ((Monster_Classic) monster ).ClassicExperience();
        }
        else if(stats.GetType(i).equals("Fantasy")){
            monster = new Monster_Fantasy(stats.GetType(i), //String monsterType,
                stats.GetName(i),                           //int name,
                stats.GetScareFactor(i),                    //int scareFactor,
                stats.GetSize(i),                           //int size,
                stats.GetSpeed(i),                          //int speed,
                stats.GetWinLine(i));
            ((Monster_Fantasy) monster ).FantasyMagic();
        }
        return monster;
    }

    public void BuildMonsters(){
        monster.clear();
        for (int i = 0; i < stats.GetNOM(); i++){
            monster.add(MakeMonster(i));
        }
        stageActiveMonsters();
    }
    
    public void stageActiveMonsters(){
        Random rnd = new Random();
        int monsterOne = rnd.nextInt(stats.GetNOM());
        int monsterTwo = 0;
        do{
            monsterTwo = rnd.nextInt(stats.GetNOM());
        }while(monsterTwo == monsterOne);
        
        activeMonster[0] = monster.get(monsterOne);
        activeMonster[1] = monster.get(monsterTwo);
    }
    
    public Monster getWinner(){
        Monster winner;
        if ( (activeMonster[0].GetScareFactor() +
                activeMonster[0].GetSize() + 
                activeMonster[0].GetSpeed()) >
                (activeMonster[1].GetScareFactor() +
                activeMonster[1].GetSize() + 
                activeMonster[1].GetSpeed()) ){
            winner = activeMonster[0];
        }
        else
            winner = activeMonster[1];
        winner.sound();
        return winner;
    }
    
    public Monster getLoser(){
        Monster loser;
        if ( (activeMonster[0].GetScareFactor() +
                activeMonster[0].GetSize() + 
                activeMonster[0].GetSpeed()) >
                (activeMonster[1].GetScareFactor() +
                activeMonster[1].GetSize() + 
                activeMonster[1].GetSpeed()) ){
            loser = activeMonster[1];
        }
        else
            loser = activeMonster[0];
        return loser;
    }
}

package dalsanto_monstermash;

//Matthew Dal Santo
//ITDEV140
//Assignment 6

public class Monster_Classic extends Monster{
    
    private String classicWinLine = "";
    
    public Monster_Classic(String monsterType,
            String name, 
            int scareFactor,
            int size,
            int speed,
            String classicWinLine){
        super(monsterType,
                name,
                scareFactor,
                size,
                speed);
        this.classicWinLine = classicWinLine;
    }
    
    public String GetWinLine() { return classicWinLine; }
    public void SetWinLine(String str) { classicWinLine = str; }
    
    public void ClassicExperience() {
        super.SetScareFactor( (super.GetScareFactor() + 10) );
    }
    
    @Override
    public void sound(){
        MonsterMash_Sound wavSound = new MonsterMash_Sound("\\monster_classic.wav");
        wavSound.Play();
    }
}

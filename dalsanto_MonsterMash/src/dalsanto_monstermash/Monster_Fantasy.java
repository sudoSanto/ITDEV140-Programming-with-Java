package dalsanto_monstermash;

//Matthew Dal Santo
//ITDEV140
//Assignment 6

public class Monster_Fantasy extends Monster{

    String fantasyWinLine = "";
    
    public Monster_Fantasy(String monsterType,
            String name, 
            int scareFactor,
            int size,
            int speed,
            String fantasyWinLine){
        super(monsterType,
                name,
                scareFactor,
                size,
                speed);
        this.fantasyWinLine = fantasyWinLine;
    }
    
    public String GetWinLine() { return fantasyWinLine; }
    public void SetWinLine(String str) { fantasyWinLine = str; }
    
    public void FantasyMagic() {
        super.SetScareFactor( (super.GetScareFactor() + 8) );
        super.SetSize( (super.GetSize() + 1) );
        super.SetSpeed( (super.GetSpeed() + 1) );
    }

    @Override
    public void sound(){
        MonsterMash_Sound wavSound = new MonsterMash_Sound("\\monster_fantasy.wav");
        wavSound.Play();
    }

}

package dalsanto_monstermash;

//Matthew Dal Santo
//ITDEV140
//Assignment 6

public class Monster {
    
    public Monster(String cMonsterType,
            String cName, 
            int cScareFactor,
            int cSize,
            int cSpeed){
        monsterType = cMonsterType;
        name = cName;
        scareFactor = cScareFactor;
        size = cSize;
        speed = cSpeed;
    }
        
    private String monsterType = "";
    public void SetMonsterType(String str) { str = monsterType; }
    public String GetMonsterType() { return monsterType; }
    
    private String name = "";
    public void SetName(String str) { str = name; }
    public String GetName() { return name; }
    
    private int scareFactor = 0;
    public void SetScareFactor(int i) { scareFactor = i; }
    public int GetScareFactor() { return scareFactor; }
    
    private int size = 0;
    public void SetSize(int i) { size = i; }
    public int GetSize() { return size; }
    
    private int speed = 0;
    public void SetSpeed(int i) { speed = i; }
    public int GetSpeed() { return speed; }

    public void sound(){
        MonsterMash_Sound wavSound = new MonsterMash_Sound("\\monster_monster.wav");
        wavSound.Play();
    }        
}

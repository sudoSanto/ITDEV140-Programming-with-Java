package dalsanto_monstermash;

//Matthew Dal Santo
//ITDEV140
//Assignment 6

public class MonsterMash_Control {
    
    MonsterMash_Model Model = new MonsterMash_Model();
    MonsterMash_View View = new MonsterMash_View();

    public void RunMonsterMash(){ MainLoop(); }
    
    public void MainLoop(){
        do{
        Model.BuildMonsters();
        meetTheMonsters();
        if (View.DrawFightingMonsters(Model.GetActiveMonster(0), Model.GetActiveMonster(1)))
            View.DrawFight(Model.getWinner());
        }while(View.PlayAgain());
        View.DrawExit();
    }
    
    private void meetTheMonsters(){
        View.DrawIntro();
        for (int i = 0; i < Model.GetNOM(); i++){
            View.DrawMonsterStats(Model.GetMonster(i));
        }
    }
}

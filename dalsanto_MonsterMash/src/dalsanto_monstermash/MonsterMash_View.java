package dalsanto_monstermash;
import java.util.Scanner;

//Matthew Dal Santo
//ITDEV140
//Assignment 6

public class MonsterMash_View {
    
    public void DrawIntro(){
        ClearTerminal();
        System.out.println("\t\t\t\tM O N S T E R  M A S H!\n");
        System.out.println("\tTwo monsters from the group below will battle it out for supreme Monster dominance!\n");
        System.out.println("Monster Type\t\tMonster Name\t\t\tMonster Scare Factor\t\tMonster Size\t\tMonster Speed");
    }
    
    public void DrawMonsterStats(Monster monster){
        System.out.print("Type: " + monster.GetMonsterType());
        System.out.print("\t\tName: " + monster.GetName());
        System.out.print("\t\tScare Factor: " + monster.GetScareFactor());
        System.out.print("\t\tSize: " + monster.GetSize() + "'");
        System.out.print("\t\tSpeed: " + monster.GetSpeed() + " m/s\n");
    }
    
    public boolean DrawFightingMonsters(Monster monsterOne, Monster monsterTwo){
        Scanner input = new Scanner(System.in);
        String userInput;
        boolean tempBool;
        
        System.out.println("\nIn the right corner: ");
        DrawMonsterStats(monsterOne);
        System.out.println("In the left corner: ");
        DrawMonsterStats(monsterTwo);
        System.out.print("\nWould you like to see them battle? (y/n): ");
        userInput = input.nextLine();

        if(userInput.isEmpty()) { tempBool = false; }
        else
        {
            userInput = userInput.toUpperCase();
            if(userInput.charAt(0) == 'Y') { tempBool = true; }
            else { tempBool = false; }
        }
        return tempBool;
    }
    
    public void DrawFight(Monster winner){
        String winString = "";
        if ( winner.GetMonsterType().equals("Classic") )
            winString = ((Monster_Classic) winner ).GetWinLine();
        else if ( winner.GetMonsterType().equals("Fantasy") )
            winString = ((Monster_Fantasy) winner ).GetWinLine();
        System.out.println("\n" + winString);
    }
    
    public boolean PlayAgain(){
        Scanner input = new Scanner(System.in);
        String userInput;
        boolean tempBool;
        
        System.out.print("\nWould you like to play again? (y/n): ");
        userInput = input.nextLine();

        if(userInput.isEmpty()) { tempBool = false; }
        else
        {
            userInput = userInput.toUpperCase();
            if(userInput.charAt(0) == 'Y') { tempBool = true; }
            else { tempBool = false; }
        }
        return tempBool;
    }
    
    public void DrawExit(){
        ClearTerminal();
        System.out.println("\tThanks for playing Monster Mash!");
        System.out.println("\n\t\tGoodbye");
    }
    
    private void ClearTerminal() { for(int i = 0; i < 1000; i++) { System.out.println(); } }

}

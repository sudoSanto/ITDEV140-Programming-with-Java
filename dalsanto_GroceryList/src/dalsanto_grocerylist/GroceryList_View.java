package dalsanto_grocerylist;
import java.util.ArrayList;
import java.util.Scanner;

//Matthew Dal Santo
//ITDEV140
//Assignment 8

public class GroceryList_View {
    
    public int displayMainMenu()
    {
        Scanner input = new Scanner(System.in);
        String userInput = "";
        int tmpInt = 0;
        
        clearTerminal();
        System.out.println("-Grocery List-\n");
        System.out.println("\t1 - Display Items");
        System.out.println("\t2 - Add Items");
        System.out.println("\t3 - Delete Items");
        System.out.println("\t4 - Clear File");
        System.out.print("\nEnter a number or Q to quit: ");
        userInput = input.nextLine();
        
        if(userInput.charAt(0) == '1')
            tmpInt = 1;
        else if(userInput.charAt(0) == '2')
            tmpInt = 2;
        else if(userInput.charAt(0) == '3')
            tmpInt = 3;
        else if(userInput.charAt(0) == '4')
            tmpInt = 4;
        else if(userInput.toUpperCase().charAt(0) == 'Q')
            tmpInt = -1;
        else
            tmpInt = 0;
        
        return tmpInt;
    }
    
    public void displayItems(ArrayList<String> items, Boolean pause)
    {
        Scanner input = new Scanner(System.in);
        String userInput = "";

        clearTerminal();
        if (items.size() > 0 && items != null) {
            for (int i = 0; i < items.size(); i++) {
                System.out.println(items.get(i));
            }
        }
        else
            System.out.println("\nFile empty.");
        
        if (pause) {
            System.out.print("\nPress enter to return to Main Menu...");
            userInput = input.nextLine();
        }
    }
    
    public String displayAddItems(ArrayList<String> items)
    {
        Scanner input = new Scanner(System.in);
        String userInput = "";

        do {
            displayItems(items, false);
            System.out.print("\nEnter the name of an item you'd like to add or Q to return to Main Menu: ");
            userInput = input.nextLine();
        } while(userInput.isEmpty());
        
        if(userInput.toUpperCase().equals("Q"))
        userInput = "";
        
        return userInput;
    }
    
    public String displayDeleteItems(ArrayList<String> items)
    {
        Scanner input = new Scanner(System.in);
        String userInput = "";

        do {
            displayItems(items, false);
            System.out.print("\nEnter the name of the item you'd like to delete or Q to return to Main Menu: ");
            userInput = input.nextLine();
        } while(userInput.isEmpty());
        
        if(userInput.toUpperCase().equals("Q"))
                userInput = "";
        
        return userInput;
    }
    
    public void displayClearFile()
    {
        Scanner input = new Scanner(System.in);
        String userInput = "";

        clearTerminal();
        System.out.println("File contents cleared.");
        System.out.print("\nPress enter to return to Main Menu...");
        userInput = input.nextLine();
    }
        
    public void displayExit()
    {
        clearTerminal();
        System.out.println("Thanks for using Grocery List!");
    }
    
    public void clearTerminal() { for(int i = 0; i < 1000; i++) { System.out.println(); } }

}

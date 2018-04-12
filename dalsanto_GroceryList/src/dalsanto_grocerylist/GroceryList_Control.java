package dalsanto_grocerylist;

//Matthew Dal Santo
//ITDEV140
//Assignment 8

public class GroceryList_Control {
    
    public void RunApp()
    {
        GroceryList_Model Model = new GroceryList_Model();
        GroceryList_View View = new GroceryList_View();
        
        int menuSelect = 0;
        String tmpInput = "";
        
        do
        {   
            // If statements are used as we are discouraged from using switches.
            // Display Main Menu
            menuSelect = View.displayMainMenu();
            
            // Display all Items
            if (menuSelect == 1) {
                View.displayItems(Model.readFile(), true);
            }
            // Add Items
            else if (menuSelect == 2) {
                do{
                    tmpInput = View.displayAddItems(Model.readFile());
                    Model.addItem(tmpInput);
                } while(tmpInput != "");
            }
            // Delete Items
            else if (menuSelect == 3) {
                do{
                    tmpInput = View.displayDeleteItems(Model.readFile());
                    Model.deleteItem(tmpInput);
                } while(tmpInput != "");
            }
            // Clear File
            else if (menuSelect == 4) {
                Model.clearFile();
                View.displayClearFile();
            }
            // Quit
            else if (menuSelect == -1)
                Model.SetRunApp(false);
        }
        while(Model.GetRunApp());
        
        // Exit message.
        View.displayExit();
    }
}

package dalsanto_grocerylist;

//Matthew Dal Santo
//ITDEV140
//Assignment 8

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GroceryList_Model {
    
    // File saved in current user's base directory.
    private String fileName = System.getProperty("user.home")+"/groceries.txt";
    
    // Main loop boolean.
    private Boolean runApp = true;
    public Boolean GetRunApp() { return runApp; }
    public void SetRunApp(Boolean b) { runApp = b; }
    
    // Constructor checks to see if there is a file.  If there is not, creates one.
    public GroceryList_Model()
    {
        File checkFile = new File(fileName);

        if(!checkFile.exists()){
            try {
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
            out.close();
            }
            catch (Exception e) {
                System.out.println("Error writing new file.");
                e.printStackTrace();
            }
        }
    }
    
    // Reads the file and returns an ArrayList of it's contents.
    public ArrayList<String> readFile()
    {        
        ArrayList<String> items = new ArrayList<String>();
        String fileString = "";
        BufferedReader fileReader = null;
        
        try {
            fileReader = new BufferedReader(new FileReader(fileName));
            while ((fileString = fileReader.readLine()) != null) {
                items.add(fileString);
            }
        }
        catch (Exception e) {
            System.out.println("Error reading file.(readFile)");
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Error closing file.(readFile)");
                e.printStackTrace();
            }
        }
        return items;
    }
    
    // Write file with a new ArrayList.
    public void writeFile(ArrayList<String> items)
    {
        BufferedWriter fileWriter = null;
        
        try {
            fileWriter = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < items.size(); i++) {
                fileWriter.write(items.get(i));
                fileWriter.newLine();
            }
        } catch (Exception e) {
            System.out.println("Error writing file.(writeFile, ArrayList)");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error closing file.(writeFile, ArrayList)");
                e.printStackTrace();
            }
        }
    }
    
    // Overload to write file with a new entry.
    public void writeFile(String entry)
    {
        ArrayList<String> items = readFile();
        BufferedWriter fileWriter = null;
        
        items.add(entry);
        
        try {
            fileWriter = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < items.size(); i++) {
                fileWriter.write(items.get(i));
                fileWriter.newLine();
            }
        } catch (Exception e) {
            System.out.println("Error writing file.(writeFile, String)");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error closing file.(writeFile, String)");
                e.printStackTrace();
            }
        }
    }
    
    // Clears contents of the file.
    public void clearFile()
    {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName);
        } catch (Exception e) {
            System.out.println("Error writing file.(clearFile)");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error closeing file.(clearFile)");
                e.printStackTrace();
            }
        }
    }
    
    // Searches for an item(s) in the ArrayList and deletes it if it exists.
    public void deleteItem(String entry)
    {
        ArrayList<String> items = readFile();
        Scanner input = new Scanner(System.in);
        String userInput = "";
        Boolean isMatch = false;
        
        // Skip if entry is "".  If user enters "Q" for a value, entry will be
        // "" to escape empty string validation in the displayDeleteItems View method.
        if (!entry.isEmpty() && !entry.equals("") && entry != null) {
            for (int i = 0; i < items.size(); i++) {
                if (entry.toUpperCase().equals(items.get(i).toUpperCase())) {
                    items.remove(i--);
                    isMatch = true;
                }
            }
            
            // If there are no matches.
            if (!isMatch) {
                System.out.print("\nNo item on the list matches " + entry + ".  Press enter to continue...");
                userInput = input.nextLine();
            }
            else if (items != null)
                writeFile(items);
        }
    }
    
    // Simply performs error validation before attempting to add a single entry to file.
    public void addItem(String entry)
    {
        if (!entry.isEmpty() && !entry.equals("") && entry != null)
            writeFile(entry);
    }
}

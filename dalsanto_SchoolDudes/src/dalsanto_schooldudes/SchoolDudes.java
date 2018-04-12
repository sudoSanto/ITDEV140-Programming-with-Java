package dalsanto_schooldudes;
import java.util.Scanner;

//Matthew Dal Santo
//ITDEV140
//Assignment 7

public class SchoolDudes {
    private CollegeEmployee[] cCollegeEmployee = new CollegeEmployee[5];
    private Faculty[] cFaculty = new Faculty[5];
    private Student[] cStudent = new Student[5];
    
    // Was not a fan of the instructions for this assignment.  Having everything
    // in one class makes the code look super sloppy.
    // Naming conventions, Classes and Methods were detailed in a supplied UML.
    // If/Else conditionals are used over Switch statements as Switches are discouraged.
    public void dude()
    {
        Scanner input = new Scanner(System.in);
        String userInput;
        boolean tmpBool;
        
        for (int i = 0; i < cCollegeEmployee.length; i++)
        {
            cCollegeEmployee[i] = new CollegeEmployee();
        }
        for (int i = 0; i < cFaculty.length; i++)
        {
            cFaculty[i] = new Faculty();
        }
        for (int i = 0; i < cStudent.length; i++)
        {
            cStudent[i] = new Student();
        }
        
        Boolean runApp = true;
        do
        {
            clearTerminal();
            System.out.println("-School Dudes-\n");
            System.out.println("\t1 - Enter Dudes");
            System.out.println("\t2 - Find Dude");
            System.out.println("\t3 - Display all Dudes");
            System.out.print("\nEnter a number or Q to quit: ");
            userInput = input.nextLine();
            
            if(userInput.isEmpty()) { tmpBool = false; }
            else
            {
                if(userInput.charAt(0) == '1' ||
                        userInput.charAt(0) == '2' ||
                        userInput.charAt(0) == '3' ||
                        userInput.toUpperCase().charAt(0) == 'Q')
                    { tmpBool = true; }
                else { tmpBool = false; }
            }
            
            if(tmpBool)
            {
                if(userInput.charAt(0) == '1')
                    addDude();
                else if(userInput.charAt(0) == '2')
                    find();
                else if(userInput.charAt(0) == '3')
                    displayAll();
                else if(userInput.toUpperCase().charAt(0) == 'Q')
                    runApp = false;
            }
        }
        while(runApp);
        clearTerminal();
        System.out.println("\n\n\tHave a great day, dude!");
    }
    
    private void addDude()
    {
        Scanner input = new Scanner(System.in);
        String userInput;
        boolean tmpBool = true;
        boolean addBool = true;
        int dudeType = 0;
        int dudeIndex = 0;
        String currentDude = "";
        String firstName = "";
        String lastName = "";
        String streetAddress = "";
        String zipCode = "";
        String phoneNumber = "";
        
        do {
            clearTerminal();
            System.out.println("-Types of School Dudes-\n");
            System.out.println("\t1 - College Employee");
            System.out.println("\t2 - Faculty");
            System.out.println("\t3 - Student");
            System.out.print("\nEnter a number to add a School Dude or Q to quit: ");
            userInput = input.nextLine();
            
            if(userInput.isEmpty()) { tmpBool = false; }
            else
            {
                if(userInput.charAt(0) == '1' ||
                        userInput.charAt(0) == '2' ||
                        userInput.charAt(0) == '3' ||
                        userInput.toUpperCase().charAt(0) == 'Q')
                    { tmpBool = true; }
                else { tmpBool = false; }
            }
        } while(!tmpBool);
        
        if (userInput.toUpperCase().charAt(0) != 'Q') {
            dudeType = (userInput.charAt(0)) - '0';
            if (dudeType == 1)
            {
                for (int i = 0; i < cCollegeEmployee.length; i++)
                {
                    if (cCollegeEmployee[i].getLastName() != null)
                    {
                        dudeIndex = i + 1;
                    }
                }
                currentDude = "College Emoployee";
            }
            else if (dudeType == 2)
            {
                for (int i = 0; i < cFaculty.length; i++)
                {
                    if (cFaculty[i].getLastName() != null)
                    {
                        dudeIndex = i + 1;
                    }
                }
                currentDude = "Faculty";
            }
            else if (dudeType == 3)
            {
                for (int i = 0; i < cStudent.length; i++)
                {
                    if (cStudent[i].getLastName() != null)
                    {
                        dudeIndex = i + 1;
                    }
                }
                currentDude = "Student";
            }

            while (dudeIndex < 5 && addBool) {                
                clearTerminal();
                System.out.println("\nEnter your information for " + currentDude + " number " + (dudeIndex + 1) + ".\n");
                System.out.print("\tFirst Name: ");
                firstName = input.nextLine();
                do{
                    System.out.print("\tLast Name: ");
                    lastName = input.nextLine();
                } while (lastName.isEmpty());
                System.out.print("\tStreet Address: ");
                streetAddress = input.nextLine();
                System.out.print("\tZip Code: ");
                zipCode = input.nextLine();
                System.out.print("\tPhone Number: ");
                phoneNumber = input.nextLine();
                
                if (dudeType == 1)
                {
                    System.out.print("\tSocial Security Number: ");
                    userInput = input.nextLine();
                    cCollegeEmployee[dudeIndex].setSSN(userInput);
                    
                    System.out.print("\tDepartment: ");
                    userInput = input.nextLine();
                    cCollegeEmployee[dudeIndex].setDepartment(userInput);
                    
                    do {
                        System.out.print("\tSalary: ");
                        userInput = input.nextLine();
                        try { 
                            cCollegeEmployee[dudeIndex].setSalary
                                (Double.valueOf(userInput.trim()).doubleValue());
                            tmpBool = true;
                        }
                        catch (NumberFormatException nfe){
                            System.out.println("Incorrect value.  Please enter a number only.");
                            tmpBool = false;
                        }
                    } while(!tmpBool);
                                        
                    cCollegeEmployee[dudeIndex].setFirstName(firstName);
                    cCollegeEmployee[dudeIndex].setLastName(lastName);
                    cCollegeEmployee[dudeIndex].setStreetAddress(streetAddress);
                    cCollegeEmployee[dudeIndex].setZipCode(zipCode);
                    cCollegeEmployee[dudeIndex].setPhoneNumber(phoneNumber);
                }
                else if (dudeType == 2)
                {
                    System.out.print("\tTenured? (y/n): ");
                    userInput = input.nextLine();
                    if(userInput.isEmpty()) { tmpBool = false; }
                    else
                    {
                        userInput = userInput.toUpperCase();
                        if(userInput.charAt(0) == 'Y') { tmpBool = true; }
                        else { tmpBool = false; }
                    }
                    cFaculty[dudeIndex].setTenured(tmpBool);
                    
                    cFaculty[dudeIndex].setFirstName(firstName);
                    cFaculty[dudeIndex].setLastName(lastName);
                    cFaculty[dudeIndex].setStreetAddress(streetAddress);
                    cFaculty[dudeIndex].setZipCode(zipCode);
                    cFaculty[dudeIndex].setPhoneNumber(phoneNumber);
                }
                else if (dudeType == 3)
                {
                    System.out.print("\tMajor: ");
                    userInput = input.nextLine();
                    cStudent[dudeIndex].setMajor(userInput);
                    
                    do {
                        System.out.print("\tGPA: ");
                        userInput = input.nextLine();
                        try { 
                            cStudent[dudeIndex].setGPA
                                (Double.valueOf(userInput.trim()).doubleValue());
                            tmpBool = true;
                        }
                        catch (NumberFormatException nfe){
                            System.out.println("Incorrect value.  Please enter a number only.");
                            tmpBool = false;
                        }
                    } while(!tmpBool);

                    cStudent[dudeIndex].setFirstName(firstName);
                    cStudent[dudeIndex].setLastName(lastName);
                    cStudent[dudeIndex].setStreetAddress(streetAddress);
                    cStudent[dudeIndex].setZipCode(zipCode);
                    cStudent[dudeIndex].setPhoneNumber(phoneNumber);                    
                }
                
                dudeIndex++;
                if (dudeIndex < 5)
                {
                    System.out.print("\nWould you like to add another " + currentDude + "? (y/n): ");
                    userInput = input.nextLine();
                    if(userInput.isEmpty()) { addBool = false; }
                    else
                    {
                        userInput = userInput.toUpperCase();
                        if(userInput.charAt(0) == 'Y') { addBool = true; }
                        else { addBool = false; }
                    }
                }
            }//end while
        }//end if(Quit)
    }//end addDude class
    
    private void find()
    {
        Scanner input = new Scanner(System.in);
        String userInput;
        Boolean tmpBool;
        
        do {
            clearTerminal();
            System.out.println("-Find Dudes-");
            System.out.print("\nEnter the last name of a School Dude or Q to return to main menu: ");
            userInput = input.nextLine();
            
            if(!userInput.isEmpty()) 
            {
                for (int i = 0; i < cCollegeEmployee.length; i++)
                {
                    if (cCollegeEmployee[i].getLastName() != null)
                    {
                        if (cCollegeEmployee[i].getLastName().toUpperCase().equals(userInput.toUpperCase()))
                            cCollegeEmployee[i].displayAll();
                    }
                }
                for (int i = 0; i < cFaculty.length; i++)
                {
                    if (cFaculty[i].getLastName() != null)
                    {
                        if (cFaculty[i].getLastName().toUpperCase().equals(userInput.toUpperCase()))
                            cFaculty[i].displayAll();
                    }
                }
                for (int i = 0; i < cStudent.length; i++)
                {
                    if (cStudent[i].getLastName() != null)
                    {                    
                        if (cStudent[i].getLastName().toUpperCase().equals(userInput.toUpperCase()))
                            cStudent[i].displayAll();
                    }
                }
            }
            
            if(!userInput.toUpperCase().equals("Q"))
            {
                System.out.println("\nPress enter to continue...");
                userInput = input.nextLine();
            }
        } while(!userInput.toUpperCase().equals("Q"));
    }
    
    private void displayAll()
    {
        Scanner input = new Scanner(System.in);
        String userInput;
        Boolean tmpBool;
                    
        do {
            clearTerminal();
            System.out.println("-Display Dudes-");
            System.out.println("\t1 - Display all College Employees");
            System.out.println("\t2 - Display all Faculty");
            System.out.println("\t3 - Display all Students");
            System.out.print("\tEnter a number or Q to return to main menu: ");
            userInput = input.nextLine();
            
            if(userInput.isEmpty()) { tmpBool = false; }
            else
            {
                if(userInput.charAt(0) == '1' ||
                        userInput.charAt(0) == '2' ||
                        userInput.charAt(0) == '3' ||
                        userInput.toUpperCase().charAt(0) == 'Q')
                    { tmpBool = true; }
                else { tmpBool = false; }
            }
        } while(!tmpBool);
            
        if(userInput.charAt(0) == '1')
        {
            if (cCollegeEmployee[0].getLastName() == null)
                System.out.println("\nNo College Employees entered!");
            else
            {
                System.out.println("\n-College Employees-");
                for (int i = 0; i < cCollegeEmployee.length; i++)
                {
                    if (cCollegeEmployee[i].getLastName() != null)
                        cCollegeEmployee[i].displayAll();
                }
            }
        }
        else if(userInput.charAt(0) == '2')
        {
            if (cFaculty[0].getLastName() == null)
                System.out.println("\nNo Faculty entered!");
            else
            {
                System.out.println("\n-Faculty-");
                for (int i = 0; i < cFaculty.length; i++)
                {
                    if (cFaculty[i].getLastName() != null)
                        cFaculty[i].displayAll();
                }
            }
        }
        else if(userInput.charAt(0) == '3')
        {
            if (cStudent[0].getLastName() == null)
                System.out.println("\nNo Students entered!");
            else
            {
                System.out.println("\n-Students-");
                for (int i = 0; i < cStudent.length; i++)
                {
                    if (cStudent[i].getLastName() != null)
                        cStudent[i].displayAll();
                }
            }
        }
        
        if(userInput.charAt(0) != 'Q')
        {
            System.out.println("\nPress enter to continue...");
            userInput = input.nextLine();
        }
    }//end displayAll
    
    private void clearTerminal() { for(int i = 0; i < 1000; i++) { System.out.println(); } }
}

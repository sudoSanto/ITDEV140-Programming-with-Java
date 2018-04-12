package dalsanto_assignment2;
import java.util.Scanner;

//Matthew Dal Santo
//ITDEV140
//Assignment 2

public class Tip {
    Scanner input = new Scanner(System.in);
    String restaurantName = "";
    double mealCost = 0;
    double tipPercentage = 0;
    double tipAmount = 0;
    double totalCost = 0;

    public void GetTip(){
        
        System.out.println("Enter restaurant name: ");
        restaurantName = input.nextLine();
        
        System.out.println("Enter cost of meal(ex. 94.56): ");
        mealCost = input.nextDouble();
        
        System.out.println("Enter tip percentage:(ex. 20) ");
        tipPercentage = input.nextDouble();
        
        tipAmount = mealCost * (tipPercentage / 100);
        totalCost = mealCost + tipAmount;
        
        System.out.println("Restaurant Name: \t" + restaurantName);
        System.out.print("Tip Amount(" + tipPercentage + "%): \t$");
        System.out.printf("%.2f", tipAmount);
        System.out.println("");
        System.out.printf("Total Cost: \t\t$" + "%.2f", totalCost);
        System.out.println("");
    }
}

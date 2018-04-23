package dalsanto_guicustomcars;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Matthew Dal Santo
//ITDEV140
//Assignment 10

public class Control_GUICustomCars {
    
    private View_GUICustomCars view;
    private Model_GUICustomCars model;
    
    public Control_GUICustomCars(View_GUICustomCars view, Model_GUICustomCars model) {
        this.view = view;
        this.model = model;

        this.view.addBAddCarPackageListener(new bAddCarPackageListener());
        
        // Set View Values
        view.setCBoxAddressState(model.getAllAddressStateNames());
        view.setCBoxAddressStreetDirection(model.getAllAddressStreetDirectionNames());
        view.setCBoxAddressStreetSuffix(model.getAllAddressStreetSuffixNames());
        view.setCBoxCarPackage(model.getAllPackageNames());
    }
    
    // View Listeners
    class bAddCarPackageListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            model.addCarPackage(view.getCarPackage());
            view.setPackages(model.getCarPackageNames());
            //view.displayErrorMessage("Button Pressed");
        }
    }
}

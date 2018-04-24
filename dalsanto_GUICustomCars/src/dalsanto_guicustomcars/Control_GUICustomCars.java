package dalsanto_guicustomcars;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

//Matthew Dal Santo
//ITDEV140
//Assignment 10

public class Control_GUICustomCars {
    
    private View_GUICustomCars view;
    private Model_GUICustomCars model;
    
    public Control_GUICustomCars(View_GUICustomCars view, Model_GUICustomCars model) {
        this.view = view;
        this.model = model;
        
        // View Listeners
        // Add Car Package Button
        this.view.addBAddCarPackageListener(new bAddCarPackageListener());
        // Remove Car Package Button
        this.view.addBRemoveCarPackageListener(new bRemoveCarPackageListener());
        // Submit Order Button
        this.view.addBSubmitListener(new bSubmitListener());
        // Car Type Radio Buttons
        this.view.addRButtonCarTypeCompactListener(new rButtonCarTypeCompactListener());
        this.view.addRButtonCarTypeMidSizedListener(new rButtonCarTypeMidSizedListener());
        this.view.addRButtonCarTypeSUVListener(new rButtonCarTypeSUVListener());
        // Delivery Combo Box
        this.view.addCBoxDeliveryListener(new cBoxDeliveryListener());
        
        // Set View Values
        view.setCBoxAddressState(model.getAllAddressStateNames());
        view.setCBoxAddressStreetDirection(model.getAllAddressStreetDirectionNames());
        view.setCBoxAddressStreetSuffix(model.getAllAddressStreetSuffixNames());
        view.setCBoxCarPackage(model.getAllPackageNames());
        view.setPackages(model.getCarPackageNames());
        updateViewPrice();
    }
    
    public void updateViewPrice() {
        NumberFormat formatPrice = NumberFormat.getCurrencyInstance();
        view.setCarPrice(formatPrice.format(model.getCarPrice()));
        view.setPackagePrice(formatPrice.format(model.getCarPackagesPrice()));
        view.setDeliveryPrice(formatPrice.format(model.getCarDeliveryPrice()));
    }
    
    // View Listeners
    // Button - Add Car Package
    class bAddCarPackageListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            model.addCarPackage(view.getCarPackage());
            view.setPackages(model.getCarPackageNames());
            updateViewPrice();
        }
    }
    // Button - Add Car Package
    class bRemoveCarPackageListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (view.getSelectedCarPackages().size() > 0)
                model.removeCarPackageTypeNames(view.getSelectedCarPackages());
            view.setPackages(model.getCarPackageNames());
            updateViewPrice();
        }
    }
    // Button - Add Car Package
    class bSubmitListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            NumberFormat formatPrice = NumberFormat.getCurrencyInstance();
            String message = "";
            if (view.getFirstName().equals("First Name") || 
                    view.getFirstName().equals("") ||
                    view.getLastName().equals("Last Name") ||
                    view.getLastName().equals(""))
                view.displayMessage("You must enter a name.");
            else if (model.getCarType() == 0)
                view.displayMessage("You must pick a car type.");
            else if (model.getCarPackages().size() == 0)
                view.displayMessage("You must pick a base package.");
            else {
                message = "Thank you " + 
                        view.getFirstName() + " " + view.getLastName() + 
                        " for ordering.\n\n" + 
                        "Car Type: " + model.getTypeName(model.getCarType()) + "\n" + 
                        "Car Packages: ";
                for (int i = 0; i < model.getCarPackages().size(); i++) {
                    message += model.getPackageName(model.getCarPackage(i));
                    if (i != (model.getCarPackages().size() - 1))
                        message += ", ";
                }
                message += "\n" + 
                        "Delivery: ";
                if (model.getCarDelivery())
                    message += "Yes\n";
                else
                    message += "No\n";
                message += "\nTotal Cost: " + formatPrice.format(model.getCarPrice()) + "\n";
                view.displayMessage(message);
            }
        }
    }


    // Car Type Radio Buttons
    class rButtonCarTypeCompactListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.setCarImageCompact();
            model.setCarType(1);
            updateViewPrice();
        }
    }
    class rButtonCarTypeMidSizedListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.setCarImageMidSized();
            model.setCarType(2);
            updateViewPrice();
        }
    }
    class rButtonCarTypeSUVListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.setCarImageSUV();
            model.setCarType(3);
            updateViewPrice();
        }
    }
    
    // Delivery Combo Box
    class cBoxDeliveryListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (view.getDelivery() == 0)
                model.setCarDelivery(Boolean.FALSE);
            else
                model.setCarDelivery(Boolean.TRUE);
            updateViewPrice();
        }
    }
    


}

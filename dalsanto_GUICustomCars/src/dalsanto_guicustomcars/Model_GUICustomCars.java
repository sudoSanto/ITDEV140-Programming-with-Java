package dalsanto_guicustomcars;
import java.util.ArrayList;
import java.util.Arrays;

//Matthew Dal Santo
//ITDEV140
//Assignment 10

public class Model_GUICustomCars {

    public Model_GUICustomCars() {
    }
    
    // Class Objects
    private Car_GUICustomCars car = new Car_GUICustomCars();
    private User_GUICustomCars user = new User_GUICustomCars();
    private CarTypes carTypes = new CarTypes();
    
    // Class Constants
    // Price
    private double deliveryPrice = 5000.0;
    private double packagePrice = 10000.0;
    
    // Inner Class Calls
    // Car Types
    public String getTypeName(int i) { return carTypes.getName(i); }
    public double getTypePrice(int i) { return carTypes.getPrice(i); }

    // Car Model
    public int getCarType() { return car.getType(); }
    public void setCarType(int i) { car.setType(i); }

    public int getCarPackage(int i) { return car.getPackage(i); }
    public double getCarPackagesPrice() { 
        if (car.getPackages().size() > 0 && car.getType() > 0)
            return (car.getPackages().size() - 1) * packagePrice;
        else
            return 0.0;
    }
    public ArrayList<Integer> getCarPackages() { return car.getPackages(); }
    public String[] getCarPackageNames() { 
        String[] carPackages = new String[car.getPackages().size()];
        for(int i = 0; i < car.getPackages().size(); i++) {
            carPackages[i] = Packages.get(car.getPackage(i));
        }
        return carPackages;
    }
    public void addCarPackage(int i) {
        if (!car.getPackages().contains(i))
            car.addPackage(i); 
    }
    public void removeCarPackage(int i) { car.removePackage(i); }
    public void removeCarPackageType(int i) { car.removePackageType(i); }
    public void removeCarPackageTypeNames(ArrayList<String> s) { 
        for (int i = 0; i < s.size(); i++) {
            car.removePackageType(Packages.indexOf(s.get(i)));
        }
    }
    public void clearCarPackages() { car.clearPackages(); }

    public Boolean getCarDelivery() { return car.getDelivery(); }
    public double getCarDeliveryPrice() {
        if (getCarDelivery() && car.getType() > 0)
            return deliveryPrice;
        else
            return 0.0;
    }
    public void setCarDelivery(Boolean b) { car.setDelivery(b); }
    
    public double getCarPrice() {
        double carPrice = 0.0;
        if (car.getType() > 0) {
            carPrice += carTypes.getPrice(car.getType());
            carPrice += getCarPackagesPrice();
            if (car.getDelivery())
                    carPrice += deliveryPrice;
        }
        return carPrice;
    }
    
    // User Model
    public String getUserFirstName() { return user.getFirstName(); }
    public void setUserFirstName(String s) { user.setFirstName(s); }
    
    public String getUserLastName() { return user.getLastName(); }
    public void setUserLastName(String s) { user.setLastName(s); }
    
    public int getUserAddressStreetNumber() { return user.getAddressStreetNumber(); }
    public void setUserAddressStreetNumber(int i) { user.setAddressStreetNumber(i); }
    
    public int getUserAddressStreetDirection() { return user.getAddressStreetDirection(); }
    public void setUserAddressStreetDirection(int i) { user.setAddressStreetDirection(i); }
    
    public String getUserAddressStreetName() { return user.getAddressStreetName(); }
    public void setUserAddressStreetName(String s) { user.setAddressStreetName(s); }
    
    public int getUserAddressStreetSuffix() { return user.getAddressStreetSuffix(); }
    public void setUserAddressStreetSuffix(int i) { user.setAddressStreetSuffix(i); }
    
    public String getUserAddressAux() { return user.getAddressAux(); }
    public void setUserAddressAux(String s) { user.setAddressAux(s); }

    public String getUserAddressCity() { return user.getAddressCity(); }
    public void setUserAddressCity(String s) { user.setAddressCity(s); }
    
    public int getUserAddressState() { return user.getAddressState(); }
    public void setUserAddressState(int i) { user.setAddressState(i); }
    
    public int getUserAddressZipCode() { return user.getAddressZipCode(); }
    public void setUserAddressZipCode(int i) { user.setAddressZipCode(i); }
    
    public String getUserPhoneNumber() { return user.getPhoneNumber(); }
    public void setUserPhoneNumber(String s) { user.setPhoneNumber(s); }
    
    // Values
    private ArrayList<String> Packages = new ArrayList<String>(
        Arrays.asList( "Four Wheel Drive", 
                "Engraved Leather", 
                "Custom Wheels", 
                "Spoiler",
                "Exclusive Sound System",
                "Panoramic Roof" ));
    public String getPackageName(int i) { return Packages.get(i); }
    public String[] getAllPackageNames() { 
        String[] allPackages = new String[Packages.size()];
        allPackages = Packages.toArray(allPackages);
        return allPackages;
    }

    private ArrayList<String> AddressStreetDirections = new ArrayList<String>(
            Arrays.asList( "", "North", "East", "South", "West" ));
    public String getAddressStreetDirectionName(int i) { return AddressStreetDirections.get(i); }
    public String[] getAllAddressStreetDirectionNames() { 
        String[] allAddressStreetDirections = new String[AddressStreetDirections.size()];
        allAddressStreetDirections = AddressStreetDirections.toArray(allAddressStreetDirections);
        return allAddressStreetDirections;
    }
    
    private ArrayList<String> AddressStreetSuffixes = new ArrayList<String>(
            Arrays.asList( "", "Street", "Avenue", "Road", "Way", 
                    "Drive", "Grove", "Lane", "Place" ));
    public String getAddressStreetSuffixName(int i) { return AddressStreetSuffixes.get(i); }
    public String[] getAllAddressStreetSuffixNames() { 
        String[] allAddressStreetSuffixes = new String[AddressStreetSuffixes.size()];
        allAddressStreetSuffixes = AddressStreetSuffixes.toArray(allAddressStreetSuffixes);
        return allAddressStreetSuffixes;
    }
    
    private ArrayList<String> AddressStates = new ArrayList<String>(
        Arrays.asList( "", 
                "Alabama", 
                "Alaska", 
                "Arizona", 
                "Arkansas", 
                "California", 
                "Colorado", 
                "Connecticut", 
                "Delaware", 
                "Florida", 
                "Georgia", 
                "Hawaii", 
                "Idaho", 
                "Illinois", 
                "Indiana", 
                "Iowa", 
                "Kansas", 
                "Kentucky", 
                "Louisiana", 
                "Maine", 
                "Maryland", 
                "Massachusetts", 
                "Michigan", 
                "Minnesota", 
                "Mississippi", 
                "Missouri", 
                "Montana", 
                "Nebraska", 
                "Nevada", 
                "New Hampshire", 
                "New Jersey", 
                "New Mexico", 
                "New York", 
                "North Carolina", 
                "North Dakota", 
                "Ohio", 
                "Oklahoma", 
                "Oregon", 
                "Pennsylvania", 
                "Rhode Island", 
                "South Carolina", 
                "South Dakota", 
                "Tennessee", 
                "Texas", 
                "Utah", 
                "Vermont", 
                "Virginia", 
                "Washington", 
                "West Virginia", 
                "Wisconsin", 
                "Wyoming" ));
    public String getAddressStateName(int i) { return AddressStates.get(i); }
    public String[] getAllAddressStateNames() { 
        String[] allAddressStates = new String[AddressStates.size()];
        allAddressStates = AddressStates.toArray(allAddressStates);
        return allAddressStates;
    }
    
    // Inner Classes
    public class CarTypes {
        private ArrayList<String> name = new ArrayList<String>(
        Arrays.asList( "None", "Compact", "Mid Sized", "SUV" ));
        public String getName(int i) { return name.get(i); } 
        
        private ArrayList<Double> price = new ArrayList<Double>(
        Arrays.asList( new Double[] { 0.0, 50000.0, 75000.0, 150000.0 } ));
        public Double getPrice(int i) { return price.get(i); }
        
        public void AddCarType(String s, double d) {
            name.add(s);
            price.add(d);
        }
    }
}

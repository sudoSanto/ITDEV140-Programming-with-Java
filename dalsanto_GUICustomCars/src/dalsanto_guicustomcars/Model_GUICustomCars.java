package dalsanto_guicustomcars;
import java.util.ArrayList;
import java.util.Arrays;

public class Model_GUICustomCars {

    private Car_GUICustomCars car = new Car_GUICustomCars();
    private User_GUICustomCars user = new User_GUICustomCars();
    private CarTypes carTypes = new CarTypes();
    
    // Class Constants
    //Price
    private double deliveryPrice = 5000.0;
    private double packagePrice = 10000.0;
    
    // Car Model
    public String getCarType() { return carTypes.Name(car.getType());}
    public double getCarTypePrice(int i) { return carTypes.Price(car.getType()); }
    public void setCarType(int i) { car.setType(i); }
    
    public int getCarPackage(int i) { return car.getPackage(i); }
    public String getCarPackageName(int i) { 
        return CarPackages.get(i); }
    public double getCarPackagesPrice(int i) { 
        return (car.getPackages().size() - 1) * 10000.0; }
    public ArrayList<Integer> getCarPackages() { return car.getPackages(); }
    public void addCarPackage(int i) { car.addPackage(i); }
    public void removeCarPackage(int i) { car.removePackage(i); }
    public void removeCarPackageIndex(int i) { car.removePackageIndex(i); }
    public void clearCarPackages() { car.clearPackages(); }
    
    private Boolean delivery = true;
    public Boolean getDelivery() { return delivery; }
    public void setDelivery(Boolean b) { delivery = b; }
    
    public double getCarPrice() 
    { 
        int carPrice = 0;
        carPrice += carTypes.Price(car.getType());
        carPrice += ((car.getPackages().size() - 1) * packagePrice);
        if (delivery)
                carPrice += deliveryPrice;
        return carPrice;
    }

    // User Model
    public String getUserFirstName() { return user.getFirstName(); }
    public void setUserFirstName(String s) { user.setFirstName(s); }
    
    public String getUserLastName() { return user.getLastName(); }
    public void setUserLastName(String s) { user.setLastName(s); }
    
    public int getAddressStreetNumber() { return user.getAddressStreetNumber(); }
    public void setAddressStreetNumber(int i) { user.setAddressStreetNumber(i); }
    
    public void setAddressStreetName(String s) { user.setAddressStreetName(s); }
    public String getAddressStreetName() { return user.getAddressStreetName(); }
    
    public int getAddressStreetSuffix() { return user.getAddressStreetSuffix(); }
    public void setAddressStreetSuffix(int i) { user.setAddressStreetSuffix(i); }
    
    public String getAddressAux() { return user.getAddressAux(); }
    public void setAddressAux(String s) { user.setAddressAux(s); }

    public String getAddressCity() { return user.getAddressCity(); }
    public void setAddressCity(String s) { user.setAddressCity(s); }
    
    public int getAddressState() { return user.getAddressState(); }
    public void setAddressState(int i) { user.setAddressState(i); }
    
    public int getAddressZipCode() { return user.getAddressZipCode(); }
    public void setAddressZipCode(int i) { user.setAddressZipCode(i); }
    
    public String getPhoneNumber() { return user.getPhoneNumber(); }
    public void setPhoneNumber(String s) { user.setPhoneNumber(s); }

    // Values
    private ArrayList<String> CarPackages = new ArrayList<String>(
        Arrays.asList( "Four Wheel Drive", 
                "Engraved Leather", 
                "Custom Wheels", 
                "Spoiler",
                "Exclusive Sound System",
                "Panoramic Roof" ));

    private ArrayList<String> AddressDirections = new ArrayList<String>(
            Arrays.asList( "", "North", "East", "South", "West" ));
    
    private ArrayList<String> AddressSuffixes = new ArrayList<String>(
            Arrays.asList( "", "Street", "Avenue", "Road", "Way", 
                    "Drive", "Grove", "Lane", "Place" ));
    
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

    // Inner Classes
    public class CarTypes {
        private ArrayList<String> name = new ArrayList<String>(
        Arrays.asList( "None", "Compact", "Mid Sized", "SUV" ));
        public String Name(int i) { return name.get(i); } 
        
        private ArrayList<Double> price = new ArrayList<Double>(
        Arrays.asList( new Double[] { 0.0, 50000.0, 75000.0, 150000.0 } ));
        public Double Price(int i) { return price.get(i); }       
    }
}

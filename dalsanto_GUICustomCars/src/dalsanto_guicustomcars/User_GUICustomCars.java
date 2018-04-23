package dalsanto_guicustomcars;
import java.util.ArrayList;
import java.util.Arrays;

//Matthew Dal Santo
//ITDEV140
//Assignment 10

public class User_GUICustomCars {
    
    private String firstName = "";
    public String getFirstName() { return firstName; }
    public void setFirstName(String s) { firstName = s;  }
    
    private String lastName = "";
    public String getLastName() { return lastName; }
    public void setLastName(String s) { lastName = s;  }
    
    private int addressStreetNumber = 0;
    public int getAddressStreetNumber() { return addressStreetNumber; }
    public void setAddressStreetNumber(int i) { addressStreetNumber = i; }
    
    private int addressStreetDirection = 0;
    public int getAddressStreetDirection() { return addressStreetDirection; }
    public void setAddressStreetDirection(int i) { addressStreetDirection = i; }

    private String addressStreetName = "";
    public String getAddressStreetName() { return addressStreetName; }
    public void setAddressStreetName(String s) { addressStreetName = s;  }
    
    private int addressStreetSuffix = 0;
    public int getAddressStreetSuffix() { return addressStreetSuffix; }
    public void setAddressStreetSuffix(int i) { addressStreetSuffix = i; }
    
    private String addressAux = "";
    public String getAddressAux() { return addressAux; }
    public void setAddressAux(String s) { addressAux = s;  }
    
    private String addressCity = "";
    public String getAddressCity() { return addressCity; }
    public void setAddressCity(String s) { addressCity = s;  }

    private int addressState = 0;
    public int getAddressState() { return addressState; }
    public void setAddressState(int i) { addressState = i; }

    private int zipCode = 0;
    public int getAddressZipCode() { return zipCode; }
    public void setAddressZipCode(int i) { zipCode = i; }
    
    private String phoneNumber = "";
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String s) { phoneNumber = s;  }
}

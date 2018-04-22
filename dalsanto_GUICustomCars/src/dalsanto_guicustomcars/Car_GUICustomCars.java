package dalsanto_guicustomcars;

import java.util.ArrayList;
import java.util.Arrays;


public class Car_GUICustomCars {
    
    private int type = 0;
    public int getType() { return type; }
    public void setType(int i) { type = i;  }
    
    private ArrayList<Integer> packageIndexList = new ArrayList<Integer>();
    public int getPackage(int i) { return packageIndexList.get(i); }
    public ArrayList<Integer> getPackages() { return packageIndexList; }
    public void addPackage(int i) { packageIndexList.add(i); }
    public void removePackage(int i) { packageIndexList.remove(i); }
    public void removePackageIndex(int i) { packageIndexList.removeAll(Arrays.asList(i)); }
    public void clearPackages() { packageIndexList.clear(); }
}


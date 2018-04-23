package dalsanto_guicustomcars;

//Matthew Dal Santo
//ITDEV140
//Assignment 10

public class Dalsanto_GUICustomCars {
    public static void main(String[] args) {
        View_GUICustomCars view = new View_GUICustomCars();
        Model_GUICustomCars model = new Model_GUICustomCars();
        Control_GUICustomCars control = new Control_GUICustomCars(view, model);

        view.setVisible(true);
    }
}

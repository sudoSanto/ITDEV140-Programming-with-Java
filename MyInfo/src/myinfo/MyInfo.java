package myinfo;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

//Matthew Dal Santo
//ITDEV140
//Assignment 1

public class MyInfo {

    public static void main(String[] args) {
        
        System.out.println("Dal Santo");
        System.out.println("Matthew");
        
        LocalDate myBirthday = LocalDate.of(1981, Month.MARCH, 17);
        LocalDate dateNow = LocalDate.now();
        Period timeBetween = Period.between(myBirthday, dateNow);
        System.out.println("\"It is impossible for a man to learn what he thinks he already knows.\" - Epictetus");
        System.out.println("My age is: " + timeBetween.getYears());
    }
    
}

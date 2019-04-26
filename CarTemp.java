import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
import java.lang.*;

public class CarTemp {

    public static ArrayList<Car> availableCars = new ArrayList<Car>();

public static void main (String args[]) {

    /*
    DUMMY DATA
    // make, model, style, reg number, totalMiles, insuranceGroup, dayRate, taxRate
    */
    availableCars.add(new Car("Audi", "A1", "Estate", "SL42 SMR", 30000, 9, 100, 20));
    availableCars.add(new Car("Audi", "A1", "Hatchback", "ER39 DLR", 95000, 9, 200, 20));
    availableCars.add(new Car("Audi", "A3", "Estate", "DA28 ABL", 1000, 16, 500, 10));
    availableCars.add(new Car("Audi", "A3", "Hatchback", "A9W2 1AF", 20000, 19, 250, 15));
    availableCars.add(new Car("BMW", "S1", "Estate", "A5M3 1K2", 5000, 18, 300, 10));
    availableCars.add(new Car("BMW", "S1", "Hatchback", "LA9S 2JH", 10000, 18, 300, 15));
    availableCars.add(new Car("BMW", "S3", "Estate", "JDS2 A31", 100000, 20, 50, 10));
    availableCars.add(new Car("Citroen", "C1", "Estate", "HDS1 ISD", 33000, 1, 100, 12));
    availableCars.add(new Car("Citroen", "C4", "Hatchback", "9DSA 72B", 150000, 13, 20, 20));
    availableCars.add(new Car("FIAT", "500", "Hatchback", "555A KDS", 49500, 9, 130, 5));
    availableCars.add(new Car("FIAT", "500L", "Estate", "JS2A 8SA", 50000, 11, 200, 20));

    System.out.println("Please begin by entering the make of the car you wish to rent: ");
    Scanner userPropertySelect = new Scanner(System.in);

    String make, model, style = "";

    while (true) {
    String userInputMake = userPropertySelect.next();

    if (checkifMakeExists(userInputMake) == true) {
        make = userInputMake;
        System.out.println("Great! Next, please select the car model.");
        break;
    } else {
        System.out.println("We do not currently have cars of this make available. Please try a different one.");
    }
}

    while (true) {
    String userInputModel = userPropertySelect.next();

    if (checkifModelExists(make, userInputModel) == true) {
        model = userInputModel;
        System.out.println("Great! Next, please select the car style.");
        break;
    } else {
        System.out.println("We do not currently have cars of this model available. Please try a different one.");
    }
}

    while (true) {
    String userInputStyle = userPropertySelect.next();

    if (checkifStyleExists(make, model, userInputStyle) == true) {
        style = userInputStyle;
        System.out.println("You have reached the end of this input sequence.");
        break;
    } else {
        System.out.println("We do not currently have cars of this style available. Please try a different one.");
    }
}


}

public static boolean checkifMakeExists(String userInputMake) {
    for (Car car : availableCars) {
        if (userInputMake.equalsIgnoreCase(car.getMake())) {
            return true;
        }
    } return false;
}

public static boolean checkifModelExists(String userInputMake, String userInputModel) {
    for (Car car : availableCars) {
        if (userInputMake.equalsIgnoreCase(car.getMake()) && userInputModel.equalsIgnoreCase(car.getModel())) {
            return true;
        }
    } return false;   
}

public static boolean checkifStyleExists(String userInputMake, String userInputModel, String userInputStyle) {
    for (Car car : availableCars) {
        if (userInputMake.equalsIgnoreCase(car.getMake()) && userInputModel.equalsIgnoreCase(car.getModel()) && userInputStyle.equalsIgnoreCase(car.getStyle())) {
            return true;
        }
    } return false;   
}
}
        /*

static class Details {
    static void Display (String carReg, int totalMiles, int taxRate, String insGroup) throws InterruptedException{
    System.out.println("Please enter the number of days you wish to see the rent price for");
    System.out.println("EXAMPLE: 5");
    Scanner in = new Scanner (System.in);
    int dayInput = Integer.parseInt(in.nextLine());
    Thread.sleep(3000);
    System.out.println("You have selected " +carOption + " for " +carMake +" " +carModel + " for " +dayInput + " day(s).");
    Thread.sleep(2000);
    System.out.println("Displaying information, please wait...");
    Thread.sleep(1000);
    System.out.println("Car registration: " + carReg);
    Thread.sleep(1000);
    System.out.println("Total Miles: " + totalMiles);
    Thread.sleep(1000);
    System.out.println("Tax Rate: £" + taxRate);
    Thread.sleep(1000);
    System.out.println("Insurance Group: " + insGroup);
    Thread.sleep(1000);
    totalPrice = (taxRate * dayInput * multiplier);
    System.out.println("Total Price: £" + totalPrice);
    Thread.sleep(5000);
    System.out.println("Program will close in 10 seconds. Restart to try a new selection.");
    Thread.sleep(10000);
    System.exit(0);
}
System.out.println("You selection is: " +carMake +" " +carModel +" " +carOption + ".");
Thread.sleep(2000);
System.out.println("Please type your full selection again to confirm.");
Thread.sleep(0500);
System.out.println("FORMAT: Make Model Option");
Thread.sleep(0500);
System.out.println("EXAMPLE: Audi A1 Estate");
Scanner in = new Scanner (System.in);
name4 = in.nextLine();
switchforDetails();
}
}
}
}
}
*/
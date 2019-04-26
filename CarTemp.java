import java.io.*;
import java.lang.*;
import java.util.*;

public class CarTemp {

    public static ArrayList<Car> availableCars = new ArrayList<Car>();

public static void main (String args[]) {

    /*
    DUMMY DATA
    // make, model, style, reg number, totalMiles, insuranceGroup, dayRate, taxRate
    */
    availableCars.add(new Car("Audi", "A1", "Estate", "SL42 SMR", 30000, 9, 100, 20));
    availableCars.add(new Car("Audi", "A1", "Hatchback", "ER39 DLR", 95000, 9, 200, 20));
    availableCars.add(new Car("Audi", "A1", "Hatchback", "BR11 LDI", 50000, 9, 300, 20));
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
        System.out.println("Finally, please enter for how many days you wish to rent this car for.");
        break;
    } else {
        System.out.println("We do not currently have cars of this style available. Please try a different one.");
    }
}

int userInputRentDays = -1;
    
    while (userInputRentDays < 1) {
    try {
        userInputRentDays = userPropertySelect.nextInt();

        if (userInputRentDays < 1) {
            System.out.println("Please enter a positive number.");
        } else {
            break;
        }
    } catch (InputMismatchException e) {
    System.out.println("Please enter a number.");
} userPropertySelect.nextLine();
}

ArrayList<Car> foundAvailableCars = selectAvailableCar(make, model, style);
System.out.println("Available cars found based on your search query: " + make.toUpperCase() + " " + model.toUpperCase() + " " + style.toUpperCase() + "\n");
System.out.println(foundAvailableCars);

System.out.println("\n" + "Please select one of the available cars by entering the corresponding number with the top one starting from 0.");

int userAvailableCarSelection = -1;
    
    while (true) {
    try {
        userAvailableCarSelection = userPropertySelect.nextInt();

        if (userAvailableCarSelection < 0) {
            System.out.println("Please enter a positive number.");
        } else if (userAvailableCarSelection > foundAvailableCars.size()-1) {
            System.out.println("Please enter a number that is within given selection.");
        } 
        else {
            break;
        }
    } catch (InputMismatchException e) {
        System.out.println("Please enter a number.");
    } userPropertySelect.nextLine();
}

CarBooking selectedCar = new CarBooking(foundAvailableCars.get(userAvailableCarSelection), userInputRentDays);
selectedCar.setPriceWithTax(foundAvailableCars.get(userAvailableCarSelection), userInputRentDays);
System.out.println(selectedCar + "\n" + "\n" + "Thanks for booking with us!");
}


public static ArrayList<Car> selectAvailableCar(String userInputMake, String userInputModel, String userInputStyle) {

    ArrayList<Car> foundAvailableCars = new ArrayList<Car>(); 
    
    for (Car car : availableCars) {
        if (userInputMake.equalsIgnoreCase(car.getMake()) && userInputModel.equalsIgnoreCase(car.getModel()) && userInputStyle.equalsIgnoreCase(car.getStyle())) {
            foundAvailableCars.add(car);
        }
    }
    return foundAvailableCars;
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
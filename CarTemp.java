import java.util.*;

public class CarTemp {

public static void main (String args[]) {

    ArrayList<Car> availableCarArray = new ArrayList<Car>();
    String chosenCarMake = "";
    String chosenCarModel = "";
    String chosenCarStyle = "";
    boolean makeAvailable = false;
    boolean modelAvailable = false;
    boolean styleAvailable = false;
    boolean optionAvailable = false;
    boolean rentDaysAvailable = false;
    int userOptionRentDayInput = -1;
    int chosenOption = -1;
    int chosenRentDays = -1;

    // load dummy car objects into an array
    availableCarArray = loadCarDummyData(availableCarArray);

    System.out.println("Please begin by entering the make of the car you wish to rent: ");
    Scanner userCarPropertySelect = new Scanner(System.in);

    /*
    Prompt user to input the car make, model and style they wish to rent and check if the selection
    is available by referencing the car objects in the availableCarArray array. Also check if
    the model and style inputs correspond to the originally selected make (ie: Audi does not have BMW's model S1)
    After checking, store the user's selected options in chosenCarMake, chosenCarModel and chosenCarStyle variables
    */
    while (true) {
    String userInput = userCarPropertySelect.next();

    if (checkifMakeExists(userInput, availableCarArray) == true && makeAvailable == false) {
        chosenCarMake = userInput;
        System.out.println("Great! Next, please select the car model.");
        makeAvailable = true;
        continue;
    } 
    if (checkifModelExists(chosenCarMake, userInput, availableCarArray) == true && modelAvailable == false) {
        chosenCarModel = userInput;
        System.out.println("Great! Next, please select the car style.");
        modelAvailable = true;
        continue;
    }

    if (checkifStyleExists(chosenCarMake, chosenCarModel, userInput, availableCarArray) == true && styleAvailable == false) {
        chosenCarStyle = userInput;
        styleAvailable = true;
        break;
    }
    System.out.println("Not available. Please try again.");
    }

    // return the user's selected car object(-s) and store it in the new foundAvailableCarArray array
ArrayList<Car> foundAvailableCarArray = selectAvailableCar(chosenCarMake, chosenCarModel, chosenCarStyle, availableCarArray);

System.out.println("Available cars found based on your search query: " + chosenCarMake.toUpperCase() + " " + chosenCarModel.toUpperCase() + " " + chosenCarStyle.toUpperCase() + "\n");
System.out.println(foundAvailableCarArray);

System.out.println("\n" + "Please select one of the available cars by entering the corresponding number with the top one starting from 0.");

    /*
    After the available car objects are printed on screen, the user is able to select which car object they wish to rent out of multiple
    Then the user enters the number of days they wish to rent the selected car for. Both are stored in chosenOption (0-length of array-1)
    and chosenRentDays
    */
    while (true) {
    try {
        userOptionRentDayInput = userCarPropertySelect.nextInt();

        if (userOptionRentDayInput >= 0 && userOptionRentDayInput <= foundAvailableCarArray.size()-1 && optionAvailable == false) {
            System.out.println("Please enter the amount of rent days: ");
            optionAvailable = true;
            chosenOption = userOptionRentDayInput;
            continue;
        }
        if (userOptionRentDayInput > 0 && optionAvailable == true && rentDaysAvailable == false) {
            rentDaysAvailable = true;
            chosenRentDays = userOptionRentDayInput;
            break;
        }
        System.out.println("Please enter a positive number that is within the selection.");
    } catch (InputMismatchException e) {
    System.out.println("Please enter a number.");
    } 
    userCarPropertySelect.nextLine();
}

// create a new booking with the selected car and number of rent days as parameters
CarBooking selectedCar = new CarBooking(foundAvailableCarArray.get(chosenOption), chosenRentDays);

// Call the CarBooking class object to calculate the total price of the booking
selectedCar.setPriceWithTax(foundAvailableCarArray.get(chosenOption), chosenRentDays);
System.out.println(selectedCar + "\n" + "\n" + "Thanks for booking with us!");
}

public static ArrayList<Car> loadCarDummyData(ArrayList<Car> listOfCars) {

    /*
    LOAD DUMMY CAR OBJECTS WITH DATA INTO ARRAY
    make, model, style, reg number, totalMiles, insuranceGroup, dayRate, taxRate
    */
    listOfCars.add(new Car("Audi", "A1", "Estate", "SL42 SMR", 30000, 9, 100, 20));
    listOfCars.add(new Car("Audi", "A1", "Hatchback", "ER39 DLR", 95000, 9, 200, 20));
    listOfCars.add(new Car("Audi", "A1", "Hatchback", "BR11 LDI", 50000, 9, 300, 20));
    listOfCars.add(new Car("Audi", "A3", "Estate", "DA28 ABL", 1000, 16, 500, 10));
    listOfCars.add(new Car("Audi", "A3", "Hatchback", "A9W2 1AF", 20000, 19, 250, 15));
    listOfCars.add(new Car("BMW", "S1", "Estate", "A5M3 1K2", 5000, 18, 300, 10));
    listOfCars.add(new Car("BMW", "S1", "Hatchback", "LA9S 2JH", 10000, 18, 300, 15));
    listOfCars.add(new Car("BMW", "S3", "Estate", "JDS2 A31", 100000, 20, 50, 10));
    listOfCars.add(new Car("Citroen", "C1", "Estate", "HDS1 ISD", 33000, 1, 100, 12));
    listOfCars.add(new Car("Citroen", "C4", "Hatchback", "9DSA 72B", 150000, 13, 20, 20));
    listOfCars.add(new Car("FIAT", "500", "Hatchback", "555A KDS", 49500, 9, 130, 5));
    listOfCars.add(new Car("FIAT", "500L", "Estate", "JS2A 8SA", 50000, 11, 200, 20));

    return listOfCars;
}

public static ArrayList<Car> selectAvailableCar(String userInputMake, String userInputModel, String userInputStyle, ArrayList<Car> listOfCars) {

    ArrayList<Car> foundAvailableCarArray = new ArrayList<Car>(); 
    
    for (Car car : listOfCars) {
        if (userInputMake.equalsIgnoreCase(car.getMake()) && userInputModel.equalsIgnoreCase(car.getModel()) && userInputStyle.equalsIgnoreCase(car.getStyle())) {
            foundAvailableCarArray.add(car);
        }
    }
    return foundAvailableCarArray;
}

public static boolean checkifMakeExists(String userInputMake, ArrayList<Car> listOfCars) {
    for (Car car : listOfCars) {
        if (userInputMake.equalsIgnoreCase(car.getMake())) {
            return true;
        }
    } return false;
}

public static boolean checkifModelExists(String userInputMake, String userInputModel, ArrayList<Car> listOfCars) {
    for (Car car : listOfCars) {
        if (userInputMake.equalsIgnoreCase(car.getMake()) && userInputModel.equalsIgnoreCase(car.getModel())) {
            return true;
        }
    } return false;   
}

public static boolean checkifStyleExists(String userInputMake, String userInputModel, String userInputStyle, ArrayList<Car> listOfCars) {
    for (Car car : listOfCars) {
        if (userInputMake.equalsIgnoreCase(car.getMake()) && userInputModel.equalsIgnoreCase(car.getModel()) && userInputStyle.equalsIgnoreCase(car.getStyle())) {
            return true;
        }
    } return false;   
}
}
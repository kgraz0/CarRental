import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class CarTemp {

public static void main (String args[]) {

    ArrayList<Car> availableCars = new ArrayList<Car>();

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
    Scanner carMakeInput = new Scanner(System.in);

    System.out.println(checkIfCarPropertyExists("Citroen", "C4", "Estate", availableCars, 2));

}

public static boolean checkIfCarPropertyExists(String userInputMake, String userInputModel, String userInputStyle, ArrayList<Car> availableCars, int userInputOption) {
    for (Car propertySelect : availableCars) {
        if (userInputOption == 0 && userInputMake.equals(propertySelect.getMake())) {
            return true;
        } else if (userInputOption == 1 && userInputMake.equals(propertySelect.getMake()) && userInputModel.equals(propertySelect.getModel())) {
            return true;
        } else if (userInputOption == 2 && userInputMake.equals(propertySelect.getMake()) && userInputModel.equals(propertySelect.getModel()) && userInputStyle.equals(propertySelect.getStyle())) {
            return true;
        }
    }
    return false;
}
/*
public static Car findCarProperty(String wantedMake, ArrayList<Car> availableCars) {
    for (Car carSelect : availableCars) {
        if (wantedMake.equals(carSelect.getMake())) {
            return carSelect;
        }
    }
    return null;
}
*/

}
        /*
static void switchforMake() throws InterruptedException {
switch (name) {
            case "Audi": carMake = "Audi"; break;
            case "BMW": carMake = "BMW"; break;
            case "Citroen": carMake = "Citroen"; break;
            case "FIAT": carMake = "FIAT"; break;
            case "Ford":  carMake = "Ford"; break;
            case "KIA": carMake = "KIA"; break;
            default : carMake = "unavailable make, please try again.";  System.out.println("You have selected invalid make."); Thread.sleep(2000); System.out.println("Type one from the available makes: Audi, BMW, Citroen, FIAT, Ford, KIA, Mercedes-Benz."); Scanner scanner = new Scanner (System.in); name = scanner.next(); switchforMake(); break;
}  
}
static void switchforModel() throws InterruptedException {
switch (name2) {
            case "A1": carModel = "A1"; break;
            case "A3": carModel = "A3"; break;
            case "A4": carModel = "A4"; break;
            case "S1": carModel = "S1"; break;
            case "S2":  carModel = "S2"; break;
            case "S3": carModel = "S3"; break;
            case "C1": carModel = "C1"; break;
            case "C3": carModel = "C3"; break;
            case "C4": carModel = "C4"; break;
            case "500": carModel = "500"; break;
            case "500C": carModel = "500C"; break;
            case "500L": carModel = "500L"; break;
            case "Mondeo": carModel = "Mondeo"; break;
            case "Fiesta": carModel = "Fiesta"; break;
            case "Mustang": carModel = "Mustang"; break;
            case "Sorento": carModel = "Sorento"; break;
            case "Soul": carModel = "Soul"; break;
            case "Rio": carModel = "Rio"; break;
            default : carModel = "unavailable make, please try again."; Thread.sleep(1000); System.out.println("You have selected unavailable model. Please try again."); Thread.sleep(1000); Scanner scanner = new Scanner (System.in); name2 = scanner.next(); switchforModel(); break;
}  
}
static void switchforOption() throws InterruptedException {
switch (name3) {
    case "Estate": carOption = "Estate"; break;
    case "Hatchback": carOption = "Hatchback"; break;
    default : carOption = "Invalid selection. Please try again."; Thread.sleep(1000); System.out.println("Invalid option."); Thread.sleep(1000); System.out.println("Type your option of either Estate or Hatchback for your selected car."); Scanner scanner = new Scanner (System.in); name3 = scanner.next(); switchforOption(); break;
}
}

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
static void switchforDetails() throws InterruptedException {
    switch (name4) {
        case "Audi A1 Estate": Details.Display("SL42 SMR",30000,15,"9"); break;
        case "Audi A1 Hatchback": Details.Display("ER39 DLR",95000,16,"9"); break;
        case "Audi A3 Estate": Details.Display("DA28 ABL",1000,10,"16"); break;
        case "Audi A3 Hatchback": Details.Display("A9W2 1AF",400000,1,"19"); break;
        case "Audi A4 Estate": Details.Display("JF2K BAD",1000000,2,"10"); break;
        case "Audi A4 Hatchback": Details.Display("WAT1 FA9",25000,8,"12"); break;
        case "BMW S1 Estate": Details.Display("A5M3 1K2",5000,10,"18"); break;
        case "BMW S1 Hatchback": Details.Display("LA9S 2JH",21000,6,"18"); break;
        case "BMW S2 Estate": Details.Display("LA9S 2JH",21000,6,"18"); break;
        case "BMW S2 Hatchback": Details.Display("JDS2 TSA",10000,5,"25E"); break;
        case "BMW S3 Estate": Details.Display("JDS2 A31",1000,20,"23"); break;
        case "BMW S3 Hatchback": Details.Display("UOS9 KDS",150000,8,"20"); break;
        case "Citroen C1 Estate": Details.Display("HDS1 ISD",4000,10,"1"); break;
        case "Citroen C1 Hatchback": Details.Display("SSD9 28S",10000,7,"2"); break;
        case "Citroen C3 Estate": Details.Display("KALS 62A",8000,15,"8"); break;
        case "Citroen C3 Hatchback": Details.Display("OS2A K1S",25000,10,"7"); break;
        case "Citroen C4 Estate": Details.Display("5S82 56A",60000,4,"9"); break;
        case "Citroen C4 Hatchback": Details.Display("9DSA 72B",10000,12,"13"); break;
        case "FIAT 500 Estate": Details.Display("555A KDS",5000,20,"15"); break;
        case "FIAT 500 Hatchback": Details.Display("W921 DSA",12000,15,"9"); break;
        case "FIAT 500C Estate": Details.Display("SK2S 1KA",500,30,"15"); break;
        case "FIAT 500C Hatchback": Details.Display("H321 32H",50,25,"13"); break;
        case "FIAT 500L Estate": Details.Display("JS2A 8SA",4000,17,"11"); break;
        case "FIAT 500L Hatchback": Details.Display("A74S L21",24000,12,"8"); break;
        case "Ford Mondeo Estate": Details.Display("H7SA 81A",50000,5,"17"); break;
        case "Ford Mondeo Hatchback": Details.Display("9SA1 7SB",8000,10,"22"); break;
        case "Ford Fiesta Estate": Details.Display("EAS2 8SB",5000,20,"8"); break;
        case "Ford Fiesta Hatchback": Details.Display("JDS8 NKL",21000,9,"7"); break;
        case "Ford Mustang Estate": Details.Display("NMLK 89X",15000,6,"18"); break;
        case "Ford Mustang Hatchback": Details.Display("XAMS X9A",60000,3,"18"); break;
        case "KIA Sorento Estate": Details.Display("JHDS AB2",50000,5,"26"); break;
        case "KIA Sorento Hatchback": Details.Display("XJAK 8AZ",12000,13,"30"); break;
        case "KIA Soul Estate": Details.Display("ZAM0 9ZA",800000,1,"17"); break;
        case "KIA Soul Hatchback": Details.Display("XKS9 KZB",14000,8,"19"); break;
        case "KIA Rio Estate": Details.Display("DSA5 4AZ",20000,7,"5"); break;
        case "KIA Rio Hatchback": Details.Display("LAKZ 7SA",5000,15,"3"); break;
        default : System.out.println("unavailable selection, please try again."); 
        System.out.println("You selection is: " +carMake +" " +carModel +" " +carOption + "."); System.out.println("FORMAT: Make Model Option"); Thread.sleep(0500); System.out.println("EXAMPLE: Audi A1 Estate"); Scanner in = new Scanner (System.in); name4 = in.nextLine(); switchforDetails();               
}
}

public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello! Thank you for using our program!");
        Thread.sleep(5000);
        System.out.println("To start off, please select the make of the car you wish to see the rent price for...");
        Thread.sleep(3000);
        System.out.println("Type one from the available makes: Audi, BMW, Citroen, FIAT, Ford, KIA, Mercedes-Benz.");
        Scanner scanner = new Scanner (System.in);
        name = scanner.next();
        switchforMake();
        
if (    "Audi".equals(carMake)) {
         Thread.sleep(2000);     
         System.out.println("You have selected " +carMake +".");
         Thread.sleep(3000);
         System.out.println("Next, please select the model of your chosen car...");
         Thread.sleep(2000);
         System.out.println("Type one of the following available " +carMake +" models: A1, A3, A4.");
         name2 = scanner.next();
         switchforModel();
}
if (    "BMW".equals(carMake)) {
         Thread.sleep(2000);
         System.out.println("You have selected " +carMake +".");
         Thread.sleep(3000);
         System.out.println("Next, please select the model of your chosen car...");
         Thread.sleep(2000);
         System.out.println("Type one of the following available " +carMake +" models: S1, S2, S3.");
         name2 = scanner.next();
         switchforModel();
}
if (    "Citroen".equals(carMake)) {
         Thread.sleep(2000);
         System.out.println("You have selected " +carMake +".");
         Thread.sleep(3000);
         System.out.println("Next, please select the model of your chosen car...");
         Thread.sleep(2000);
         System.out.println("Type one of the following available " +carMake +" models: C1, C3, C4."); 
         name2 = scanner.next();
         switchforModel();
}   
if (    "FIAT".equals(carMake)) {
         Thread.sleep(2000);
         System.out.println("You have selected " +carMake +".");
         Thread.sleep(3000);
         System.out.println("Next, please select the model of your chosen car...");
         Thread.sleep(2000);
         System.out.println("Type one of the following available " +carMake +" models: 500, 500C, 500L."); 
         name2 = scanner.next();
         switchforModel();
}   
if (    "Ford".equals(carMake)) {
         Thread.sleep(2000);
         System.out.println("You have selected " +carMake +".");
         Thread.sleep(3000);
         System.out.println("Next, please select the model of your chosen car...");
         Thread.sleep(2000);
         System.out.println("Type one of the following available " +carMake +" models: Mondeo, Fiesta, Mustang."); 
         name2 = scanner.next();
         switchforModel();
}   
if (    "KIA".equals(carMake)) {
         Thread.sleep(2000);
         System.out.println("You have selected " +carMake +".");
         Thread.sleep(3000);
         System.out.println("Next, please select the model of your chosen car...");
         Thread.sleep(2000);
         System.out.println("Type one of the following available " +carMake +" models: Sorento, Soul, Rio."); 
         name2 = scanner.next();
         switchforModel();
}   
if ("A1".equals(carModel)||"A3".equals(carModel)||"A4".equals(carModel)||"S1".equals(carModel)||"S2".equals(carModel)||"S3".equals(carModel)||"C1".equals(carModel)
  ||"C3".equals(carModel)||"C4".equals(carModel)||"500".equals(carModel)||"500C".equals(carModel)||"500L".equals(carModel)||"Mondeo".equals(carModel)||"Fiesta".equals(carModel)
  ||"Mustang".equals(carModel)||"Sorento".equals(carModel)||"Soul".equals(carModel)||"Rio".equals(carModel)){
    Thread.sleep(2000);
    System.out.println("You have selected " +carMake +" " +carModel +".");
    Thread.sleep(3000);
    System.out.println("Please select the option between Estate or Hatchback for " +carMake +" " +carModel +".");
    name3 = scanner.next();
    switchforOption();
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
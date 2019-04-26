public class CarBooking extends Car {
	int numOfDays;
	static int priceWithTax;
	Car selectedCar;

	public CarBooking(Car selectedCar, int numOfDays) {
		this.selectedCar = selectedCar;
		this.numOfDays = numOfDays;

	}
// setters and getters to update class values
public int getNumOfDays() {
	return numOfDays;
}

public int getPriceWithTax() {
	return priceWithTax;
}

public void setNumOfDays(int numOfDays) {
	this.numOfDays = numOfDays;
}

// set total price 
public static void setPriceWithTax(Car selectedCar, int numOfDays) {
	int basePrice = selectedCar.getdayBasePrice();
	int taxRate = selectedCar.getTaxRate(); 

	priceWithTax = (basePrice + (basePrice * taxRate / 100)) * numOfDays;
}

@Override
    public String toString() {
        return 
        "Selected car: " + selectedCar 
        + "Number of days: " + numOfDays + "\n"
        + "Price with tax: " + priceWithTax;
    }
}
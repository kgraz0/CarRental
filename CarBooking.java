public class CarBooking extends Car {
	int numOfDays;
	int priceWithTax;
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

public void setPriceWithTax(Car selectedCar, int numOfDays) {
	/*
	 calculate the total price of the car based on car's individual base price,
	 tax rate and multiply that by number of days the user selected to rent for
	*/
	int basePrice = selectedCar.getdayBasePrice();
	int taxRate = selectedCar.getTaxRate(); 
	int totalTax = ((numOfDays * basePrice) * taxRate) / 100; 

	priceWithTax = (numOfDays * basePrice) + totalTax;
}

@Override
    public String toString() {
        return 
        "Selected car: " + selectedCar 
        + "Number of days: " + numOfDays + "\n"
        + "Price with tax: " + priceWithTax;
    }
}
public class CarBooking extends Car {
	int numOfDays;
	static int priceWithTax;

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

public static void setPriceWithTax(int basePrice, int taxRate) {
	priceWithTax = basePrice + (basePrice * taxRate / 100);
}
}
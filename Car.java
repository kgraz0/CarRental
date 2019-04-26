public class Car {
	String make;
	String model;
	String style;
	String registrationNumber;
	int totalMiles;
	int insuranceGroup;
	int taxRate;
    int dayBasePrice;

    public Car() {
    }

	public Car(String make, String model, String style, String registrationNumber, int totalMiles, int insuranceGroup, int dayBasePrice, int taxRate) {
		this.make = make;
		this.model = model;
		this.style = style;
		this.registrationNumber = registrationNumber;
		this.totalMiles = totalMiles;
		this.insuranceGroup = insuranceGroup;
		this.dayBasePrice = dayBasePrice;
		this.taxRate = taxRate;
	}

// setters and getters to update class values
public String getMake() {
	return make;
}

public String getModel() {
	return model;
}

public String getStyle() {
	return style;
}

public String getRegistrationNumber() {
	return registrationNumber;
}

public int getTotalMiles() {
	return totalMiles;
}

public int getInsuranceGroup() {
	return insuranceGroup;
}

public int getTaxRate() {
	return taxRate;
}

public int getdayBasePrice() {
	return dayBasePrice;
}

public void setMake(String make) {
	this.make = make;
}

public void setModel(String model) {
	this.model = model;
}

public void setStyle(String style) {
	this.style = style;
}

public void setRegistrationNumber(String registrationNumber) {
	this.registrationNumber = registrationNumber;
}

public void setTotalMiles(int totalMiles) {
	this.totalMiles = totalMiles;
}

public void setInsuranceGroup(int insuranceGroup) {
	this.insuranceGroup = insuranceGroup;
}

public void setTaxRate(int taxRate) {
	this.taxRate = taxRate;
}

public void setdayBasePrice(int dayBasePrice) {
	this.dayBasePrice = dayBasePrice;
}

@Override
    public String toString() {
        return 
        "Registration number: " + registrationNumber
        + "\n" + "Total Miles: " + totalMiles 
        + "\n" + "Insurance Group: " + insuranceGroup
        + "\n" + "Tax Rate: " + taxRate
        + "\n" + "Base Day Price: " + dayBasePrice 
        + "\n" + "\n";
    }
    }
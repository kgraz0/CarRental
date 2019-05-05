Car Rental System with the user being able to select the following attributes, if available, for rental;
1. The make of the car
2. The model of the car (dependant on #1)
3. The style of the car (dependant on #1 and #2)

Three classes (CarTemp, CarBooking and Car) are used; CarBooking inherits Car.

User enters the Make, Model and Style of the car and is then given a selection of Car objects that match that query. If applicable, the user is given an option (Integer from 0) to select the car they wish to select out of multiple matches. Finally, the user enters the amount of days they wish to rent the car for, and, depending on the car's individual base price, individual tax rate and user's selection of rent days, the total price is calculated and returned back to the user.

To run: compile CarTemp.java and run CarTemp.

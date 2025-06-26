package OOPS.Constructors;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    final int costPerDay = 1000;
    CarRental() {
        customerName = "Unknown";
        carModel = "Standard";
        rentalDays = 1;
    }
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    int calculateCost() {
        return rentalDays * costPerDay;
    }

    void displayRental() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateCost());
    }
}

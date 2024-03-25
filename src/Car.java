public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    public boolean isElectric() {
        return electric;
    }

    public boolean isDiscountApplied() {
        return discountApplied;
    }

    public void printCar() {
        String str = "";
        str += "License Plate: " + getLicensePlate();
        str += "\nToll Fee: " + getTollFee();
        str += "\nNumber of Passengers: " + getPassengers();
        str += "\nIs Electric: " + electric;
        str += "\nIs Discount Applied: " + discountApplied;
        System.out.println(str);
    }

    public boolean dropOffPassengers(int numOut) {
        if (numOut < getPassengers()) {
            setPassengers(getPassengers() - numOut);
            return true;
        } else {
            return false;
        }
    }

    public void applyDiscount() {
        if (!discountApplied)
    }
}
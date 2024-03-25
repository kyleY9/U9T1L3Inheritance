public class Taxi extends Car {
    private double fareCollected;

    public Taxi(String licensePlate,
                double tollFee,
                int passengers,
                boolean electric,
                double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {
        return fareCollected;
    }

    public void printTaxi() {
        printCar();
        System.out.println("Fare Collected: " + fareCollected);
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        fareCollected += numRiders * farePerRider;
        if (getPassengers() >= 4 && !isDiscountApplied()) {
            setTollFee(getTollFee() * 0.5);
            setDiscountApplied(true);
        }
    }
}

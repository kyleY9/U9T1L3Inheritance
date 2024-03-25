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


}

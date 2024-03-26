public class MonsterTruck extends Truck {
    private double wheelDiameter; // in feet!

    public MonsterTruck(String licensePlate,
                        double tollFee,
                        int passengers,
                        int axles,
                        boolean hasTrailer,
                        double wheelDiameter) {
        super(licensePlate, tollFee, passengers, axles, hasTrailer);
        this.wheelDiameter = wheelDiameter;
    }

    public double getWheelDiameter() {
        return wheelDiameter;
    }

    public void doAFlip() {
        System.out.println("I just did a monster flip! Cool, right!?!?");
    }

    public void printMonsterTruck() {
        printTruck();
        System.out.println("Wheel Diameter (in feet): " + wheelDiameter);
    }
}

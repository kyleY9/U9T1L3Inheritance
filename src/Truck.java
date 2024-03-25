public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public int getAxles() {
        return axles;
    }

    public boolean hasTrailer() {
        return hasTrailer;
    }

    public void printTruck() {
        String str = "";
        str += "License Plate: " + getLicensePlate();
        str += "\nToll Fee: " + getTollFee();
        str += "\nNumber of Passengers: " + getPassengers();
        str += "\nNumber of Axles: " + axles;
        str += "\nHas Trailer: " + hasTrailer;
        System.out.println(str);
    }

    public boolean validateLicensePlate() {
        if (hasTrailer && axles > 4) {
            return getLicensePlate().indexOf("MX") > 0;
        } else if (hasTrailer && axles <= 4) {
            return getLicensePlate().indexOf("LX") > 0;
        } else {
            return true;
        }
    }
}
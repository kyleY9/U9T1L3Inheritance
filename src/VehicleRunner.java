public class VehicleRunner {
    public static void main(String[] args) {
        // -------------- LAB PART 1 -----------------
        // a. write code to create a Vehicle object with license "MC56WQ",
        //    toll fee of 10.75, and 5 passengers.
        //    Print out the calculated toll TollPrice.
        Vehicle vehicleOne = new Vehicle("MC56WQ", 10.75, 5);
        System.out.println(vehicleOne.calculateTollPrice());

        // b. write code to create an electric Car with license "KXN73F",
        //    toll fee of 8.50, and 2 passengers.
        //    Print out the calculated toll price
        Car electricCar = new Car("KXN73F", 8.5, 2, true);
        System.out.println(electricCar.calculateTollPrice());

        // c. add a printCar() void method to the Car class that prints the
        //    Car's license plate, toll fee, number of passengers, whether it is electric,
        //    and whether a discount has been applied.
        //
        // d. call the method on the Car you made in c to test it.
        electricCar.printCar();

        // e. write code to create a Truck with license "3K9JMX",
        //    a toll fee of 24.75, 4 passengers, 6 axles, with a trailer.
        //    Print out the calculated toll price
        Truck truckOne = new Truck("3K9JMX", 24.75, 4, 6, true);
        System.out.println(truckOne.calculateTollPrice());

        // f. add a printTruck() void method to the Truck class that prints the
        //    Truck's license plate, toll fee, number of passengers, number of axles,
        //    and whether it has a trailer.
        //
        // g. call the method on the Truck you made in e to test it.
        truckOne.printTruck();

        // ------------ LAB PART 2 ---------------
        // ----- instructions in lab sheet -------
        System.out.println();
        Taxi taxiOne = new Taxi("8KM23Z", 9.25, 3, true, 5);
        taxiOne.printTaxi();
        System.out.println();

        // from Vehicle
        System.out.println(taxiOne.getLicensePlate());
        System.out.println(taxiOne.getTollFee());
        System.out.println(taxiOne.getPassengers());
        System.out.println(taxiOne.calculateTollPrice());
        // from Car
        System.out.println(taxiOne.isElectric());
        System.out.println(taxiOne.isDiscountApplied());
        taxiOne.printCar();
        // from Taxi
        System.out.println(taxiOne.getFareCollected());
        taxiOne.printTaxi();

        // test for parent-child relationship
        System.out.println(taxiOne instanceof Car);
        System.out.println(taxiOne instanceof Vehicle);



        // ------------ LAB PART 3 ---------------
        // ----- instructions in lab sheet -------
        System.out.println("\n--- Testing method on a Car object ---");
        Car testCar1 = new Car("KXN73F", 8.50, 5, true);
        System.out.println(testCar1.getPassengers());
        System.out.println("-----------");
        boolean success = testCar1.dropOffPassengers(3);
        System.out.println(success);
        System.out.println(testCar1.getPassengers());
        System.out.println("-----------");
        success = testCar1.dropOffPassengers(3);
        System.out.println(success);
        System.out.println(testCar1.getPassengers());
        System.out.println("--- Testing method on a Taxi object ---");
        Taxi testTaxi1 = new Taxi("JMD645", 10.35, 3, false, 5.0);
        System.out.println(testTaxi1.getPassengers());
        System.out.println("-----------");
        success = testTaxi1.dropOffPassengers(3);
        System.out.println(success);
        System.out.println(testTaxi1.getPassengers());
        System.out.println("-----------");
        success = testTaxi1.dropOffPassengers(2);
        System.out.println(success);
        System.out.println(testTaxi1.getPassengers());
        System.out.println("-----------");

        System.out.println();

        Car carTwo = new Car("AA1111", 10, 5, false);
        Taxi taxiTwo = new Taxi("BB2222", 10, 15, true, 20);
        System.out.println("Num Passengers for Car #2 Before: " + carTwo.getPassengers());
        System.out.println("Num Passengers for Taxi #2 Before: " + taxiTwo.getPassengers());
        carTwo.dropOffPassengers(4);
        taxiTwo.dropOffPassengers(10);
        System.out.println("Num Passengers for Car #2 After: " + carTwo.getPassengers());
        System.out.println("Num Passengers for Taxi #2 After: " + taxiTwo.getPassengers());

    }
}
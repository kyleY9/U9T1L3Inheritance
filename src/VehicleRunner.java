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
        System.out.println("--------- TEST 1 ---------");
        System.out.println("---- non-electric Taxi ---");
        System.out.println("--------------------------");
        Taxi t1 = new Taxi("JMD645", 10.0, 1, false, 5.0); // not electric
        t1.applyDiscount();
        System.out.println("discount already applied? " + t1.isDiscountApplied());
        System.out.println("toll fee: " + t1.getTollFee());
        System.out.println("total fare collected: " + t1.getFareCollected());
        System.out.println("total passengers: " + t1.getPassengers());
        if (!t1.isDiscountApplied() && t1.getTollFee() == 10.0 && t1.getFareCollected() == 5.0 && t1.getPassengers() == 1) {
            System.out.println("------------------------ TEST 1a PASS!");
        } else {
            System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 1a FAIL!!!!!!!!!!!!!!!!!! ---");
        }
        t1.pickupRiders(2, 3.75);
        System.out.println("discount already applied? " + t1.isDiscountApplied());
        System.out.println("toll fee: " + t1.getTollFee());
        System.out.println("total fare collected: " + t1.getFareCollected());
        System.out.println("total passengers: " + t1.getPassengers());
        if (!t1.isDiscountApplied() && t1.getTollFee() == 10.0 && t1.getFareCollected() == 12.5 && t1.getPassengers() == 3) {
            System.out.println("------------------------ TEST 1b PASS!");
        } else {
            System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 1b FAIL!!!!!!!!!!!!!!!!!! ---");
        }
        t1.pickupRiders(2, 5.90);
        System.out.println("discount already applied? " + t1.isDiscountApplied());
        System.out.println("toll fee: " + t1.getTollFee());
        System.out.println("total fare collected: " + t1.getFareCollected());
        System.out.println("total passengers: " + t1.getPassengers());
        if (t1.isDiscountApplied() && t1.getTollFee() == 5.0 && t1.getFareCollected() == 24.3 && t1.getPassengers() == 5) {
            System.out.println("------------------------ TEST 1c PASS!");
        } else {
            System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 1c FAIL!!!!!!!!!!!!!!!!!! ---");
        }
        t1.pickupRiders(3, 3.40);
        System.out.println("discount already applied? " + t1.isDiscountApplied());
        System.out.println("toll fee: " + t1.getTollFee());
        System.out.println("total fare collected: " + t1.getFareCollected());
        System.out.println("total passengers: " + t1.getPassengers());
        if (t1.isDiscountApplied() && t1.getTollFee() == 5.0 && t1.getFareCollected() == 34.5 && t1.getPassengers() == 8) {
            System.out.println("------------------------ TEST 1d PASS!");
        } else {
            System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 1d FAIL!!!!!!!!!!!!!!!!!! ---");
        }
        System.out.println("\n--------- TEST 2 ---------");
        System.out.println("----- electric Taxi ------");
        System.out.println("--------------------------");
        Taxi t2 = new Taxi("KCD123", 25, 1, true, 6.0); // electric
        t2.applyDiscount();
        System.out.println("discount already applied? " + t2.isDiscountApplied());
        System.out.println("toll fee: " + t2.getTollFee());
        System.out.println("total fare collected: " + t2.getFareCollected());
        System.out.println("total passengers: " + t2.getPassengers());
        if (t2.isDiscountApplied() && t2.getTollFee() == 12.5 && t2.getFareCollected() == 6.0 && t2.getPassengers() == 1) {
            System.out.println("------------------------ TEST 2a PASS!");
        } else {
            System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 2a FAIL!!!!!!!!!!!!!!!!!! ---");
        }
        t2.pickupRiders(2, 3.7);
        System.out.println("discount already applied? " + t2.isDiscountApplied());
        System.out.println("toll fee: " + t2.getTollFee());
        System.out.println("total fare collected: " + t2.getFareCollected());
        System.out.println("total passengers: " + t2.getPassengers());
        if (t2.isDiscountApplied() && t2.getTollFee() == 12.5 && t2.getFareCollected() == 13.4 && t2.getPassengers() == 3) {
            System.out.println("------------------------ TEST 2b PASS!");
        } else {
            System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 2b FAIL!!!!!!!!!!!!!!!!!! ---");
        }
        t2.pickupRiders(2, 4.75);
        System.out.println("discount already applied? " + t2.isDiscountApplied());
        System.out.println("toll fee: " + t2.getTollFee());
        System.out.println("total fare collected: " + t2.getFareCollected());
        System.out.println("total passengers: " + t2.getPassengers());
        if (t2.isDiscountApplied() && t2.getTollFee() == 12.5 && t2.getFareCollected() == 22.9 && t2.getPassengers() == 5) {
            System.out.println("------------------------ TEST 2c PASS!");
        } else {
            System.out.println("------------------------ !!!!!!!!!!!!!!!TEST 2c FAIL!!!!!!!!!!!!!!!!!! ---");
        }
    }
}
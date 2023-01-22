public class Main {
    public static void main(String[] args) {
        Car c1 = new Car ();

        System.out.println("Car Trip");

        c1.setTripNumber("35234"); c1.setDistance(120);
        c1.setSpeed(55); c1.setStartTime("00:00");
        c1.setNoOfStops(1); c1.setStopDuration(55);

        System.out.println(c1.Display());
        c1.calculateDuration();
        System.out.println("\n\nFuel Consumption");
        c1.setFuel(20);
        c1.FuelConsumption();

        System.out.println("\n\nTrain Trip");

        Train t1 = new Train();
        t1.setTripNumber("57293"); t1.setDistance(130.0);
        t1.setSpeed(60.0); t1.setStartTime("00:00");

        System.out.println(t1.Display());

        System.out.println("\n\nAirplane Trip");

        Airplane a1 = new Airplane();
        a1.setTripNumber("93841"); a1.setDistance(1500);
        a1.setSpeed(700); a1.setStartTime("00:00");

        System.out.println(a1.Display());
    }
}
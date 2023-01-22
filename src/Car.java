import java.time.Duration;

public class Car extends Trip{
    double fuel ;
    double miles, gallons, LitersPerKilometer, milesPerGallon;

    int NoOfStops ;

    int stopDuration;


    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }


    public int getNoOfStops() {
        return NoOfStops;
    }

    public void setNoOfStops(int noOfStops) {
        NoOfStops = noOfStops;
    }

    public int getStopDuration() {
        return stopDuration;
    }

    public void setStopDuration(int stopDuration) {
        this.stopDuration = stopDuration;
    }

    public void FuelConsumption(){
        // Formula
        LitersPerKilometer=(fuel/super.getDistance())*100;
        miles=(super.getDistance()*0.6214); // convert distance to miles
        gallons=(fuel*0.2642); // convert fuel litter per hour to gallon per hour
        milesPerGallon=miles/gallons; // miles per gallon

        String LitersPerKilometer1=String.format("%.2f",LitersPerKilometer);

        String milespergallon1=String.format("%.2f",milesPerGallon);

        System.out.println("Liters for each 100KM\n"+LitersPerKilometer1);

        System.out.println("Miles for each gallons\n"+milespergallon1);
    }
    @Override
    public int calculateDuration() {
        String minute = "";
        String hour = "";

        // Full Duration
        double duration = super.getDistance()/super.getSpeed();

        // Stops Additional Minutes
        double AddtionalMinutes = stopDuration*NoOfStops;

        double mintohour =AddtionalMinutes/60;

        duration += mintohour ; // 4 + 0.60 = 4.60

        // Decimal points

        double x = duration - Math.floor(duration); // 0,30

        hour = String.format("0%d", (int) duration); //4 + (60*1/60) = 5
        boolean a = false;
        int addmintue = (int)(AddtionalMinutes * 1 / 60);
        if(addmintue==1){
            a=true;
        }
        if(a==true) { // if converting additional min == one
            minute = String.format("%.0f0", x=0); // minutes = 00
        } else if(x<=0.15) {
            minute = String.format("0%.0f", x * 60);
        } else if( x> 0.15 && x<100 ){
            minute = String.format("%.0f", x * 60);
        }
        String totalDistance = (hour+minute);
        System.out.print("And we will arrive at "+hour+":"+minute);
        return Integer.parseInt(totalDistance);
    }

    public String Display() {
        return "The Car Trip "+"have started \n"+
                "It will starts at "+super.getStartTime()+
                "\nTrip Speed is "+super.getSpeed()+" km/h \n" +
                "at a distance of "+super.getDistance()+" km" +
                "\nNumber of stops in this trip "+getNoOfStops() +
                "\nStop duration is "+getStopDuration()+" Mintues" ;


    }
}

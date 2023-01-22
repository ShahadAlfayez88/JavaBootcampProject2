public class Train extends Trip{

    public int calculateDuration() {

        // Full Duration
        double duration = super.getDistance()/super.getSpeed();

        // Decimal points
        double x = duration - Math.floor(duration);

        String hour = String.format("0%d", (int)duration);

        String minute = String.format("%.0f",x*60);

        String totalDistance = (hour+minute);
        System.out.print("And we will arrive at "+hour+":"+minute);
        return Integer.parseInt(totalDistance);
    }

    public String Display() {
        return "The Train Trip Number "+ super.getTripNumber()+" have started \n"+
                "It will starts at "+super.getStartTime()+
                "\nTrip Speed is "+super.getSpeed()+" km/h \n" +
                "at a distance of "+super.getDistance()+" km" ;


    }
}

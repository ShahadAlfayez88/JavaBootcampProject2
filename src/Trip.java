public abstract class Trip {
    private String TripNumber;
    private double distance;
    private double speed;
    private String startTime;

    public String getTripNumber() {
        return TripNumber;
    }

    public void setTripNumber(String tripNumber) {
        TripNumber = tripNumber;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public abstract int calculateDuration();

    public double convertMinToHour(int min){
        double hour = min/60;
        return hour;
    }

    public String calculateArrivalTime(){
        String minute = "";
        // Full Duration
        double duration = getDistance()/getSpeed();

        // Decimal points
        double x = duration - Math.floor(duration);

        String hour = String.format("0%d", (int)duration);

        if(x<=0.15) {
             minute = String.format("0%.0f", x * 60);
        } else{
            minute = String.format("%.0f", x * 60);}

        String totalDistance = (hour+":"+minute);
        return totalDistance;
    }

}

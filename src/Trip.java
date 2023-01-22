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
        return "";
    }

}

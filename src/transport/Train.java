package transport;

public class Train extends Transport {
    private double tripPrice;
    private int travelTime;
    private String departureStation;
    private String arrivalStation;
    private int wagonsCount;

    public Train(String brand,
                 String model,
                 int year,
                 String country,
                 String color,
                 int maxSpeed,
                 String fuelType,
                 double fuelPercentage,
                 double tripPrice,
                 int travelTime,
                 String departureStation,
                 String arrivalStation,
                 int wagonsCount) {
        super(brand, model, year, country, color, maxSpeed, fuelType, fuelPercentage);
        setTripPrice(tripPrice);
        setTravelTime(travelTime);
        setDepartureStation(departureStation);
        setArrivalStation(arrivalStation);
        setWagonsCount(wagonsCount);
    }

    @Override
    public void refill() {
        System.out.println(getBrand() + " " + getModel() + ", тип топлива: " + getFuelType());
        setFuelPercentage(100);
    }

    @Override
    public String toString() {
        return "Train{" +
                super.toString() +
                ", tripPrice=" + tripPrice +
                ", travelTime=" + travelTime +
                ", departureStation='" + departureStation + '\'' +
                ", arrivalStation='" + arrivalStation + '\'' +
                ", wagonsCount=" + wagonsCount +
                "} ";
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = (tripPrice <= 0) ? 1000 : tripPrice;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = (travelTime <= 0) ? 60 : travelTime;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = (departureStation == null || departureStation.isBlank())
                ? "станция отбытия неизвестна" : departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = (arrivalStation == null || arrivalStation.isBlank())
                ? "станция прибытия неизвестна" : arrivalStation;
    }

    public int getWagonsCount() {
        return wagonsCount;
    }

    public void setWagonsCount(int wagonsCount) {
        this.wagonsCount = (wagonsCount <= 0) ? 1 : wagonsCount;
    }
}

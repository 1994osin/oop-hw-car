package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;
    private String fuelType;
    private double fuelPercentage;

    public Transport(String brand,
                     String model,
                     int year,
                     String country,
                     String color,
                     int maxSpeed,
                     String fuelType,
                     double fuelPercentage) {
        this.brand = (brand == null || brand.isBlank()) ? "default" : brand;
        this.model = (model == null || model.isBlank()) ? "default" : model;
        this.year = (year <= 0) ? 2000 : year;
        this.country = (country == null || country.isBlank()) ? "Россия" : country;
        setColor(color);
        setMaxSpeed(maxSpeed);
        setFuelType(fuelType);
        setFuelPercentage(fuelPercentage);
    }

    public abstract void refill();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", fuelType='" + fuelType + '\'' +
                ", fuelQuantity=" + String.format("%.2f", fuelPercentage) +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = (color == null || color.isBlank()) ? "белый" : color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = (maxSpeed <= 0) ? 100 : maxSpeed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = (fuelType == null || fuelType.isBlank()) ? "дизель" : fuelType;
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public void setFuelPercentage(double fuelPercentage) {
        if (fuelPercentage < 0) {
            this.fuelPercentage = 0;
        } else if (fuelPercentage > 100) {
            this.fuelPercentage = 100;
        } else {
            this.fuelPercentage = fuelPercentage;
        }

    }
}

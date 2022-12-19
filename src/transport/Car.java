package transport;

import java.time.LocalDate;

public class Car extends Transport {
    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteEngineStart=" + remoteEngineStart +
                    ", keylessAccess=" + keylessAccess +
                    '}';
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate expirationDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expirationDate, double cost, String number) {
            this.expirationDate = (expirationDate == null) ? LocalDate.now().plusYears(1) : expirationDate;
            this.cost = (cost <= 0) ? 10000 : cost;
            this.number = (number == null || number.isBlank()) ? "123456789" : number;
        }

        public void printExpired() {
            if (expirationDate.isBefore(LocalDate.now()) || expirationDate.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно поменять страховку!");
            }
        }

        public void printIsCorrectNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }

        @Override
        public String toString() {
            return "Insurance{" +
                    "expirationDate=" + expirationDate +
                    ", cost=" + cost +
                    ", number='" + number + '\'' +
                    '}';
        }

        public LocalDate getExpirationDate() {
            return expirationDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }
    }

    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTires;
    Key key;
    Insurance insurance;


    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               int maxSpeed,
               String fuelType,
               double fuelPercentage,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               boolean summerTires,
               Key key,
               Insurance insurance) {
        super(brand, model, year, country, color, maxSpeed, fuelType, fuelPercentage);
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        this.bodyType = (bodyType == null || bodyType.isBlank()) ? "седан" : bodyType;
        setRegistrationNumber(registrationNumber);
        this.numberOfSeats = (numberOfSeats <= 0) ? 4 : numberOfSeats;
        this.summerTires = summerTires;
        setKey(key);
        setInsurance(insurance);
    }

    @Override
    public void refill() {
        System.out.println(getBrand() + " " + getModel() + ", тип топлива: " + getFuelType());
        setFuelPercentage(100);
    }

    public void changeTiresForSeason(int numberMonth) {
        if (numberMonth == 1 || numberMonth == 2 || numberMonth == 3 || numberMonth == 10 || numberMonth == 11
                || numberMonth == 12) {
            setSummerTires(false);
        }
        if (numberMonth == 4 || numberMonth == 5 || numberMonth == 6 || numberMonth == 7 || numberMonth == 8
                || numberMonth == 9) {
            setSummerTires(true);
        }
    }

    public boolean licensePlateCheck() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3])
                && Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8])
                && Character.isLetter(chars[0]) && Character.isLetter(chars[4]) && Character.isLetter(chars[5]);
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString() +
                ", engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", summerTires=" + summerTires +
                ", key=" + key +
                ", insurance=" + insurance +
                "} ";
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = (engineVolume <= 0) ? 1.5 : engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = (transmission == null || transmission.isBlank()) ? "МКПП" : transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = (registrationNumber == null || registrationNumber.isBlank()) ? "х000хх000" : registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = (key == null) ? new Key(false, false) : key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = (insurance == null) ?
                new Insurance(LocalDate.now().plusYears(1), 10000, "123456789") : insurance;
    }
}
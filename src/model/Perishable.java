package model;

public abstract class Perishable {
    private int expirationDay; // Example: day 10

    public Perishable(int expirationDay) {
        this.expirationDay = expirationDay;
    }

    public boolean isExpired(int currentDay) {
        return currentDay > expirationDay;
    }

    public int getExpirationDay() {
        return expirationDay;
    }
}
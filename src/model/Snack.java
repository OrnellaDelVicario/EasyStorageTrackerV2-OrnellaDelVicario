package model;

public class Snack extends Perishable {
    private String name;

    public Snack(String name, int expirationDay) {
        super(expirationDay);
        this.name = name;
    }

    public String toString() {
        return "Snack: " + name + " (expires on day " + getExpirationDay() + ")";
    }
}
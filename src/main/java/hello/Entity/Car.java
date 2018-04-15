package hello.Entity;

public class Car {

    private String brand, color, vin;
    private int year;

    public Car() {

    }

    public Car(String brand, int year, String color, String vin) {
        super();
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.vin = vin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}
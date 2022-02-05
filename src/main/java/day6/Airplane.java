package day6;


public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Airplane(String manufacturer, int year, int length, int weight, int fuel) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    void info() {
        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %d, вес: %d," +
                " количество топлива в баке: %d", manufacturer, year, length, weight, fuel);
    }

    int fillUp(int n) {
        this.fuel = n;
        return fuel;
    }
}
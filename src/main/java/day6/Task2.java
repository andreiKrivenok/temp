package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("Airbus", 2018, 60, 35, 20);

        airplane.setYear(2020);
        airplane.setLength(65);
        airplane.fillUp(25);
        airplane.fillUp(30);
        airplane.info();

    }
}


package day5;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setModel("Bugatti");
        car.setColor("Orange");
        car.setYear(2020);

        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getYear());
    }
}

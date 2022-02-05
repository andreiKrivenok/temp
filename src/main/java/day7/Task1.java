package day7;

public class Task1 {
    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("Airbus", 2015, 50, 35);
        Airplane airplane2 = new Airplane("SuperJet", 2020, 55, 40);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}

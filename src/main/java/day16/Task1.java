package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Task1 {

    public static File file = new File("C:\\Java\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\java\\day16\\FileTask1");

    public static void main(String[] args) {
        printResult(file);
    }

    public static void printResult(File file) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Отсутствует файл");
        }
        int sum = 0;

        String number = Objects.requireNonNull(scanner).nextLine();
        String[] numbers = number.split(" ");

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + Integer.parseInt(numbers[i]);
        }
        double result = (double) sum / numbers.length;
        System.out.print(result + " --> ") ;
        System.out.printf("%.3f", result);
    }
}
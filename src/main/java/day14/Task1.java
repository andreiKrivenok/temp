package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static File file = new File("C:\\Java\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\java\\day14\\Test");

    public static void main(String[] args) {
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        int sum = 0;
        int count = 0;

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        while (scanner.hasNextInt()) {
            sum = sum + scanner.nextInt();
            count++;
        }
        if (count != 10) {
            throw new RuntimeException("Некорректный входной файл");
        }
        System.out.println(sum);
    }
}

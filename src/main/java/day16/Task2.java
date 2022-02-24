package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Task2 {
    public static File path1 = new File("C:\\Java\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\java\\day16\\file1.txt");
    public static File path2 = new File("C:\\Java\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\java\\day16\\file2.txt");

    public static void main(String[] args) {
        createFile1(path1);
        createFile2(path2);
        printResult(path2);
    }

    public static void createFile1(File file) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            System.out.println("файл для записи не обнаружен");
        }
        Random random = new Random();
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            printWriter.print(array[i] + " ");
        }
        printWriter.close();
    }

    public static void createFile2(File file) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(path1);
        } catch (FileNotFoundException e) {
            System.out.println("файл не обнаружен");
        }
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            System.out.println("файл не может быть записан");
        }
        List<String> numbers2 = new ArrayList<>();
        int sum = 0;
        int count = 0;
        String result = scanner.nextLine();
        String[] numbers = result.split(" ");
        for (int i = 0; i < numbers.length; i++) {
            count++;
            sum = sum + Integer.parseInt(numbers[i]);
            if (count % 20 == 0) {
                printWriter.print(sum / 20 + " ");
                sum = 0;
            }
        }
        printWriter.close();
    }

    public static void printResult(File file) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("файл не обнаружен");
        }
        String result = scanner.nextLine();
        String[] numbers = result.split(" ");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + Integer.parseInt(numbers[i]);
        }
        System.out.println(sum / numbers.length);
    }
}

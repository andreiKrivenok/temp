package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static File file = new File("C:\\Java\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\java\\day14\\people");

    public static void main(String[] args) {
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {

        List<String> peoples = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String peopleName = scanner.nextLine();
                String[] peopleInfo = peopleName.split(" ");
                if (Integer.parseInt(peopleInfo[1]) < 0) {
                    throw new PeopleException();
                }
                peoples.add(peopleName);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (PeopleException e) {
            System.out.println("Некорректный входной файл");
        }
        return peoples;
    }
}

package day14;

import day9.Task1.Human;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static File file = new File("C:\\Java\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\java\\day14\\people");

    public static void main(String[] args) {

        System.out.println(Arrays.toString(parseFileToObjList(file).toArray()));
    }

    public static List<Person> parseFileToObjList(File file) {

        List<Person> peoples = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String personName = scanner.nextLine();
                String[] personInfo = personName.split(" ");
                if (Integer.parseInt(personInfo[1]) < 0) {
                    throw new PeopleException();
                }
                Person newPerson = new Person(personInfo[0], Integer.parseInt(personInfo[1]));
                peoples.add(newPerson);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (PeopleException e) {
            System.out.println("Некорректный входной файл");
        }
        return peoples;
    }
}
package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {

    public static File path = new File("C:\\Java\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\shoes.csv");

    public static void main(String[] args)  {
        Scanner scanner = null;
        try {
            scanner = new Scanner(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        File file = new File("C:\\Java\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\java\\day15\\missing_shoes");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            String[] strArray = str.split(";");
            if (Integer.parseInt(strArray[2]) == 0 && strArray.length == 3) {
                pw.println(str);
            }
        }
        pw.close();
    }
}

//1. Вам дан файл с информацией об остатках обуви на складе (src/main/resources/shoes.csv).
//        Это пример реальной выгрузки остатков из 1С в csv файл (формат файла с разделителями,
//        в качестве разделителя использован символ “;”). В этом файле содержится информация о названии модели обуви,
//        ее размер и оставшееся на складе количество.
//        До преобразования в csv это была таблица с тремя колонками:
//
//        Название 						   Размер	   Кол-во
//        Ботинки HS РАН-Р 400 чер. ЗП			45		4
//        Ботинки PANDA САНИТАРИ 3916 S1 SRC бел.	37		1
//        ...
//        Необходимо сформировать новый файл (src/main/resources/missing_shoes.txt) с информацией о моделях и размерах обуви,
//        которой нет на складе (количество = 0). Для этого реализуйте программу, которая принимает на вход csv файл
//        и создает новый txt файл следующего содержания (должно получиться 11 строк):
//
//        Ботинки СВАРЩИК ут М.1398 ЗП, 40, 0
//        Ботинки СВАРЩИК ут М.1398 ЗП, 45, 0
//        Ботинки ТОФФ БЕРКУТ И с выс.берцами ут ч, 38, 0
//        ...
//
//        Возникающие исключения обрабатывать (try-catch), а не пробрасывать в сигнатуре метода (throws).
//        Учтите ситуацию, когда в файле может быть содержимое отличное от ожидаемого. В нашем случае файл один и он корректен,
//        но гипотетически может быть подан пустой файл или кол-во столбцов отличаться от трех.

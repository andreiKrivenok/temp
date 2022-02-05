package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Боб Марли", "Музыка");
        Student student = new Student("Вася Пупкин");

        teacher.evaluate(student.getStudentName());

    }
}

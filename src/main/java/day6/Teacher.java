package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String lesson;

    public Teacher(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }

    void evaluate(String studentName) {

        Random random = new Random();
        int grade = random.nextInt(4) + 2;
        String gradeName = "";
        switch (grade) {
            case 2:
                gradeName = "неудовлетворительно";
                break;
            case 3:
                gradeName = "удовлетворительно";
                break;
            case 4:
                gradeName = "хорошо";
                break;
            case 5:
                gradeName = "отлично";
                break;
        }
        System.out.printf("Преподаватель %s оценил студента с именем %s по" +
                " предмету %s на оценку %s.", name, studentName, lesson, gradeName);

    }
}

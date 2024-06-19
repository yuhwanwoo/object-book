package com.task.object.ch12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        다형성
        1. 오버로딩 다형성
        2. 강제 다형성
        3. 매개변수 다형성
        4. 포함 다형성

         */

        Lecture lecture = new Lecture("객체지향 프로그래밍",
                70,
                Arrays.asList(81, 95, 75, 50, 45));
        String evaluration = lecture.evaluate();
        Lecture lecture1 = new GradeLecture("객체지향 프로그래밍", 70, Arrays.asList(new Grade("A", 100, 97)), Arrays.asList(81, 95, 75, 50));
        lecture1.evaluate();

        Professor professor = new Professor("다익스트라", new Lecture("알고리즘", 70, Arrays.asList(81, 95, 75, 50, 45)));
        String statistics = professor.compileStatistics();

        Professor professor1 = new Professor("다익스트라", new GradeLecture("알고리즘", 70, Arrays.asList(new Grade("A", 100, 95), new Grade("B", 94, 80)), Arrays.asList(81, 95, 75, 50, 45)));
        String statistics1 = professor1.compileStatistics();

        // 다운 캐스팅
        Lecture lecture2 = new GradeLecture("객체지향 프로그래밍", 70, Arrays.asList(new Grade("A", 100, 97)), Arrays.asList(81, 95, 75, 50));
        GradeLecture gradeLecture = (GradeLecture) lecture2;

        /*
        GradeLecture의 메서드가 실행된다.
         */
        Lecture lecture3 = new GradeLecture("객체지향 프로그래밍", 70, Arrays.asList(new Grade("A", 100, 97)), Arrays.asList(81, 95, 75, 50));
        lecture3.evaluate();


    }
}

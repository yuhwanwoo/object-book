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
    }
}

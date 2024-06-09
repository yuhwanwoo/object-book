package com.task.object.ch10;

import java.time.Duration;

public class Main {
    /*
    DRY 원칙 : 모든 지식은 시스템 내에서 단일하고, 애매하지 않고, 정말로 믿을 만한 표현 양식을 가져야 한다.
    -> 핵심은 코드 안에 중복이 존재해서는 안 된다는 것.
     */

    public static void main(String[] args) {
        RegularPhone regularPhone = new RegularPhone(Money.wons(5), Duration.ofSeconds(10), 1.1);

        regularPhone.calculateFee();
    }
}

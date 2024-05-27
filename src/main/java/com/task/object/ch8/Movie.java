package com.task.object.ch8;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

/*
컴파일 의존성과
런타임 의존성
 */
public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
//        this.discountPolicy = new AmountDiscountPolicy(); // 안좋은 예시
//        this.discountPolicy = new AmountDiscountPolicy(
//                Money.wons(800), new SequenceCondition(1), new SequenceCondition(2),
//                new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59))
//        ); // 안좋은 예시 -> Movie 클래스가 알아야 하는 지식의 양이 늘어난다.

    }

    public Money calculateMovieFee(Screening screening) {
        return null;
    }
}

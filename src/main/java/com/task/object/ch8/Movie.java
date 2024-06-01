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
        /*
        if (discountPolicy == null) {
            return fee;
        }
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
        이렇게 내부 코드를 직접 수정하는 것은 버그의 발생 가능성을 높인다

        -> 할인 정책이 존재하지 않는다는 사실을 하나의 정책으로 정의한다. NoneDiscountPolicy

         */
        return null;
    }
}

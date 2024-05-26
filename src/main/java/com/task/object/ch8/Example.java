package com.task.object.ch8;

import java.time.Duration;

public class Example {
    public static void main(String[] args) {
        Movie avatar = new Movie("아바타", Duration.ofMinutes(120), Money.wons(10000), new AmountDiscountPolicy());
        Movie starWars = new Movie("스타워즈", Duration.ofMinutes(180), Money.wons(11000), new PercentDiscountPolicy());
    }
}

package com.task.object.ch9;

public class AmountDiscountPolicy extends DiscountPolicy {

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return null;
    }
}

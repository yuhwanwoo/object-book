package com.task.object.ch11;

public class RegularPhone extends Phone {
    @Override
    protected Money calculateCallFee(Call call) {
        return null;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return null;
    }
}

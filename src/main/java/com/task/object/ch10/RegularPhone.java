package com.task.object.ch10;

import java.time.Duration;

public class RegularPhone extends Phone {

    private static final int LATE_NIGHT_HOUR = 22;

    enum PhoneType {REGULAR, NIGHTLY,}

    private PhoneType type;

    private Money amount;
    private Money regularAmount;
    private Money nightlyAmount;
    private Duration seconds;

    public RegularPhone(Money amount, Duration seconds, double taxRate) {
        super(taxRate);
        this.amount = amount;
        this.seconds = seconds;
    }

    public Money getAmount() {
        return amount;
    }

    public Duration getSeconds() {
        return seconds;
    }

    @Override
    public Money calculateCallFee(Call call) {
        return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}

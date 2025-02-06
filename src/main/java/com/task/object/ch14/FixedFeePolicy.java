package com.task.object.ch14;


import java.time.Duration;

public class FixedFeePolicy extends BasicRatePolicy {
    private Money amount;
    private Duration seconds;

    @Override
    protected Money calculateCallFee(Call call) {
        return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}

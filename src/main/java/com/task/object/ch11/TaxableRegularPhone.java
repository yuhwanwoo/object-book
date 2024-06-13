package com.task.object.ch11;

public class TaxableRegularPhone extends RegularPhone {
    private double taxRate;



    @Override
    protected Money afterCalculated(Money fee) {
        return fee.plus(fee.times(taxRate));
    }
}

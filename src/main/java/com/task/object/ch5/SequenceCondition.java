package com.task.object.ch5;

public class SequenceCondition implements DiscountCondition{
    private int sequence;
    private DiscountConditionType type;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    public boolean isSatisfiedBy(Screening screening) {
        return sequence == screening.getSequence();
    }

    @Override
    public DiscountConditionType getType() {
        return type;
    }
}

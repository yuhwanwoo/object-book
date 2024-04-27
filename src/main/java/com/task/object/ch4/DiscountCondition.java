package com.task.object.ch4;

import com.task.object.ch2.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}

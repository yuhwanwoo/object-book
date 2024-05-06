package com.task.object.ch5;

public class ReservationAgency {
    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
        boolean discountable = checkDiscountable(screening);
        Money fee = calculateFee(screening, discountable, audienceCount);
        return createReservation(screening, customer, audienceCount, fee);
    }

    private boolean checkDiscountable(Screening screening) {
        return screening.getMovie().getDiscountConditions().stream()
                .anyMatch(condition -> condition.isDiscountable(screening));
    }


    private boolean isSatisfiedByPeriod(DiscountCondition condition, Screening screening) {
        return false;
    }

    private Reservation createReservation(Screening screening, Customer customer, int audienceCount, Money fee) {
        return null;
    }

    private Money calculateFee(Screening screening, boolean discountable, int audienceCount) {
        return null;
    }
}

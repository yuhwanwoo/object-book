package com.task.object.ch8;

import com.task.object.ch5.Customer;
import com.task.object.ch5.Money;
import com.task.object.ch5.Movie;
import com.task.object.ch5.Reservation;

import java.time.LocalDateTime;

public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    private Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }

    public int getSequence() {
        return sequence;
    }

    public Movie getMovie() {
        return movie;
    }

    public LocalDateTime getWhenScreened() {
        return whenScreened;
    }
}

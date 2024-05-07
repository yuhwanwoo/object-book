package com.task.object.ch6;

public class Bag {
    private Invitation invitation;
    private Ticket ticket;
    private Long amount;
    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            this.ticket = ticket;
            return 0L;
        } else {
            this.ticket = ticket;
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    private boolean hasInvitation() {
        return invitation != null;
    }
}

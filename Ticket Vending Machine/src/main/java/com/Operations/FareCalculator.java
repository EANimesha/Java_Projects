package com.Operations;

import com.TicketCounter.Ticket;

public class FareCalculator implements Operation {

    double ticket_price=100.0;
    double fare;


    @Override
    public void perform(Ticket ticket) {
            System.out.println("Fare amount is : ");
            fare=ticket.getPassenger()*ticket_price;
            System.out.println(fare);
            ticket.setFare(fare);
    }
}

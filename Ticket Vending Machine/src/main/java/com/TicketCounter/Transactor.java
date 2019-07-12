package com.TicketCounter;

import com.InputRepository.Frontpanel;
import com.InputRepository.Input;
import com.Operations.FareCalculator;
import com.Operations.Operation;

public class Transactor implements TicketTransactor {

    double cashdeposited;
    double balance;
    public void generateRequest(){
        Requistionslip slip=new Requistionslip();
        Input input=new Frontpanel();
        slip=input.get(slip);

        Ticket ticket=new Ticket();

        ticket.setStartingPlace(slip.getStartingPlace());
        ticket.setDestinationPlace(slip.getDestinationPlace());
        ticket.setPassenger(slip.getPassenger());

        Operation fareOperation=new FareCalculator();
        fareOperation.perform(ticket);

        this.cashdeposited=input.getCash();
        this.balance=cashdeposited-ticket.getFare();
    }

}

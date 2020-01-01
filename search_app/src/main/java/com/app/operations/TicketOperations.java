package com.app.operations;

import com.app.models.Ticket;
import com.app.repository.JsonDataRepository;
import com.app.repository.Repository;

public class TicketOperations {
    public String perform(String term,String value) {
        Repository repository = new JsonDataRepository();
        Ticket ticket = repository.getTicket(term,value);


        String result=ticket.toString();

        return result;
    }
}

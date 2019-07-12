package com;


import com.TicketCounter.TicketTransactor;
import com.TicketCounter.Transactor;

public class Main {

    public static void main(String[] args) {
        TicketTransactor transactor=new Transactor();
        transactor.generateRequest();
    }
}

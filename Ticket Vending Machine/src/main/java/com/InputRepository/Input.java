package com.InputRepository;

import com.TicketCounter.Requistionslip;

public interface Input {
    public Requistionslip get(Requistionslip slip);
    public double getCash();
}

package com.InputRepository;

import com.TicketCounter.Requistionslip;

import java.util.Scanner;

public class Frontpanel implements Input {
    Scanner scanner = new Scanner(System.in);


    @Override
    public Requistionslip get(Requistionslip slip) {
        System.out.println("Enter boarding place: ");
        String boarding_place = scanner.nextLine();
        slip.setStartingPlace(boarding_place);

        System.out.println("Enter destination place: ");
        String destination_place = scanner.nextLine();
        slip.setDestinationPlace(destination_place);

        System.out.println("Enter no of passengers: ");
        int passengers = scanner.nextInt();
        slip.setPassenger(passengers);

        System.out.println("Enter date of travel: ");

        return slip;
    }

    @Override
    public double getCash() {
        System.out.println("Enter cash deposit for the ticket: ");
        double cashdeposit=scanner.nextDouble();
        return cashdeposit;
    }
}

package com.app;


import com.app.operations.OrganizationOperations;
import com.app.operations.TicketOperations;
import com.app.operations.UserOperations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        InputScreen inputScreen=new InputScreen();
        inputScreen.run();

        String term=inputScreen.getTerm();
        String value=inputScreen.getValue();
        int type=inputScreen.getType();

        if(type==1){
            UserOperations userOperations=new UserOperations();
            String result=userOperations.perform(term,value);
            System.out.println(result);
        }
        else if(type==2){
            TicketOperations ticketOperations=new TicketOperations();
            String result=ticketOperations.perform(term,value);
            System.out.println(result);
        }
        else if(type==3){
            OrganizationOperations organizationOperations=new OrganizationOperations();
            String result=organizationOperations.perform(term,value);
            System.out.println(result);
        }
        else {
            System.out.println("invalid input");
        }

    }
}

package com.app;


import com.app.operations.TicketOperations;
import com.app.operations.UserOperations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        int type;
        String term;
        Scanner in = new Scanner(System.in);
        System.out.println("press1 to search");
        System.out.println("1) user 2-ticket 3- organization");
        type=in.nextInt();
        System.out.println("Enter search Term");
        term=in.next();
        System.out.println("Enter search Value");
        Scanner in1 = new Scanner(System.in);
        String value=in1.nextLine();


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

        }
        else {
            System.out.println("invalid input");
        }

    }
}

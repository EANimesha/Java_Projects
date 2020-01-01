package com.app.operations;

import com.app.models.Organization;
import com.app.models.Ticket;
import com.app.models.User;
import com.app.repository.JsonDataRepository;
import com.app.repository.Repository;

import java.util.List;

public class UserOperations {
    public String perform(String term,String value) {
        int i=0;
        Repository repository = new JsonDataRepository();
        User user = repository.getUser(term,value);

        //get corresponding organization details
        Organization organization=repository.getOrganization("_id",String.valueOf(user.getOrganization_id()));


        String result=user.toString()+"organization_name = "+organization.getName()+"\n";

//        get corresponding ticket details
        List<Ticket> tickets=repository.getTickets("submitter_id",String.valueOf(user.get_id()));

        for(Ticket ticket : tickets){
           result=result+"ticket"+(i++)+" = "+ticket.getSubject()+"\n";
        }

        Ticket ticket=repository.getTicket("submitter_id","71");
        System.out.println(ticket.getName());
        return result;
    }
}

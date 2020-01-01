package com.app.repository;

import com.app.models.Organization;
import com.app.models.Ticket;
import com.app.models.User;
import com.google.gson.JsonObject;

import java.util.List;

public interface Repository {
    User getUser(String term,String value);
    Ticket getTicket(String term,String value);
    Organization getOrganization(String term,String value);

    List<User> getUsers(String term,String value);
    List<Ticket> getTickets(String term,String value);
    List<Organization> getOrganizations(String term,String value);

}

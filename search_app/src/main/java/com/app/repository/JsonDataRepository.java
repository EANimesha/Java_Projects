package com.app.repository;

import com.app.models.Organization;
import com.app.models.Ticket;
import com.app.models.User;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JsonDataRepository implements Repository {
    ArrayList<JsonObject> userList;
    ArrayList<JsonObject> ticketsList;
    ArrayList<JsonObject> organizationsList;

    Gson gson=new Gson();

    String userData;
    String ticketsData;

    {
        try {
            userData = new String(Files.readAllBytes(Paths.get("D:\\Java\\Java_Projects\\search_app\\src\\main\\resources\\JsonStore\\users.json")));
            Type listType = new TypeToken<ArrayList<JsonObject>>(){}.getType();
             userList= gson.fromJson(userData, listType);

            ticketsData=new String(Files.readAllBytes(Paths.get("D:\\Java\\Java_Projects\\search_app\\src\\main\\resources\\JsonStore\\tickets.json")));
            Type ticketsType = new TypeToken<ArrayList<JsonObject>>(){}.getType();
            ticketsList = gson.fromJson(ticketsData, ticketsType);

            String organizationsData=new String(Files.readAllBytes(Paths.get("D:\\Java\\Java_Projects\\search_app\\src\\main\\resources\\JsonStore\\organizations.json")));
            Type organizationsType = new TypeToken<ArrayList<JsonObject>>(){}.getType();
            organizationsList = gson.fromJson(organizationsData, organizationsType);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User getUser(String term, String value) {
        User u=null;
        for (JsonObject item : userList) {
            if (item.get(term).getAsString().equals(value)) {
                 u= gson.fromJson(item, User.class);
                 break;
            }
        }
        return u;
    }

    @Override
    public Ticket getTicket(String term, String value) {
        Ticket ticket=null;
        for (JsonObject item :ticketsList ) {
            if (item.get(term).getAsString().equals(value)) {
                ticket= gson.fromJson(item, Ticket.class);
                break;
            }
        }
        return ticket;
    }

    @Override
    public Organization getOrganization(String term, String value) {
        Organization org=null;
        for (JsonObject item :organizationsList ) {
            if (item.get(term).getAsString().equals(value)) {
                org= gson.fromJson(item, Organization.class);
                break;
            }
        }
        return org;
    }

    @Override
    public List<User> getUsers(String term, String value) {
        return null;
    }

    @Override
    public List<Ticket> getTickets(String term, String value) {
        List<Ticket> list = new ArrayList();
        for (JsonObject item : ticketsList ) {
            if (item.get(term).getAsString().equals(value)) {
                list.add(gson.fromJson(item, Ticket.class));
            }
        }
        return list;
    }

    @Override
    public List<Organization> getOrganizations(String term, String value) {
        return null;
    }
}

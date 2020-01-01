package com.app;

import com.app.models.Organization;
import com.app.models.Ticket;
import com.app.models.User;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.jaunt.JNode;
import com.jaunt.UserAgent;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws IOException {

        Gson gson=new Gson();

        String userData=new String(Files.readAllBytes(Paths.get("D:\\Java\\Java_Projects\\search_app\\src\\main\\resources\\JsonStore\\users.json")));
        Type listType = new TypeToken<ArrayList<JsonObject>>(){}.getType();
        ArrayList<JsonObject> userList = gson.fromJson(userData, listType);



        String ticketsData=new String(Files.readAllBytes(Paths.get("D:\\Java\\Java_Projects\\search_app\\src\\main\\resources\\JsonStore\\tickets.json")));
        Type ticketsType = new TypeToken<ArrayList<JsonObject>>(){}.getType();
        ArrayList<JsonObject> ticketsList = gson.fromJson(ticketsData, ticketsType);

        String organizationsData=new String(Files.readAllBytes(Paths.get("D:\\Java\\Java_Projects\\search_app\\src\\main\\resources\\JsonStore\\organizations.json")));
        Type organizationsType = new TypeToken<ArrayList<JsonObject>>(){}.getType();
        ArrayList<JsonObject> organizationsList = gson.fromJson(organizationsData, organizationsType);


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
            for(JsonObject item : userList) {
//                System.out.println(user.get("_id"));
                if(item.get(term).getAsString().equals(value)){
                    User u=gson.fromJson(item,User.class);
                    System.out.println(u.toString());
                    break;
                }
            }

        }else if(type==2){
            for(JsonObject item : ticketsList) {
                if(item.get(term).getAsString().equals(value)){
                    Ticket t=gson.fromJson(item,Ticket.class);
                    System.out.println(t.toString());
                    break;
                }
            }
        }else if(type==3){
            for(JsonObject item : organizationsList) {
                if(item.get(term).getAsString().equals(value)){
                    Organization o=gson.fromJson(item,Organization.class);
                    System.out.println(o.toString());
                    break;
                }
            }
        }



    }
}

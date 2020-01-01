package com.app;

import com.app.models.User;
import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args)  throws IOException {

        Gson gson=new Gson();
        String userData=new String(Files.readAllBytes(Paths.get("D:\\Java\\Java_Projects\\search_app\\src\\main\\resources\\JsonStore\\users.json")));

        User[] userArray= gson.fromJson(userData,User[].class);
//        for(User user : userArray) {
//            System.out.println(user.toString());
//        }
    }
}

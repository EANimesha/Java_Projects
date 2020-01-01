package com.app;

import java.util.Scanner;

public class InputScreen {
    private int type;
    private String term;
    private String value;
    Scanner in = new Scanner(System.in);
    Scanner in1 = new Scanner(System.in);

    void run(){
        System.out.println("press 1 to search");
        System.out.println("1- user 2-ticket 3- organization");
        type=in.nextInt();
        System.out.println("Enter search Term");
        term=in.next();
        System.out.println("Enter search Value");
        value=in1.nextLine();
    }

    public int getType() {
        return type;
    }

    public String getTerm() {
        return term;
    }

    public String getValue() {
        return value;
    }
}

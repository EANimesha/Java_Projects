package com.Outputs;

public class ConsoleOutput implements Output {

    @Override
    public void show(int text) {
        System.out.println(text);
    }
}

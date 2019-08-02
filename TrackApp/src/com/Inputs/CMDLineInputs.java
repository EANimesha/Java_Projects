package com.Inputs;

public class CMDLineInputs implements Input{
    private String arguments[];

    public CMDLineInputs(String[] arguments) {
        this.arguments = arguments;
    }

    @Override
    public String read() {
        return this.arguments[0];
    }
}

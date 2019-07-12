package com.group;

import com.group.output.GUIOutput.GUIOutput;
import com.group.output.Output;
import com.group.output.OutputFactory;
import com.group.repository.Repository;
import com.group.repository.SqlMatchDetailRepository;

import javax.swing.*;

public class CricketBoardApp {
    public JPanel go(String userInput, String userSelection){
        //validation
        JPanel panel = null;
        Repository repository = new SqlMatchDetailRepository();

        OutputFactory selectedDisplayFactory = new OutputFactory();
        Output output = selectedDisplayFactory.getInstance(userSelection);

        panel = output.show(userInput,repository);
        return panel;
    }
}

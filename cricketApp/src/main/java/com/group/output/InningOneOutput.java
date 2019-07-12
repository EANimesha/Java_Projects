package com.group.output;

import com.group.repository.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class InningOneOutput implements Output {
    public JPanel show(String userInput,Repository repository){
        MatchDetails matchDetails = repository.getMatch(userInput);
        String countryBattingCode = matchDetails.getCountryOne();
        String countryBowlingCode = matchDetails.getCountryTwo();
        String countryBattingName = repository.getCountry(countryBattingCode);
        String countryBowlingName = repository.getCountry(countryBowlingCode);
        List<BattingDetail> battingDetails = repository.getBatting(userInput,countryBattingCode);
        List<BowlingDetails> bowlingDetails = repository.getBowling(userInput,countryBowlingCode);


        String[] battingColumn = {"Name","runs","balls", "4s", "6s"};
        DefaultTableModel battingTableModel = new DefaultTableModel(battingColumn, 0);
        for (int i=0;i<battingDetails.size();i++){
            Object[] battingRow = new Object[5];
            battingRow[0] = repository.getPlayer(battingDetails.get(i).getPlayerId());
            battingRow[1] = battingDetails.get(i).getRuns();
            battingRow[2] = battingDetails.get(i).getBalls();
            battingRow[3] = battingDetails.get(i).getFours();
            battingRow[4] = battingDetails.get(i).getSixs();
            battingTableModel.addRow(battingRow);
        }

        String[] bowlingColumn = {"Name","overs","runs", "wickets"};
        DefaultTableModel bowlingTableModel = new DefaultTableModel(bowlingColumn, 0);
        for (int i=0;i<bowlingDetails.size();i++){
            Object[] bowlingRow = new Object[4];
            bowlingRow[0] = repository.getPlayer(bowlingDetails.get(i).getPlayerId());
            bowlingRow[1] = bowlingDetails.get(i).getOvers();
            bowlingRow[2] = bowlingDetails.get(i).getMarks();
            bowlingRow[3] = bowlingDetails.get(i).getWicket();
            bowlingTableModel.addRow(bowlingRow);
        }


        JTable battingTable = new JTable(battingTableModel);
        JScrollPane battingTableSp=new JScrollPane(battingTable);
        battingTableSp.setBorder(BorderFactory.createTitledBorder (countryBattingName+"         Batting Details"));
        JTable bowlingTable = new JTable(bowlingTableModel);
        JScrollPane bowlingTableSp=new JScrollPane(bowlingTable);
        bowlingTableSp.setBorder(BorderFactory.createTitledBorder (countryBowlingName+"         Bowling Details"));
        JPanel main = new JPanel();
        main.add(battingTableSp);
        main.add(bowlingTableSp);
        return main;
    }
}

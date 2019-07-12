package com.group.output;

import com.group.repository.MatchDetails;
import com.group.repository.Repository;
import com.group.repository.SqlMatchDetailRepository;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OverviewOutputTest {
    @Test
    public void testCase1() {
        Repository repository = mock(SqlMatchDetailRepository.class);

        MatchDetails matchDetails=new MatchDetails();
        matchDetails.setDate("2019/02/10");
        matchDetails.setCountryOne("Austraila");
        matchDetails.setCountryTwo("sl");
        matchDetails.setWinningCountry("Srilanka");
        matchDetails.setManOfTheMatch("M.perera");

        when(repository.getMatch("M000001")).thenReturn(matchDetails);

        OverviewOutput overviewOutput=new OverviewOutput();
        JPanel pane1=overviewOutput.show("M000001",repository);


    }

}
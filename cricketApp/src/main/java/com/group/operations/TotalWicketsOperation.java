package com.group.operations;

import com.group.repository.BowlingDetails;
import com.group.repository.Repository;
import com.group.repository.SqlMatchDetailRepository;

import java.util.List;

public class TotalWicketsOperation implements Operation{
    public int perform(String matchId, String countryId){
        int wickets = 0;
        Repository repository=new SqlMatchDetailRepository();
        List<BowlingDetails> ballingDetails = repository.getBowling(matchId,countryId);
        for (int i = 0; i <ballingDetails.size() ; i++) {
            wickets+=ballingDetails.get(i).getWicket();
        }
        return wickets;
    }
}

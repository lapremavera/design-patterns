package com.realdolmen.ood020.adapter;

public class VotingSystem {

    public boolean canVote(HasAge hasAge){
        return hasAge.getAge()>=18;
    }
}

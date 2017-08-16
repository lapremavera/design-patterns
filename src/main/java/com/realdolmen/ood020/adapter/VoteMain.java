package com.realdolmen.ood020.adapter;

import java.time.LocalDate;
import java.time.Month;

public class VoteMain {

    public static void main(String[] args) {
        Person person = new Person(LocalDate.of(1980, Month.DECEMBER,12));

        VotingSystem votingSystem = new VotingSystem();
        System.out.println(votingSystem.canVote(new AgeAdapter(person)));


    }
}

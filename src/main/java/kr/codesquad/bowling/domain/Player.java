package kr.codesquad.bowling.domain;

import java.util.ArrayList;

public class Player {

    private String name;
    private int points;
    private int currentRound;

    private ArrayList<Round> rounds;

    public Player(String name){
        this.name = name;
    }

    public void addRound(Round round){
        if (rounds == null){
            rounds = new ArrayList<>();
        }

        rounds.add(round);
    }




}

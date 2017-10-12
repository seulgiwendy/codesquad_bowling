package kr.codesquad.bowling.domain;

import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players = new ArrayList<>(2);
    private ArrayList<Round> rounds = new ArrayList<>(10);

    public Game(ArrayList<Player> players){
        this.players = players;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }


    public void setPlayers(Player player){
        players.add(player);
    }

    public void addRound(Round round){
        rounds.add(round);
    }




}

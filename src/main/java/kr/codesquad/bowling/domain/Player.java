package kr.codesquad.bowling.domain;

import kr.codesquad.bowling.exceptions.UsernameFormatException;

import java.util.ArrayList;

public class Player {

    private String name;
    private int points;
    private int currentRound;

    private ArrayList<Round> rounds;

    public Player(String name){
        if (name.length() > 3){
            throw new UsernameFormatException(UsernameFormatException.STANDARD_USERNAME_ERROR_MSG);
        }
        this.name = name;
    }

    public void addRound(Round round){
        if (rounds == null){
            rounds = new ArrayList<>();
        }

        rounds.add(round);
    }

    public String getName(){
        return this.name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;

        Player player = (Player) o;

        return name != null ? name.equals(player.name) : player.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}

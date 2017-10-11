package kr.codesquad.bowling.model;

import kr.codesquad.bowling.domain.Game;

public class ScoreboardDisplayer {

    private Game game;

    private ScoreboardDisplayer(Game game){

        this.game = game;

    }

    public static ScoreboardDisplayer getInstance(Game game){
        ScoreboardDisplayer sbd = null;

        if (sbd == null){
            sbd = new ScoreboardDisplayer(game);
        }

        return sbd;

    }

    public void display(){


    }
}

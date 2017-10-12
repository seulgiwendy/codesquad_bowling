package kr.codesquad.bowling.model;

import kr.codesquad.bowling.domain.Game;
import kr.codesquad.bowling.domain.Player;

public class ScoreboardDisplayer {

    private Game game;

    public ScoreboardDisplayer(){

    }

    public void setGame(Game game){
        this.game = game;
    }



    public void display(){

        System.out.println("| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |");
        for (Player player : this.game.getPlayers()){
            System.out.printf("| %s |      |      |      |      |      |      |      |      |      |      |", player.getName());
        }
    }
}

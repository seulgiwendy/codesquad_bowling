package kr.codesquad.bowling.model;

import kr.codesquad.bowling.domain.Game;

public class GameRunner {




    public static void main (String args[]){

        Game game;

        GameInitializer gi = GameInitializer.getInstance();

        try {
            gi.init();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        game = gi.startGame();

        while(true){
            ScoreboardDisplayer sbd = new ScoreboardDisplayer();
            sbd.setGame(game);
            sbd.display();

            
        }

    }
}

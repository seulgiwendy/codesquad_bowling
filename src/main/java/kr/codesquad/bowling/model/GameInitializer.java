package kr.codesquad.bowling.model;

import kr.codesquad.bowling.domain.Game;
import kr.codesquad.bowling.domain.Player;
import kr.codesquad.bowling.exceptions.PlayerNumberExceedException;
import kr.codesquad.bowling.exceptions.UsernameFormatException;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class GameInitializer {

    Scanner scn = new Scanner(System.in);
    int count = 0;
    private ArrayList<Player> players = new ArrayList<>();

    private GameInitializer(){

    }

    public static GameInitializer getInstance(){
        GameInitializer gi = null;
        if (gi == null){
            gi = new GameInitializer();
        }
        return gi;
    }

    public void getPlayerCount(){
        System.out.println("How Many People?");
        this.count = scn.nextInt();
        if (this.count < 1 || this.count > 2){
            throw new PlayerNumberExceedException(PlayerNumberExceedException.STANDARD_NUMBER_ERR_MSG);
        }
        scn.close();
    }

    public void getPlayers(){
        for (int i = 0; i < this.count; i++){
            Scanner scan = new Scanner(System.in);
            System.out.println("플레이어 " + (i + 1) + "의 이름은? (영문 3글자):");
            String name = scan.nextLine();
            if(name.length() > 3){
                throw new UsernameFormatException(UsernameFormatException.STANDARD_USERNAME_ERROR_MSG);
            }
            this.players.add(new Player(name));
            scan.close();

        }
    }

    public ArrayList<Player> getPlayersList(){
        return this.players;
    }

    public void init(){
        getPlayerCount();
        getPlayers();
    }

    public Game startGame(){
        if(this.players.size() == 0 || this.players.size() != this.count){
            throw new PlayerNumberExceedException(PlayerNumberExceedException.STANDARD_NUMBER_ERR_MSG);
        }
        return new Game(this.players);
    }

}

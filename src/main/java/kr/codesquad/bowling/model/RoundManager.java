package kr.codesquad.bowling.model;

import kr.codesquad.bowling.domain.Attempt;
import kr.codesquad.bowling.domain.Player;
import kr.codesquad.bowling.domain.Round;

import java.util.ArrayList;
import java.util.Scanner;

public class RoundManager {
    private Round round;
    private Player player;
    private ArrayList<Attempt> attempts;


    private RoundManager(){

    }

    public static RoundManager getInstance(Player player){
        RoundManager rm = null;

        if (rm == null){
            rm = new RoundManager();
            rm.setPlayer(player);
        }

        if (rm.getPlayer().equals(player) == false){
            rm.setPlayer(player);
        }
        return rm;
    }

    public void setPlayer(Player p){
        this.player = p;
    }

    public Player getPlayer(){
        return this.player;
    }

    public void play(){
        this.round = new Round();
        Scanner scn = new Scanner(System.in);
        System.out.println(this.player.getName() + "'s turn");
        Attempt thrownBall = new Attempt(scn.nextInt());
        this.round.outPins(thrownBall);
    }




}

package kr.codesquad.bowling.model;

import kr.codesquad.bowling.domain.Attempt;
import kr.codesquad.bowling.domain.Player;

import java.util.Scanner;

public class FramePrompter {

    private Player player;

    public FramePrompter(Player player){
        this.player = player;
    }

    public Attempt makeNewAttempt(){
        Scanner scn = new Scanner(System.in);
        System.out.println();
        return new Attempt(scn.nextInt());
    }

}

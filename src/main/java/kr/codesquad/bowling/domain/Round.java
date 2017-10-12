package kr.codesquad.bowling.domain;

import kr.codesquad.bowling.model.StrikeSpareDecider;

public class Round {

    private int pins = 10;
    private int attempt = 1;
    private int point = 0;
    private Player player;
    private StrikeSpareDecider.Types type;

    StrikeSpareDecider ssd = StrikeSpareDecider.getInstance();

    public void outPins(Attempt attempt){
        type = ssd.decideType(attempt.getPins());
        this.pins -= attempt.getPins();
        this.attempt++;
        this.point += attempt.getPins();
    }

    public void setSpare(){
        if (this.attempt == 2 && this.pins == 0){
            this.type = StrikeSpareDecider.Types.SPARE;
        }
    }

    public boolean isFinished(){
        return pins == 0;
    }

    public StrikeSpareDecider.Types getType(){
        return this.type;
    }

    public void addSparePoint(Attempt attempt){
        if (this.type != StrikeSpareDecider.Types.SPARE){
            return;
        }
        this.point += attempt.getPins();
    }

    public int getPoint(){
        return this.point;
    }

    public int getAttempt(){
        return this.attempt;
    }




}

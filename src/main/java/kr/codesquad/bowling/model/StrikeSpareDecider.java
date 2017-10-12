package kr.codesquad.bowling.model;

import kr.codesquad.bowling.domain.Round;

import java.lang.reflect.Type;

public class StrikeSpareDecider {

    public enum Types{
        STRIKE, SPARE, NORMAL
    }

    private StrikeSpareDecider(){

    }

    public static StrikeSpareDecider getInstance(){
        StrikeSpareDecider ssd = null;

        if (ssd == null){
            ssd = new StrikeSpareDecider();
        }
        return ssd;
    }

    public Types decideType(int pins){
        if (pins == 10){
            return Types.STRIKE;
        }

        return Types.NORMAL;
    }

    public Types decideSpare(Round round){
        if (round.getPoint() == 10 && round.getAttempt() == 2){
            return Types.SPARE;
        }

        return Types.NORMAL;

    }



}

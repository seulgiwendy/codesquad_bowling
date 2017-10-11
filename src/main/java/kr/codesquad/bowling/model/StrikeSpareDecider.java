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

    public static Types decideType(int pins){
        if (pins == 10){
            return Types.STRIKE;
        }

        return Types.NORMAL;
    }

    public static Types decideSpare(Round round){
        return null;
    }



}

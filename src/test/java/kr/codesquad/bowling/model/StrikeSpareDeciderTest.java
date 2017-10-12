package kr.codesquad.bowling.model;

import kr.codesquad.bowling.domain.Game;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrikeSpareDeciderTest {

    Game game;
    StrikeSpareDecider ssd;

    @Before
    public void setup(){

        ssd = StrikeSpareDecider.getInstance();

    }

    @Test
    public void test(){

        assertEquals(StrikeSpareDecider.Types.STRIKE, ssd.decideType(10));

    }

}
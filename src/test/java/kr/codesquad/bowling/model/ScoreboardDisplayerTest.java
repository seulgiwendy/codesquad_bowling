package kr.codesquad.bowling.model;

import kr.codesquad.bowling.domain.Game;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScoreboardDisplayerTest {

    @Test
    public void test(){
        ScoreboardDisplayer sbd = ScoreboardDisplayer.getInstance(new Game());
        assertTrue(sbd instanceof ScoreboardDisplayer);
    }

}
package kr.codesquad.bowling.model;

import kr.codesquad.bowling.domain.Game;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameInitializerTest {

    @Test
    public void test(){
        GameInitializer game = GameInitializer.getInstance();
        game.init();
    }

}
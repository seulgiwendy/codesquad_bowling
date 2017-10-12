package kr.codesquad.bowling.exceptions;

public class PlayerNumberExceedException extends RuntimeException{
    public static final String STANDARD_NUMBER_ERR_MSG = "두 명까지만 입력할 수 있습니다.";

    public PlayerNumberExceedException(String message){
        super(message);
    }
}

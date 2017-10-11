package com.codesquad.bowling.exceptions;

public class MaxPointExceedException extends RuntimeException {

    public static final String STANDARD_POINT_ERROR_MSG = "한 번에 득점한 점수는 10을 초과할 수 없습니다(10:스트라이크)";
    public MaxPointExceedException(String message){
        super(message);
    }
}

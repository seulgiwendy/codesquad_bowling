package com.codesquad.bowling.exceptions;

public class UsernameFormatException extends RuntimeException{

    public static final String STANDARD_USERNAME_ERROR_MSG = "이름은 영문 이니셜 3글자로 입력해야 합니다(대소문자 무관)";

    public UsernameFormatException(String message){
        super(message);
    }
}

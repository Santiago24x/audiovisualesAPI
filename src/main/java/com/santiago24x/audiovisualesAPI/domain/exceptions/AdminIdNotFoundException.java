package com.santiago24x.audiovisualesAPI.domain.exceptions;

public class AdminIdNotFoundException extends RuntimeException {

    public AdminIdNotFoundException(String message){
        super(message);
    }
}
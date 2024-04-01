package com.santiago24x.audiovisualesAPI.domain.exceptions;


public class AdminNotFoundException extends RuntimeException{

    public AdminNotFoundException(String message){
        super(message);
    }
}